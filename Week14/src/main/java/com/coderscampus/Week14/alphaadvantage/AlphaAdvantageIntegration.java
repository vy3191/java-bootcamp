package com.coderscampus.Week14.alphaadvantage;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class AlphaAdvantageIntegration {
	
	@Test
	public void callApiExample () {
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://www.alphavantage.co/query")
									  .queryParam("function", "TIME_SERIES_INTRADAY")
									  .queryParam("symbol", "TSLA")
									  .queryParam("interval", "5min")
									  .queryParam("apikey", "7")
									  .build()
									  .toUri();
		
		ResponseEntity<String> response = rt.getForEntity(uri, String.class);
		System.out.println(response);
	}
}
