package com.cognizant.spring_learn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Country;

@Service
public class CountryService {
	
	public Country getCountryByCode(String code) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Country.xml");
		
		List<Country> countryList = (List<Country>) context.getBean("countryList");
		return countryList.stream().filter(country -> country.getCode().equalsIgnoreCase(code)).findFirst().orElse(null);
	}

}
