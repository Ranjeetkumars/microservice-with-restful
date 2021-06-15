package com.ranjeet.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ranjeet.request.PassengerInfo;
import com.ranjeet.response.Ticket;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InvokePostUri {

	static final String HTTP_POST_END_POINT = "http://localhost:9191/bookTicket";

	public Ticket postRequestBody(PassengerInfo info) {
		
      log.info("postRequestBody method executed inside InvokePostUri service");
		
		Ticket body =null;
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Accept", "application/json");

		HttpEntity<PassengerInfo> httpEntity = new HttpEntity<>(info, headers);

		ResponseEntity<Ticket> ticketResponse = restTemplate.postForEntity(HTTP_POST_END_POINT, httpEntity, Ticket.class);

		if (ticketResponse != null && ticketResponse.getStatusCode().value() == 200) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@ START RESPONSE @@@@@@@@@@@@@@@@@@@@@@@@@@ ");
			body = ticketResponse.getBody();
			System.out.println(ticketResponse.getBody());
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@ END RESPONSE  @@@@@@@@@@@@@@@@@@@@@@@@@@@ ");
		}

		return body;
	}

}
