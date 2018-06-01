package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDAO;
import com.example.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeRepository;
	
	@Override
	public void createEmployee(List<Employee> employees) {
		employeeRepository.saveEmployee(employees);	
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(List<Employee> employees) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
