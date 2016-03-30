package org.program.controllers;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.program.form.Registration;
import org.program.model.Book;
import org.program.model.Person;
import org.program.model.Users;
import org.program.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("forms/registrationform.html")
public class RegistrationController {
	@Autowired
	private RegistrationValidation registrationValidation;
	
	@Autowired
	private RegistrationService registrationService;


	public void setRegistrationService(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}


	public void setRegistrationValidation(
			RegistrationValidation registrationValidation) {
		this.registrationValidation = registrationValidation;
	}

	
	@RequestMapping(method = RequestMethod.GET)
	public String showRegistration(Map model) {
		Registration registration = new Registration();
		model.put("registration", registration);
		return "registrationform";
	}

	
	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@Valid Registration registration,
			BindingResult result) {
		
		registrationValidation.validate(registration, result);
		if (result.hasErrors()) {
			return "registrationform";
		}
		else
		{
			
		
			
			
			
		return "registrationsuccess";
		} 
		}
}
