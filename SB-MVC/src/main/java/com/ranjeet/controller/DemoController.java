package com.ranjeet.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	
	
	
	
	@GetMapping(value = "/work")
	public String  getCurrentDate(Model model) {
		model.addAttribute("text", "Today current date --> "+new Date(System.currentTimeMillis()));
		return "currentDate";
	}

}
