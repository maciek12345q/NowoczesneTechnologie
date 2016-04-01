package org.program.controllers;

import org.program.service.BuyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("forms/BuyBook.html**")
public class BuyBookController {
	
	@Autowired
	BuyBookService buyBookService;
	
	@RequestMapping(method=RequestMethod.POST)
	public String buyBook(@RequestParam("id") int id)
	{
		this.buyBookService.BuyBook(id);
		
		return "BuyBookSuccess";
	}
	

}
