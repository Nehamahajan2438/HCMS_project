package com.hcms.services;

import java.util.List;

import com.hcms.entities.Employees;

public interface EmployeesService {
	
List<Employees> getAllEmployees();
	
	void addEmployee(Employees employee);
	
	void updateEmployee(Employees employee);
	
	void deleteEmployee(int employeeId);
	
	Employees getEmployeeById(int employeeId);

}
