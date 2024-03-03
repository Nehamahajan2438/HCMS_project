package com.hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcms.dao.EmployeesDAO;
import com.hcms.entities.Employees;

@Service
public class EmployeesServiceImple implements EmployeesService{

	@Autowired
	EmployeesDAO employeesDAO;
	@Override
	public List<Employees> getAllEmployees() {
		
		return employeesDAO.getAllEmployees();
	}

	@Override
	public void addEmployee(Employees employee) {
		
		employeesDAO.addEmployee(employee);
		
	}

	@Override
	public void updateEmployee(Employees employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employees getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
