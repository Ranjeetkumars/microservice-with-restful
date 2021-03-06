package com.ranjeet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ranjeet.binding.Book;

@RestController
public class BookRestController {

	@GetMapping(value = "/book/{isbn}")
    public Book getBookInfo(@PathVariable("isbn") String isbn ) {
		
		//logic
    	Book b = new Book(isbn,"Spring",500.0,"Rod Johnson");
    	Link withRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class).getAllBooks()).withRel("All-Books");
    	b.add(withRel);
    	return b;
    }

	@GetMapping(value = "/getBooks")
	public List<Book> getAllBooks(){
		
		//logic
		Book b1 = new Book("ISBN-J2SE","JAVA",800.99,"Jems Gosling");
		Book b2 = new Book("ISBN-Spring","Spring",1100.99,"Rod Jhonson");
		Book b3 = new Book("ISBN-WebService","Restful",900.99,"Roy F");
		Book b4 = new Book("ISBN-Boot","Spring Boot",1300.99,"Pi");
		List<Book> listOfBook = new ArrayList<Book>();
		listOfBook.add(b1);
		listOfBook.add(b2);
		listOfBook.add(b3);
		listOfBook.add(b4);
		
		return listOfBook;
		
	}

}
