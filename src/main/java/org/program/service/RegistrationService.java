package org.program.service;

public interface RegistrationService {
	
	
	public boolean registrateAccount(String username,String password,String role);
	public void removeAccount(Long id);

}
