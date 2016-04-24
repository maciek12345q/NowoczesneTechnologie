package org.program.service;

import org.program.dao.UsersDAO;
import org.program.model.Users;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UsersService {

	@Autowired
	private UsersDAO usersDAO;
	public Users getUser(String login) {
		 return usersDAO.getUser(login);
	}

}
