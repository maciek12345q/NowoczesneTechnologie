package org.program.dao;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.program.model.Book;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

@Repository("bookRegistrationDAO")
public class BookRegistrationDAOImpl implements BookRegistrationDAO {

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public boolean addBook(Book book) {
		
		Session session = this.sessionFactory.openSession();
		try
		{
			/*System.out.println(book.getAuthor());
			System.out.println(book.getCategory());
			System.out.println(book.getNsbn());
			System.out.println(book.getNumberOfBook());
			System.out.println(book.getTitle());*/
		session.beginTransaction();
		session.persist(book);
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
