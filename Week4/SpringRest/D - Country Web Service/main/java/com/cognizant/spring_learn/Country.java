package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Country {
	String code;
	String name;
	
	private static Logger log = LoggerFactory.getLogger(Country.class);
	
	public Country() {
		log.info("Inside Country Constructor.");
	}
	
	public Country(String code, String name) {
		log.info("Inside Parameterized Constructor");
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		log.info("Inside toString() method");
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
	
}
