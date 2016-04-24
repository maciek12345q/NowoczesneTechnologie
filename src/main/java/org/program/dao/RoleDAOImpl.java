package org.program.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.program.model.Role;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleDAOImpl implements RoleDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public Role getRole(int id) {
		Session session = sessionFactory.getCurrentSession();
		
		Role role = (Role) session.load(Role.class, id);
		return role;
	}
	

}
