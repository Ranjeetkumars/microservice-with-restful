package com.ranjeet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryParamController {
	
	
	
	@GetMapping(value="/courceDetails")
	public String courceDetails(@RequestParam("cname") String cname, @RequestParam("tname") String tname) {
		
		if(cname.equalsIgnoreCase("Java") && tname.equalsIgnoreCase("Ranjeet")) {
			return "Starting from 20 june 2021";
		}
		return "please click here to visit out wesite http://www.ashokit.in for more details";
		
	}

}
