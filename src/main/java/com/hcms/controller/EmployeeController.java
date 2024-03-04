package com.hcms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcms.entities.Employees;
import com.hcms.services.EmployeesService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeesService employeeService;
	
	@GetMapping("/employees")
	private ResponseEntity<List<Employees>>getAll(){
		return new ResponseEntity<List<Employees>>(employeeService.getAllEmployees(),HttpStatus.OK);
	}
	

}
