package com.cognizant.microservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountApplication {
	private final static Logger log = LoggerFactory.getLogger(AccountApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
		log.info("Account Microservice running on port 8080");
	}

}
