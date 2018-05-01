package com.annotation.spring.Component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class EmployeeDAOImpl implements EmployeeDao {


    public void addEmployee(final Employee employee) {

    }

    public List<Employee> getListEmployee() {
        return null;
    }

    @Override
    public Employee getEmployee(final String empid) {
        return null;
    }

    @Override
    public void deleteEmployee(final String empid) {

    }

    @Override
    public Employee updateEmployee(final Employee employee) {
        return null;
    }
}
