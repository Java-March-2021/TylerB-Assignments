package com.tylerbeck.books.service;

import java.util.List;
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
	
	public List<Book> allBooks(){
		return bRepo.findAll();
	}
	
	public Book findBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	
	public Book createBook(Book newBook) {
		return this.bRepo.save(newBook);
	}

	
//	private List<Book> books = new ArrayList(Arrays.asList(
//	            new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
//	            new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180),
//	            new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
//	            new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
//	            new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)
//	            ));
//	    
//	    public List<Book> allBooks() {
//	        return books;
//	    }
	    
//	    public Book findBookByIndex(int index) {
//	        if (index < books.size()){
//	            return books.get(index);
//	        }else{
//	            return null;
//	        }
//	    }
	
	
//	 public void updateBook(int id, Book book) {
//	        if (id < books.size()){
//	            books.set(id, book);
//	        }
//	    }
	
	public void updateBook(Long id, Book book) {
		this.bRepo.save(book);
	}

	public void deleteBook(Long id) {
		this.bRepo.deleteById(id);
	}

	public Book updateBook(Long id, String title, String author, String lang, Integer pages) {
		Book book = bRepo.findById(id).orElse(null);
		book.setTitle(title);
		book.setAuthor(author);
		book.setLanguage(lang);
		book.setPages(pages);
		bRepo.save(book);
		return null;
	}
}
