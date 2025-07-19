package com.cognizant.microservices.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AccountController {
	
	@GetMapping("/accounts/{number}")
	public ResponseEntity<Map<String, Object>> getDetails(@PathVariable String number){
		Map<String, Object> hm = new HashMap<>();
		hm.put("number", number);
		hm.put("type", "savings");
		hm.put("balance", 234343);
		
		return ResponseEntity.ok().body(hm);
		
	}
}
