package com.ranjeet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	
	
	@RequestMapping("/test")
	public ModelAndView m1() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome to Ashok IT...");
		mav.setViewName("index");
		return mav;
	}
	
	
	@GetMapping("/")
	public String displayGreetMsg(Model model) {
		model.addAttribute("msg","Good Moring Ranjeet kumar.");
		return "index";
		
	}

}
