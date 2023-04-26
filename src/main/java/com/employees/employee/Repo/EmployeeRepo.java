


package com.employees.employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employees.employee.models.Employee;

//you use the @ to call a library

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
    
}
