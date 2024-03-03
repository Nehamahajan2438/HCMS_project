package com.hcms.dao;

import java.util.List;

import com.hcms.entities.Departments;

public interface DepartmentsDAO {
	
	List<Departments> getAllDepartments();
	
	void addDepartments(Departments department);
	
//	void updateDepartments(Departments department);
//	
//	void deleteDepartments(int departmentId);
//	
//	Departments getDepartmentById(int departmentId);

}
