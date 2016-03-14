package org.program.service;

import org.program.dao.BookRegistrationDAO;
import org.program.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("bookRegistrationService")
public class BookRegistrationServiceImpl implements BookRegistrationService {

	@Autowired
	private BookRegistrationDAO bookRegistrationDAO;
	
	

	public BookRegistrationDAO getBookRegistrationDAO() {
		return bookRegistrationDAO;
	}



	public void setBookRegistrationDAO(BookRegistrationDAO bookRegistrationDAO) {
		this.bookRegistrationDAO = bookRegistrationDAO;
	}



	public boolean addBook(Book book) {
		
		
		bookRegistrationDAO.addBook(book);
		return false;
	}
	
	
	
}
