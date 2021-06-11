package com.ranjeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@ResponseBody
@RequestMapping(value="/demo")
public class DemoController {
	
	
	public DemoController() {
		
		System.out.println("*************DemoController****************");
	}
	
	
	
	@GetMapping("/welcome")
	public String welcome() {
		String str = "Welcome to Restful service...";
		return str;
	}
	
	
	
	@GetMapping("/greet")
	public String greet() {
		String str = "Good Morning Ranjeet kumar.";
		return str;
	}

}
