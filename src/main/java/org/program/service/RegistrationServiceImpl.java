package org.program.service;

import org.program.dao.RegistrationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("registrationService")
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	private RegistrationDAO registrationDAO;
	
	public void setRegistrationDAO(RegistrationDAO registrationDAO) {
		this.registrationDAO = registrationDAO;
	}

	public boolean registrateAccount(String username, String password,String role) {
		
		this.registrationDAO.createAccount(username, password,role);
		
		
		return false;
	}

}
