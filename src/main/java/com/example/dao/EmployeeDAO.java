package com.example.dao;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeDAO {

	void saveEmployee(List<Employee> employees);
}
