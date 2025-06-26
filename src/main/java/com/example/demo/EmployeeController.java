
package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {

    EmployeeManager manager = new EmployeeManager();

    // GET all employees
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return manager.getEmployees().getEmployeeList();
    }

    // POST to add a new employee
    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee employee) {
        manager.addEmployee(employee);
        return "Employee added successfully";
    }
}
