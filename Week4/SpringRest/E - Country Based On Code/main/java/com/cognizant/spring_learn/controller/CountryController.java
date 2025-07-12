package com.cognizant.spring_learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.CountryService;

@RestController
@RequestMapping("/")
public class CountryController {
	
	@Autowired
	private CountryService countryService;

	@GetMapping("/country")
	public ResponseEntity<Country> getCountryIndia(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Country.xml");
		Country c = (Country) context.getBean("country");
		return ResponseEntity.ok().body(c);
	}
	
	@GetMapping("/country/{code}")
	public ResponseEntity<Country> getCountryByCode(@PathVariable String code){
		Country country = countryService.getCountryByCode(code);
		if(country != null) {
			return ResponseEntity.ok().body(country);
		}
		else return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
	}
}
