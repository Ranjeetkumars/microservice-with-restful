package com.ranjeet.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Invoke3rdPartyLib {

	String pathUrl = "http://localhost:9191/display-name/firstName/{firstName}/lastname/{lastname}";

	public String invokePathParam(String firstName, String lastname) {
		System.out.println("invokePathParam method executed inside Invoke3rdPartyLib service");

		// Cretae RestTemplate object
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> strResponse = restTemplate.getForEntity(pathUrl, String.class, firstName, lastname);

		if (strResponse != null && strResponse.getStatusCode().value() == 200) {

			return strResponse.getBody();
		}

		return null;
	}

}
