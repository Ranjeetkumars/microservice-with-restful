package com.ranjeet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathParamController {
	
	
	
	@GetMapping(value = "/courseDetail/{name}")
	public String getCourseDuration(@PathVariable("name") String cname) {
		
		
		return cname;
	}

}
