package com.jwt01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt01.dto.AuthRequest;
import com.jwt01.dto.AuthResponse;
import com.jwt01.model.User;
import com.jwt01.service.UserDetailsServiceImpl;
import com.jwt01.utils.JwtUtil;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
public class AuthController {
	private static Logger log = LoggerFactory.getLogger(AuthController.class);
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody User user) {
	    User userSave = new User();
	    userSave.setUsername(user.getUsername());
	    userSave.setPassword(passwordEncoder.encode(user.getPassword()));
	    String role = user.getRole();
	    if (role != null && !role.startsWith("ROLE_")) {
	        role = "ROLE_" + role.toUpperCase(); 
	    }
	    userSave.setRole(role);
	    userDetailsService.saveUser(userSave);
	    return ResponseEntity.ok("Registered successfully");
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody AuthRequest authRequest){
		log.info("Login Request Reached with credentials {}", authRequest);
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		
		log.info("User Authenticated Successuflly");
		UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getUsername());
		String jwtToken = jwtUtil.generateToken(userDetails);
		log.info("JWT Token Generated successfully");
		log.info("Sending JWT Token to Client");
		return ResponseEntity.ok(new AuthResponse(jwtToken));
		
	}
	
}
