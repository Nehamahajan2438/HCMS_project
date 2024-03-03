package com.hcms.dao;

import java.util.List;

import com.hcms.entities.Employees;

public interface EmployeesDAO {
	
	List<Employees> getAllEmployees();
	
	void addEmployee(Employees employee);
	
	void updateEmployee(Employees employee);
	
	void deleteEmployee(int employeeId);
	
	Employees getEmployeeById(int employeeId);
	

}
