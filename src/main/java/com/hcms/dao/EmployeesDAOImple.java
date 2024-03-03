package com.hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcms.entities.Employees;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeesDAOImple implements EmployeesDAO{

	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<Employees> getAllEmployees() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from Employees",Employees.class).getResultList();
	}

	@Override
	public void addEmployee(Employees employee) {
		entityManager.unwrap(Session.class).saveOrUpdate(employee);
		
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
