package org.program.service;

import java.util.List;

import org.program.dao.SearchBookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("searchBookService")
public class SearchBookServiceImpl implements SearchBookService {
	
	@Autowired
	SearchBookDAO searchBookDAO;



	public SearchBookDAO getSearchBookDAO() {
		return searchBookDAO;
	}



	public void setSearchBookDAO(SearchBookDAO searchBookDAO) {
		this.searchBookDAO = searchBookDAO;
	}



	public List searchBook(String title, String author) {
		
		List result=this.searchBookDAO.searchBook(title, author);
		return result;
	}


}
