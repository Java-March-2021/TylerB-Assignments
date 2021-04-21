package com.tylerbeck.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tylerbeck.productsandcategories.models.Category;
import com.tylerbeck.productsandcategories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}
