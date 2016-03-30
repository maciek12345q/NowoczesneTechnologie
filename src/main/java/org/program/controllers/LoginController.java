package org.program.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {


	@RequestMapping(method=RequestMethod.GET)
	//Spring Security see this :
	public ModelAndView login() {

		ModelAndView model = new ModelAndView("loginform");
		

		return model;

	}

}