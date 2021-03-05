package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.login.UserValidationService;

@Controller
public class LoginController {
	
	@Autowired
	private UserValidationService service;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name, @RequestParam String pass, ModelMap model) {
		if(this.service.isUserValid(name, pass)) {
			model.put("name", name);
			return "welcome";			
		}
		
		model.put("errorMessage", "Invalid user or password");
		
		return "login";

	}
}
