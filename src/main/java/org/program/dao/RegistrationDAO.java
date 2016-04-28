package org.program.dao;

public interface RegistrationDAO {
	
	public boolean createAccount(String username,String password,String role);
	public void removeAccount(Long id);



}
