package com.hcms.services;

import java.util.List;

import com.hcms.entities.Roles;

public interface RolesService {

	List<Roles> getAllRoles();

	void addRole(Roles role);

	void updateRole(Roles role);

	void deleteRole(int roleId);

	Roles getRoleById(int roleId);
}
