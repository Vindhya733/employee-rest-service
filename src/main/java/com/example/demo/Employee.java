package com.example.demo;
public class Employee {
    private String employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;

    public Employee() {
    }
    public Employee(String employee_id, String first_name, String last_name, String email, String title) {
    this.employee_id = employee_id;
    this.first_name = first_name;
    this.last_name = last_name;
    this.email = email;
    this.title = title;
}
    // Getters and Setters
    public String getEmployee_id() { return employee_id; }
    public void setEmployee_id(String employee_id) { this.employee_id = employee_id; }

    public String getFirst_name() { return first_name; }
    public void setFirst_name(String first_name) { this.first_name = first_name; }

    public String getLast_name() { return last_name; }
    public void setLast_name(String last_name) { this.last_name = last_name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
}
