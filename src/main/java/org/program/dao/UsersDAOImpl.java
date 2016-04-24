package org.program.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.program.model.Users;
import org.springframework.beans.factory.annotation.Autowired;

public class UsersDAOImpl implements UsersDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	 public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Users getUser(String login) {
		
		Session session = sessionFactory.getCurrentSession();
	        List userList = new ArrayList();
	        Query query = session.createQuery("from Users u where u.user_name = :login");
	        query.setParameter("login", login);
	        userList = query.list();
	        if (userList.size() > 0)
	            return (Users) userList.get(0);
	        else
	            return null;  
	}

	

}
