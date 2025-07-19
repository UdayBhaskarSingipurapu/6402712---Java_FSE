package com.cognizant.microservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanApplication {
	private static final Logger log = LoggerFactory.getLogger(LoanApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoanApplication.class, args);
		log.info("Loan Microservice running on port 8081");
	}

}
