package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome() {
		return "Welcome you all!!!";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String get() {
		return "default get";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Employee getData(@PathVariable("id") int id) {
		Employee emp = new Employee("Arun", 25, "Engineering");
		emp.setId(id);
		return emp;
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String create(@RequestBody List<Employee> employees) {
		employeeService.createEmployee(employees);
		return "Employee created successfully!!!";
	}
}
