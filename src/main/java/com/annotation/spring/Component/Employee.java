package com.annotation.spring.Component;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {

    private static final long serialVersionUID = 23797861592054943L;

    private String id;

    private String name;

    private int age;

    private String address;

    private float salary;
}