package org.program.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class DocumentDAOImpl implements DocumentDAO {
	
	   @Autowired
	    private SessionFactory sessionFactory;
	     
	    @Transactional
	    public void save(DocumentDAO document) {
	        Session session = sessionFactory.getCurrentSession();
	        session.save(document);
	    }
	     
	    @Transactional
	    public List<DocumentDAO> list() {
	        Session session = sessionFactory.getCurrentSession();
	        List<DocumentDAO> documents = null;
	        try {
	            documents = (List<DocumentDAO>)session.createQuery("from Document").list();
	 
	        } catch (HibernateException e) {
	            e.printStackTrace();
	        }
	        return documents;
	    }
	     
	    @Transactional
	    public DocumentDAO get(Integer id) {
	        Session session = sessionFactory.getCurrentSession();
	        return (DocumentDAOImpl)session.get(DocumentDAOImpl.class, id);
	    }
	 
	    @Transactional
	    public void remove(Integer id) {
	        Session session = sessionFactory.getCurrentSession();
	         
	        DocumentDAO document = (DocumentDAO)session.get(DocumentDAO.class, id);
	         
	        session.delete(document);
	    }

		

}
