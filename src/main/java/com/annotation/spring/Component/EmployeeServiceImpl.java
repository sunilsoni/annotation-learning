package com.annotation.spring.Component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDaoImpl;

    @Override
    public void addEmployee(final Employee employee) {
        employeeDaoImpl.addEmployee(employee);
    }

    @Override
    public List<Employee> getListEmployee() {
        return employeeDaoImpl.getListEmployee();
    }

    @Override
    public Employee getEmployee(final String empid) {
        return employeeDaoImpl.getEmployee(empid);
    }

    @Override
    public void deleteEmployee(final String empid) {
        employeeDaoImpl.deleteEmployee(empid);
    }

    @Override
    public Employee updateEmployee(final Employee employee) {
        return employeeDaoImpl.updateEmployee(employee);
    }

    @Component
    public static class EmployeeInnerBean {


    }
}
