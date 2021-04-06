package com.tylerbeck.books.service;

import org.springframework.stereotype.Service;

import com.tylerbeck.books.models.Book;
import com.tylerbeck.books.repositories.BookRepository;

@Service
public class BookService {
	
	//connect to our repo
	private final BookRepository bRepo;
	//dependency injection using constructor
	public BookService(BookRepository repo) {
		this.bRepo = repo;
	}
	
	public Book getOneBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	
	public Book createBook(Book newBook) {
		return this.bRepo.save(newBook);
	}
}
