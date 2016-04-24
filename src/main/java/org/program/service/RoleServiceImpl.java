package org.program.service;

import org.program.dao.RoleDAO;
import org.program.model.Role;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDAO roleDAO;
	
	public Role getRole(int id) {
		return roleDAO.getRole(id);
	}
	
	

}
