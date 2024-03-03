package com.hcms.dao;

import java.util.List;

import com.hcms.entities.Roles;

public interface RolesDAO {

	List<Roles> getAllRoles();

	void addRole(Roles role);

	void updateRole(Roles role);

	void deleteRole(int roleId);

	Roles getRoleById(int roleId);
}
