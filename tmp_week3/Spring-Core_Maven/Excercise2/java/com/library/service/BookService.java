package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	BookRepository repository;
	
	public BookService() {
		System.out.println("Book Service Bean is created");
	}
	
	public void setRepository(BookRepository repository) {
		this.repository = repository;
		System.out.println("Setter method called and BookRepository reference is Injected");
	}

}
