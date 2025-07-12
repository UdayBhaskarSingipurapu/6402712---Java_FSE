package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	private static Logger log = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Country.xml");
		
		Country country = (Country) context.getBean("country");
		log.debug("Country : {}", country.toString());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		log.info("inside main");
		
		displayCountry();
	}

}
