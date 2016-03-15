package org.program.controllers;

import java.util.Map;

import org.program.form.SearchBookForm;
import org.program.service.SearchBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/SearchBook.html")
public class SearchBookController {
	
	@Autowired
	private SearchBookService searchBookService;
	
	
	public SearchBookService getSearchBookForm() {
		return searchBookService;
	}


	public void setSearchBookForm(SearchBookService searchBookForm) {
		this.searchBookService = searchBookForm;
	}


	@RequestMapping(method=RequestMethod.GET)
	public String showForm(Model model)
	{
		SearchBookForm searchBookForm = new SearchBookForm();
		model.addAttribute("searchBook", searchBookForm);
		return "SearchBook";
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String processForm(@ModelAttribute("searchBook")SearchBookForm searchBookForm, BindingResult result,
			Map model) 
	{
		
		
		return "SearchBook";
		
	}

}
