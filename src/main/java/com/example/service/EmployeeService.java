package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {

	void createEmployee(List<Employee> employees);
	Employee getEmployeeById(int id);
	void updateEmployee(List<Employee> employees);
	void deleteEmployeeById(int id);
	List<Employee> getAllEmployee();
}
