package com.tylerbeck.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tylerbeck.books.models.Book;

@Repository 
public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findAll();
	
	List<Book> findByAuthor(String search);
	
	Long countByTitleContaining(String search);
	
	Long deleteByTitleStartingWith(String search);
}
