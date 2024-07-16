package com.bhavinhirpara.microservices.currency_exchange_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;

@RestController
public class CircuitBreakerController {
	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

	@GetMapping("/sample-api")
	//@Retry(name = "sample-api", fallbackMethod = "hardcodedResponse")
	//@CircuitBreaker(name="default",fallbackMethod = "hardcodedResponse")
	//@RateLimiter(name="default")
	//10s => 10000 claas to sample-api
	@Bulkhead(name="sample-api")
	public String sampleApi() {
		logger.info("Sample API call recieved");
		/*
		 * ResponseEntity<String> responseEntity = new
		 * RestTemplate().getForEntity("http://localhost:8080/dummy-url", String.class);
		 * return responseEntity.getBody();
		 */ return "Sample-apo";
	}

	public String hardcodedResponse(Exception exception) {
	return "fall-back response";
	}

}
