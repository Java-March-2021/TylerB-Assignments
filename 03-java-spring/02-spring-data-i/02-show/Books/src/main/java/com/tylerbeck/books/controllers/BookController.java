package com.tylerbeck.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tylerbeck.books.models.Book;
import com.tylerbeck.books.service.BookService;

@Controller
public class BookController {
	
	private BookService bService;
	public BookController(BookService service) {
		this.bService = service;
	}
	
	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
	@RequestMapping("/{id}")
	public String showBook(Model model, @PathVariable Long id) {
		Book book = this.bService.getOneBook(id);
		model.addAttribute("book", book);
		return "new.jsp";
	}
	
	// localhost:8080/create POST
	@PostMapping("create")
	public Book createBook(Book book) {
		return this.bService.createBook(book);
		}
	
}
