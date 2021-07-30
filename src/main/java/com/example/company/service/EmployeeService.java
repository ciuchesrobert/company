package com.example.company.service;

import com.example.company.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
//	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}