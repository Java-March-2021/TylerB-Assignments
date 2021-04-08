package com.tylerbeck.books.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tylerbeck.books.models.Book;
import com.tylerbeck.books.service.BookService;

@Controller
public class BookController {
	
	private final BookService bService;
	public BookController(BookService service) {
		this.bService = service;
	}
	
	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> books = bService.allBooks();
		model.addAttribute("books", books);
		return "books/index.jsp";
	}
	
	@RequestMapping("/books/new")
	public  String newBook(@ModelAttribute("book") Book book) {
		return "books/new.jsp";
	}
	
	@RequestMapping(value="/books/create", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "books/new.jsp";
		} else {
			bService.createBook(book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping("/books/{id}")
	public String showBook(Model model, @PathVariable Long id) {
		Book book = this.bService.findBook(id);
		model.addAttribute("book", book);
		return "books/show.jsp";
	}
	
	@RequestMapping("/books/{id}/edit")
	public String editBook(@PathVariable("id") Long id, Model model) {
		Book book = bService.findBook(id);
		if (book != null) {
			model.addAttribute("book", book);
			return "books/editBook.jsp";
		} else {
			return "redirect:/books";
		}
	}
	
	@PostMapping("books/{id}/edit")
	public String updateBook(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "books/editBook.jsp";
		} else {
			bService.updateBook(id, book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping("books/delete/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		bService.deleteBook(id);
		return "redirect:/books";
	}
}
