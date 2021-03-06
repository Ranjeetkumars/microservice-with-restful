package com.ranjeet.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ranjeet.respone.Ticket;
import com.ranjeet.reuest.PassengerInfo;

@RestController
public class ERailResource {

	@PostMapping(value = "/bookTicket", produces = { "application/xml", "application/json" }, consumes = {
			"application/json","application/xml" })
	public Ticket bookTicket( @RequestBody PassengerInfo info) {
        System.out.println(info);
		// logic
		Ticket t = new Ticket();
		t.setTicketId("TA02899");
		t.setTicketStatus("CONFIRMED");
		t.setJounerydate(info.getJounerydate());
		t.setPassengerName(info.getFname() + " " + info.getLname());
		t.setTrainNumbre(info.getTrinNumber());
		t.setTicketPrice(1180.0);
		return t;
	}
	
	
	@PostMapping(value = "/bookTicketRetuenWithResponseEntity", produces = { "application/xml", "application/json" }, consumes = {
			"application/json","application/xml" })
	public ResponseEntity<Ticket> bookTicket1( @RequestBody PassengerInfo info) {
        System.out.println(info);
		// logic
		Ticket t = new Ticket();
		t.setTicketId("TA02899");
		t.setTicketStatus("CONFIRMED");
		t.setJounerydate(info.getJounerydate());
		t.setPassengerName(info.getFname() + " " + info.getLname());
		t.setTrainNumbre(info.getTrinNumber());
		t.setTicketPrice(1180.0);
		return  new ResponseEntity<> (t, HttpStatus.CREATED);
	}

}
