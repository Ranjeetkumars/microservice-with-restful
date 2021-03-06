package com.ranjeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {

	@GetMapping("/price/{bname}/{aname}")
	public String getBookprice(@PathVariable("bname") String bname, @PathVariable("aname") String aname, Model model) {
		String str = aname + " " + bname + "price is 300 INR.";
		model.addAttribute("bookprice", str);
		return "bookprice";

	}

}
