package org.program.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.program.form.BookRegistrationForm;
import org.program.model.Book;
import org.program.service.BookRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("BookRegistration.html")
public class RegistrationBookController {
	
	@Autowired
	BookRegistrationService bookRegistrationService;

	public void setBookRegistrationService(BookRegistrationService bookRegistrationService) {
		this.bookRegistrationService = bookRegistrationService;
	}

	@RequestMapping(method=RequestMethod.GET)
	public String showForm(Model model)
	{
		BookRegistrationForm bookForm = new BookRegistrationForm();
		model.addAttribute("bookRegistration", bookForm);
		return "BookRegistration";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String processForm(@ModelAttribute("bookRegistration")BookRegistrationForm bookRegistration, BindingResult result,
			Map model) {
		
		
		Book book = new Book();
		book.setAuthor(bookRegistration.getAuthor());
		book.setCategory(bookRegistration.getCategory());
		book.setNumberOfBook(bookRegistration.getNubmerOfBook());
		book.setTitle(bookRegistration.getTitle());
		book.setNsbn(bookRegistration.getNsbn());
		
	
			this.bookRegistrationService.addBook(book);
			return "BookRegistrationSuccess";
		
		
	}

}
