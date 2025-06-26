package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees(); // Uses default constructor
        List<Employee> list = new ArrayList<>();

        // ✅ Adding sample employees with correct constructor syntax
        list.add(new Employee("1", "Alice", "Smith", "alice@example.com", "Developer"));
        list.add(new Employee("2", "Bob", "Johnson", "bob@example.com", "Manager"));
        list.add(new Employee("3", "Charlie", "Williams", "charlie@example.com", "Analyst"));
        list.add(new Employee("4", "Diana", "Brown", "diana@example.com", "Engineer"));

        employees.setEmployeeList(list); // Initializes employee list
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }
}
