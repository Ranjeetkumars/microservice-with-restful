package com.ranjeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ranjeet.domain.Book;



@Controller
public class BookController {
	
	
	
	@GetMapping("/addBook")
	public String loadForm() {
		return "AddBook";
	}
	
	
	
	@PostMapping("/saveData")
	public String displayBook(Book objBook ,Model model) {
		model.addAttribute("book", objBook);
		return "displayBook";
	}

}
