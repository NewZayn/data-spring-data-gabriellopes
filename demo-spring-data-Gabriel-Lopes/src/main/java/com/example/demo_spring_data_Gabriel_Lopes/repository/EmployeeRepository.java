package com.example.demo_spring_data_Gabriel_Lopes.repository;

import com.example.demo_spring_data_Gabriel_Lopes.jpa.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
