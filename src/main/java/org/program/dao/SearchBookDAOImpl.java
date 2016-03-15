package org.program.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.program.model.Book;
import org.springframework.stereotype.Repository;

@Repository("SearchBookDAO")
public class SearchBookDAOImpl implements SearchBookDAO{

	  @Resource(name="sessionFactory")
      protected SessionFactory sessionFactory;

      public void setSessionFactory(SessionFactory sessionFactory) {
             this.sessionFactory = sessionFactory;
      }

	
	public List searchBook(String title, String author) {
		
		
	List result = null,result2 = null;
		
		Session session = this.sessionFactory.openSession();
		try
		{
		Transaction tx = session.beginTransaction();
			Criteria cr = session.createCriteria(Book.class);
			cr.add(Restrictions.eq("title", title));
			result = cr.list();
			Criteria cr2 = session.createCriteria(Book.class);
			cr2.add(Restrictions.eq("author", author));
			 result2 = cr2.list();
			tx.commit();
		} catch(HibernateException e)
		{
			System.out.println("Problem podczas przesylania danych do Hibernate");
		}
		finally
		{
		session.close();
		}
		result.add(result2);
		if(result.isEmpty())
			return null;
		else
		return result;
	}
	
	

}
