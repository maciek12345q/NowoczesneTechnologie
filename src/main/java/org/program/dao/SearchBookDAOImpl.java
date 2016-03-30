package org.program.dao;

import java.util.ArrayList;
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
			 result=cr.list();
	
			tx.commit();
		} catch(HibernateException e)
		{
			System.out.println("Problem podczas przesylania danych do Hibernate");
		}
		finally
		{
		session.close();
		}
		List <Book>books = new ArrayList();
	
		int minim = Math.min(result.size(), result2.size());
		int maxim = Math.max(result.size(), result2.size());
		if(result.size()==0)
		{
			if(result2.size()==0)
				return null;
			else return result2;
			
			
		}
		else if(result.size()!=0)
		{
			if(result2.size()==0)
				return result;
			else
			{
				
				
				for(int i=0;i<minim;i++)
				{
					for(int j=0;j<maxim;j++)
					{
						if(minim==result.size())
						{
					if(result.get(i)==result2.get(j))
						books.add((Book) result.get(i));
						}
						else
						{
							if(result.get(j)==result2.get(i))
								books.add((Book)result.get(j));
							
						}
					}
				}
				
				
				
			}
		}
		return books;
		
		
	}
	
	

}
