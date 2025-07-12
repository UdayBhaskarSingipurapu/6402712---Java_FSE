package com.jwt01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jwt01.model.User;
import com.jwt01.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new CustomUserDetails(userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username not found")));
		
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}

}
