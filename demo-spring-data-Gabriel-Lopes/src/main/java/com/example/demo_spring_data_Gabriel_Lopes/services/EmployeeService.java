package com.example.demo_spring_data_Gabriel_Lopes.services;


import com.example.demo_spring_data_Gabriel_Lopes.jpa.Employee;
import com.example.demo_spring_data_Gabriel_Lopes.repository.EmployeeRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public List<Employee> findEmployees() {
        return employeeRepository.findAll();
    }

    public  Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


}
