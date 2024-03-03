package com.hcms.services;

import java.util.List;

import com.hcms.entities.Departments;

public interface DepartmentsService {

    List<Departments> getAllDepartments();
	
	void addDepartments(Departments department);
}
