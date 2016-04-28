package org.program.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.program.form.User;
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

	public void removeAccount(Long id)
	{
		List resultPom = null;
		Session session = this.sessionFactory.openSession();
		try
		{

			Transaction tx = session.beginTransaction();
			Criteria cr = session.createCriteria(Users.class);
			cr.add(Restrictions.eq("id", id));
			resultPom = cr.list();
			List<Users> result =new ArrayList<Users>();

			for(int i=0;i<resultPom.size();i++)
			{
				result.add((Users)resultPom.get(i));
				session.delete(result.get(i));
			}
			tx.commit();

		}
		catch(HibernateException ex)
		{
			System.out.println("Problem podczas przesyłania danych do bazy danych");

		}
		finally {
			session.close();
		}
	}

}
