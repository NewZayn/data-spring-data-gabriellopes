package com.example.demo_spring_data_Gabriel_Lopes.controller;


import com.example.demo_spring_data_Gabriel_Lopes.jpa.Employee;
import com.example.demo_spring_data_Gabriel_Lopes.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

     EmployeeService employeeService;


     @PostMapping("/employee")
     public Employee employee(@RequestBody Employee employee) {
         return employeeService.addEmployee(employee);
     }

     @GetMapping("/employee/get")
     public List<Employee> getEmployee() {
         return  employeeService.findEmployees();
      }
}
