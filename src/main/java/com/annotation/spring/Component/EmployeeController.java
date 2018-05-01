package com.annotation.spring.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    @RequestMapping(value = "/employee", method = RequestMethod.POST)

    public String createEmployee(@RequestBody final EmployeeBean employeeBean) {
        final Employee employee = prepareModel(employeeBean);
        employeeServiceImpl.addEmployee(employee);
        return "Created 201";
    }

    @RequestMapping(value = "/employee/{empid}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable("empid") final String empid) {
        return employeeServiceImpl.getEmployee(empid);

    }

    @RequestMapping(value = "/employee/update", method = RequestMethod.PUT)

    public Employee updateEmployee(@RequestBody final EmployeeBean employeeBean) {
        final Employee employee = prepareModel(employeeBean);
        return employeeServiceImpl.updateEmployee(employee);
    }

    @RequestMapping(value = "/employee/delete/{empid}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("empid") final String empid) {
        employeeServiceImpl.deleteEmployee(empid);
        return "200 Deleted";
    }

    @RequestMapping(value = "/employee/getall", method = RequestMethod.GET)
    public @ResponseBody
    List<Employee> getallEmployee() {
        return employeeServiceImpl.getListEmployee();
    }

    private Employee prepareModel(final EmployeeBean employeeBean) {
        final Employee employee = new Employee();
        employee.setId(employeeBean.getId());
        employee.setName(employeeBean.getName());
        employee.setAddress(employeeBean.getAddress());
        employee.setSalary(employeeBean.getSalary());
        employee.setAge(employeeBean.getAge());
        return employee;
    }

}