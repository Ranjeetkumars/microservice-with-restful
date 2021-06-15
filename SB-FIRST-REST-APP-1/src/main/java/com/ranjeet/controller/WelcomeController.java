package com.ranjeet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@GetMapping
	public String getWelcomeMsg() {
		String str = "I am Ranjeet kr.";
		return str;
	}
	
	
	@GetMapping(value = "/display-name/firstName/{firstname}/lastname/{lastName}")
	public String getFisrtNameAndLastName(@PathVariable("firstname") String firstName , @PathVariable("lastName") String lastName) {
		String str = "How Can i assist you Mr./Mrs. : "+firstName+" "+lastName;
		return str;
	}

}
