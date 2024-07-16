package com.bhavinhirpara.microservices.currency_exchange_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

	@GetMapping("/sample-api")
	public String sampleApi() {
		return"sample api";
	}

}
