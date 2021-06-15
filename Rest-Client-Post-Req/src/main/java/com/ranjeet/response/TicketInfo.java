package com.ranjeet.response;

import lombok.Data;

@Data
public class TicketInfo {

	private String ticketId;
	private String ticketStatus;
	private Double ticketPrice;
	private String passengerName;
	private String  from;
	private String to;
	private String trainNumbre;
	private String jounerydate;
}
