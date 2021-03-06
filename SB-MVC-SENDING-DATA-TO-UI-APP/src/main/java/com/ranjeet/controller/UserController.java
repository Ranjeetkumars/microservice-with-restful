package com.ranjeet.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ranjeet.domain.UserDetails;

@Controller
public class UserController {
	
	
	
	
	@GetMapping("/userDetails")
	public String getUserDetails(Model model) {
		UserDetails ud = new UserDetails();
		ud.setId("137");
		ud.setFirstName("Ranjeet");
		ud.setLastName("Kumar");
		ud.setDob("10-04-1993");
		ud.setGender("Male");
		model.addAttribute("userData", ud);
		return "user";
	}

}
