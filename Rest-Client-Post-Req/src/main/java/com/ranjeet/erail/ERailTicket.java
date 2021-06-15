package com.ranjeet.erail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ranjeet.request.PassengerInfo;

public class ERailTicket {

	public static void main(String[] args) throws IOException {
		// http://localhost:9191/bookTicket
		URL url = new URL("http://localhost:9191/bookTicket");

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		// Setting Http Header
		conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestProperty("Accept", "application/json");

		// set data to request body
		PassengerInfo pInfo = new PassengerInfo();
		pInfo.setFname("Ranjeet");
		pInfo.setLname("Kumar");
		pInfo.setFrom("Hyderabad");
		pInfo.setTo("Patna");
		pInfo.setJounerydate("13-06-2021");
		pInfo.setTrinNumber("DNR45");
		//
		ObjectMapper objMapper = new ObjectMapper();
		String strPassengerJson = objMapper.writeValueAsString(pInfo);
		System.out.println(strPassengerJson);

		conn.setDoOutput(true);
		OutputStream outPutStream = conn.getOutputStream();
		outPutStream.write(strPassengerJson.getBytes());

		int responseCode = conn.getResponseCode();
		System.out.println(responseCode);
		if (responseCode == 200) {
			InputStream inputStream =conn.getInputStream();
			InputStreamReader isr = new  InputStreamReader(inputStream);
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while(line!=null) {
				System.out.println("@@@@@@@@@@@@@@@@@@@@@"+line);
				line = br.readLine();
			}
			conn.disconnect();
			}

		}
	}


