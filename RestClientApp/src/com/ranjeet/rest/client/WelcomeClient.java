package com.ranjeet.rest.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WelcomeClient {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://localhost:9191/");

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		int httpStatusCode = conn.getResponseCode();
		System.out.println(httpStatusCode);

		if (httpStatusCode == 200) {
			InputStream is = conn.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader bfr = new BufferedReader(isr);
			String strResponse = bfr.readLine();
			System.out.println(strResponse);
			conn.disconnect();
		}
	}

}
