package com.maven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maven.model.Employee;
import com.maven.model.User;
import com.maven.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "/get", headers = "Accept=application/json")
	public List<Employee> getAllUser() {
		List<Employee> employeeList = employeeService.getEmployee();
		return employeeList;
	
	}
	

}
