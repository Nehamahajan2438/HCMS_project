package com.hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcms.dao.DepartmentsDAO;
import com.hcms.entities.Departments;

@Service
public class DepartmentsServiceImple implements DepartmentsService{

	@Autowired
	DepartmentsDAO departmentsDAO;
	
	@Override
	public List<Departments> getAllDepartments() {
		
		return departmentsDAO.getAllDepartments();
	}

	@Override
	public void addDepartments(Departments department) {
		// TODO Auto-generated method stub
		
	}

}
