package org.program.dao;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.program.model.Book;
import org.program.model.Person;
import org.program.model.Users;
import org.springframework.stereotype.Repository;

@Repository("bookRegistrationDAO")
public class BookRegistrationDAOImpl implements BookRegistrationDAO {

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public boolean addBook(Book book) {
		
		Session session = this.sessionFactory.openSession();
		Transaction tx = null;
		try
		{
	
			Person person = new Person();
			person.setAdress("Borowa 10");
			person.setLastName("Nowak");
			person.setName("Maciej");
			person.setPostCode("24-212");
			Set<Person> persons = new HashSet<Person>();
			persons.add(person);
			book.setPerson(persons);
			 
			tx	= session.beginTransaction();
			 session.save(book);
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
