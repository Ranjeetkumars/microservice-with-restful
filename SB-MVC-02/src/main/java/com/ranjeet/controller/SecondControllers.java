package com.ranjeet.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SecondControllers {
	
	
	@RequestMapping("/welcome")
	public ModelAndView displayWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome");
		mav.setViewName("index");
		return mav;
		
	}
	
	
//	@GetMapping("/greet")
//	public String displayGreetMsg(Model model) {
//		model.addAllAttributes("","");
//		return "index";
//	}

}
