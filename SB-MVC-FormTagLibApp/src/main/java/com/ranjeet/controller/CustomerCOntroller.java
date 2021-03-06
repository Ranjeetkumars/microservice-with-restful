package com.ranjeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ranjeet.domain.Customer;

@Controller
public class CustomerCOntroller {
	
	
	
	@GetMapping("/customer")
	public String loadForm(Model model) {
		Customer objCustomer = new Customer();
		model.addAttribute("customer", objCustomer);
		return "index";
	}
	
	
	
	@PostMapping("/customer")
	public String handleSubmit(Customer objCustomer, Model model) {
		model.addAttribute("customer", objCustomer);
		return "data";
	}

}
