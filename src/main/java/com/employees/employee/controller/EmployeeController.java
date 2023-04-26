package com.employees.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

@PostMapping
public Employee save(@Validated @NonNull @RequestBody Employee employee) {
        return employeeRepo.save(employee);
}
//for Updating
@PutMapping("/{id}")
public Employee update(@Validated @NonNull @RequestBody Employee employee) {
        return employeeRepo.save(employee);
        }

@GetMapping(value = "{/id}") 
    public Optional <Employee> findOne(Employee employee){
        return employeeRepo.findById(employee.getEmpId());
        }
    }


