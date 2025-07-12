package com.cognizant.spring_learn.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;

@RestController
@RequestMapping("/")
public class CountryController {

	@GetMapping("/country")
	public ResponseEntity<Country> getCountryIndia(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Country.xml");
		Country c = (Country) context.getBean("country");
		return ResponseEntity.ok().body(c);
	}
}
