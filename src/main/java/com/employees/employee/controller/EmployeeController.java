package com.employees.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employees.employee.Repo.EmployeeRepo;
import com.employees.employee.models.*;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired //Connecting the controller to the model
    EmployeeRepo employeeRepo;
//Get method using the getMapping
@GetMapping
public List<Employee> getEmployees(){
    return employeeRepo.findAll();

}

}