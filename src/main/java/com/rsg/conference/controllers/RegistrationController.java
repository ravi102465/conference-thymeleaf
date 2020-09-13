package com.rsg.conference.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rsg.conference.models.Registration;

@Controller
public class RegistrationController {
	
	@GetMapping("registration")
	//This module attribute map with module attribute in jsp page 
	public String getRegistration(@ModelAttribute("registration")Registration registration ) 
	{
		return "registration";
	}
	
	@PostMapping("registration")
	public String addRegistration(@ModelAttribute("registration")Registration registration) {
		System.out.println("name passed: " + registration.getName());
		return "redirect:registration";
	}

}
