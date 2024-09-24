package com.example.demo_spring_data_Gabriel_Lopes.controller;

import com.example.demo_spring_data_Gabriel_Lopes.jpa.Employee;
import com.example.demo_spring_data_Gabriel_Lopes.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    //l

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/get")
    public List<Employee> getEmployees() {
        return employeeService.findEmployees();
    }
}
