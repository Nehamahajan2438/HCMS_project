package com.hcms;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hcms.entities.Departments;
import com.hcms.entities.Employees;
import com.hcms.entities.Roles;
import com.hcms.services.DepartmentsService;
import com.hcms.services.EmployeesService;
import com.hcms.services.RolesService;

@Component
public class DataLoader implements CommandLineRunner{

	@Autowired
	EmployeesService employeesService;
	
	@Autowired
	RolesService rolesService;
	
	@Autowired
	DepartmentsService departmentsService;
	
	@Override
	public void run(String... args) throws Exception {
		
		Roles role1 = new Roles();
		role1.setRoleName("Software Developer");
		role1.setDescription("SD Description");
		rolesService.addRole(role1);
		
		Roles role2 = new Roles();
		role2.setRoleName("Manager");
		role2.setDescription("Manager Description");
		rolesService.addRole(role2);
		
		Roles role3 = new Roles();
		role3.setRoleName("Web Developer");
		role3.setDescription("Web Developer Description");
		rolesService.addRole(role3);
		
		Departments dept1 = new Departments();
		dept1.setDepartmentName("IT");
		dept1.setDescription("IT Description");
		departmentsService.addDepartments(dept1);
		
		Departments dept2 = new Departments();
		dept2.setDepartmentName("HR");
		dept2.setDescription("HR Description");
		departmentsService.addDepartments(dept2);
		
		Employees emp1 = new Employees();
		emp1.setFirstName("Shubhman");
		emp1.setLastName("Gill");
		emp1.setGender("M");
		emp1.setDateOfBirth(LocalDate.of(1999, 9, 8));
		emp1.setEmail("shubhman@gmail.com");
		emp1.setPhone("8254767898");
		emp1.setAddress("chandigarh");
		emp1.setNationalId("354678");
		emp1.setMaritalStatus("Single");
		emp1.setEmergencyContactName("manager");
		emp1.setEmergencyContactPhone("9087657421");
		emp1.setPosition("HR Manager");
		emp1.setSkillSet("Communication skills ,Decision-making skills");
		emp1.setEmploymentStartDate(LocalDate.of(2021, 4, 2));
		emp1.setEmploymentEndDate(null);
		emp1.setSalary(new BigDecimal("95000.0"));
		emp1.setEmploymentStatus("ACTIVE");
		emp1.setBankAccountNumber("4537462800");
		emp1.setManager(null);
		emp1.setDepartment(dept2);
		emp1.setRole(role2);
		
		Employees emp2 = new Employees();
		emp2.setFirstName("Virat");
		emp2.setLastName("Kohli");
		emp2.setGender("M");
		emp2.setDateOfBirth(LocalDate.of(1988, 11, 5));
		emp2.setEmail("virat@gmail.com");
		emp2.setPhone("9032564738");
		emp2.setAddress("Mumbai");
		emp2.setNationalId("32546");
		emp2.setMaritalStatus("Married");
		emp2.setEmergencyContactName("Anushka");
		emp2.setEmergencyContactPhone("9463728456");
		emp2.setPosition("Software Engineer");
		emp2.setSkillSet("Java , Spring Boot, Angular ,MYSQL");
		emp2.setEmploymentStartDate(LocalDate.of(2018, 5, 9));
		emp2.setEmploymentEndDate(null);
		emp2.setSalary(new BigDecimal("250000.0"));
		emp2.setEmploymentStatus("ACTIVE");
		emp2.setBankAccountNumber("32456374");
		emp2.setManager(emp1);
		emp2.setDepartment(dept1);
		emp2.setRole(role1);


		employeesService.addEmployee(emp1);
		employeesService.addEmployee(emp2);
		
		
		
	}

}
