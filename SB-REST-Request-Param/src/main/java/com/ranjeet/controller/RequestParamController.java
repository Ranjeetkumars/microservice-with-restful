package com.ranjeet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {
	
	
	@GetMapping("/qust-param")
	public String sayHello(@RequestParam(value="hello",required = false) String hello) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@"+hello);
		return hello;
	}

}
