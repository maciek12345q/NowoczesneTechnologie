package org.program.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("SearchBook.html")
public class SearchBookController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String showForm()
	{
		return "cos";
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String processForm()
	{
		return "cos";
		
	}

}
