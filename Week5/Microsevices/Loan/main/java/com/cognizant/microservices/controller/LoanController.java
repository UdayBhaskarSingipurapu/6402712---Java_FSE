package com.cognizant.microservices.controller;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoanController {
	
	@GetMapping("/loans/{number}")
	public ResponseEntity<?> getLoanDetails(@PathVariable String number){
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("number", number);
		hm.put("type", "car");
		hm.put("loan", 400000);
		hm.put("emi", 3258);
		hm.put("tenure", 18);
		
		return ResponseEntity.ok(hm);
		
	}
}
