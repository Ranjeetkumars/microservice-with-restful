package com.ranjeet.binding;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book  extends RepresentationModel<Book>{

	
	private String isbn;
	private String name;
	private double price;
	private String author;
}
