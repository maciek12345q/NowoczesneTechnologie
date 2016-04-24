package org.program.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccessDeniedController {

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accesssDenied() {

		return "403";
	}

}
