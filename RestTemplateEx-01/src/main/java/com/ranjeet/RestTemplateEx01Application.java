package com.ranjeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateEx01Application {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateEx01Application.class, args);

		RestTemplate restTemplate = new RestTemplate();
		String httpUrl = "http://localhost:9191/";
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(httpUrl, String.class);
		int statusCode = responseEntity.getStatusCode().value();
		if (statusCode == 200) {
			System.out.println(responseEntity.getBody());
		}
	}

}
