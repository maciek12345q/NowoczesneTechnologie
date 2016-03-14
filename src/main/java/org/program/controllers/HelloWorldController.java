package org.program.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.program.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	   
	   
	   private SessionFactory sessionFactory;
	   
	   
	   @RequestMapping("/helloworld")
	   public ModelAndView helloWord(){
		      String message = "Hello World, Spring 3.0!";
		      
		     
		  
		      return new ModelAndView("helloworld", "message",message);
	   }
  }
