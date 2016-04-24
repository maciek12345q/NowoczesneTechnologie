package org.program.dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.program.model.Role;
import org.program.model.Users;
import org.springframework.stereotype.Repository;

@Repository("registrationDAO")
public class RegistrationDAOImpl implements RegistrationDAO {
	
	  @Resource(name="sessionFactory")
      protected SessionFactory sessionFactory;

      public void setSessionFactory(SessionFactory sessionFactory) {
             this.sessionFactory = sessionFactory;
      }

      public boolean createAccount(String username,String password,String role) {
		
		boolean error=true;
		Users users = new Users();
		users.setUserName(username);
		users.setUserPassword(password);
		Role role1 = new Role();
		role1.setRole(role);
		Set<Users> userRoles = new HashSet<Users>();
		userRoles.add(users);
		
		role1.setUserRoles(userRoles);
		users.setRole(role1);
		users.setPerson(null);
		Session session = this.sessionFactory.openSession();
		try
		{
		Transaction tx = session.beginTransaction();
			session.persist(users);
			tx.commit();
		} catch(HibernateException e)
		{
			error=false;
			System.out.println("Problem podczas przesylania danych do Hibernate");
		}
		finally
		{
		session.close();
		}
		return error;
	}

}
