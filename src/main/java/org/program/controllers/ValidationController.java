package org.program.controllers;

import java.util.Map;
import javax.validation.Valid;

import org.program.form.ValidationForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/validationform.html")
public class ValidationController {

	
	@RequestMapping(method = RequestMethod.GET)
	public String showValidatinForm(Map model) {
		ValidationForm validationForm = new ValidationForm();
		model.put("validationForm", validationForm);
		return "validationform";
	}

	
	@RequestMapping(method = RequestMethod.POST)
	public String processValidatinForm(@Valid ValidationForm validationForm,
			BindingResult result, Map model) {
		if (result.hasErrors()) {
			return "validationform";
		}
		
		model.put("validationForm", validationForm);
		return "validationsuccess";
	}

}
