package com.bhavinhirpara.microservices.currency_exchange_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {
private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	@GetMapping("/sample-api")
	@Retry(name="sample-api")
	public String sampleApi() {
		logger.info("Sample API call recieved");
	ResponseEntity<String> responseEntity = 	new RestTemplate().getForEntity("http://localhost:8080/dummy-url", String.class);
		return responseEntity.getBody();
	}

}
