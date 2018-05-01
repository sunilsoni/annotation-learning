package com.annotation.spring.Component;

public class EmployeeBean {
    private String id;
    private String name;
    private int age;
    private String address;
    private float salary;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(final long salary) {
        this.salary = salary;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Employee name :");
        sb.append(this.name);
        sb.append(" Employee id :");
        sb.append(this.id);
        sb.append(" Employee Salary :");
        sb.append(this.salary);
        sb.append(" Employee address :");
        sb.append(this.address);
        sb.append(" Employee age :");
        sb.append(this.age);
        return sb.toString();

    }

}