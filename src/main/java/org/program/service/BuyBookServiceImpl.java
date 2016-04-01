package org.program.service;

import org.program.dao.BuyBookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("buyBookService")
public class BuyBookServiceImpl implements BuyBookService {

	
	@Autowired
	private BuyBookDAO buyBookDAO;
	
	public boolean BuyBook(int id) {
		
		this.buyBookDAO.buyBook(id);
		return false;
	}

	
	
	
}
