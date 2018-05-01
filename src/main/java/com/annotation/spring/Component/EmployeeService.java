package com.annotation.spring.Component;

import java.util.List;

public interface EmployeeService {

    public void addEmployee(Employee employee);

    public List<Employee> getListEmployee();

    public Employee getEmployee(String empid);

    public void deleteEmployee(String empid);

    public Employee updateEmployee(Employee employee);


}