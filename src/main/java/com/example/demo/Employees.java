package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    // ✅ Default constructor
    public Employees() {
        employeeList = new ArrayList<>();
    }

    // ✅ Getters and Setters
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}

