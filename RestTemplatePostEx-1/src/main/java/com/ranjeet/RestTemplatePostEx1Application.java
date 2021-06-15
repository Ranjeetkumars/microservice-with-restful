package com.ranjeet;

import java.net.http.HttpHeaders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.ResponseEntity;

import com.ranjeet.request.PassengerInfo;
import com.ranjeet.response.Ticket;
import com.ranjeet.service.InvokePostUri;

@SpringBootApplication
public class RestTemplatePostEx1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext iocRef = SpringApplication.run(RestTemplatePostEx1Application.class, args);

		InvokePostUri bean = iocRef.getBean(InvokePostUri.class);
		
		
		
		
		PassengerInfo info = new PassengerInfo();
		info.setFname("Ranjeet");
		info.setLname("Kumar");
		info.setFrom("Hydearabad");
		info.setTo("Patna");
		info.setJounerydate("15-09-2021");
		info.setTrinNumber("DNR12693");
		ResponseEntity<Ticket> ticketResponse =   bean.postRequestBody(info);
		
		System.out.println(ticketResponse);
	}

}
