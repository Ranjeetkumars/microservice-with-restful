package com.ranjeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	
	
	
	@GetMapping("/welcome")
	public String displayWelcomeMsg(Model model) {
		model.addAttribute("msg", "Welcome to Ashok IT...");
		return "index";
	}
	
	
	@GetMapping
	public String getProductDetails(Model model) {
		model.addAttribute("pID", "101");
		model.addAttribute("pName", "Monitor");
		model.addAttribute("pPrice", "10,000 INR");
		return "product";
	}
}
