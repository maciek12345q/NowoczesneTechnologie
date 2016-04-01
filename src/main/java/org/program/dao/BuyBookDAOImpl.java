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

@Repository("BuyBookDAO")
public class BuyBookDAOImpl implements BuyBookDAO {

	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public boolean buyBook(int id) {
		List<Book> result=null;
		Session session = this.sessionFactory.openSession();
		Transaction tx = null;
		List<Book>list = null;
		try
		{
			
			Criteria cr = session.createCriteria(Book.class);
			cr.add(Restrictions.eq("id", id));
			result = cr.list();
			tx	= session.beginTransaction();
			if(result.get(0).getNumberOfBook()>1)
			{
			result.get(0).setNumberOfBook(result.get(0).getNumberOfBook()-1);
			session.update(result.get(0));
			}
			else
				session.delete(result.get(0));
		
			 session.getTransaction().commit();
		}
		catch(HibernateException ex)
		{
			System.out.println("Blad w dodawaniu : "+ex.getMessage());
		}
		finally
		{
		session.close();
		}
		return false;
	}
}
