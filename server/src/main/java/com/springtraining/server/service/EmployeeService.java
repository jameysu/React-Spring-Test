package com.springtraining.server.service;

import java.util.List;

import com.springtraining.server.model.Employee;

public interface EmployeeService {

   Employee createEmployee(Employee employee);
   List<Employee> getAllEmployees();
   boolean deleteEmployee(Long id);
   Employee getEmployeeById(Long id);
   Employee updateEmployee(Long id, Employee employee);  
}
