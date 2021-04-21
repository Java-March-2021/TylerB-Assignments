package com.tylerbeck.productsandcategories.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tylerbeck.productsandcategories.models.Category;
import com.tylerbeck.productsandcategories.models.Product;
import com.tylerbeck.productsandcategories.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository cRepo;
	
	public Category createCategory(Category category) {
		return cRepo.save(category);
	}
	
	public Category findOneCategory(Long id) {
		return cRepo.findById(id).orElse(null);
	}
	
	public List<Category> findAll(){
		return cRepo.findAll();
	}

	public List<Category> findAllBut(Product oneProduct) {
		List<Category> categories = cRepo.findByProductsNotContains(oneProduct);
		return categories;
	}
	
	public void addProduct(Product product, Category category) {
		List<Product> products = category.getProducts();
		products.add(product);
		this.cRepo.save(category);
	}
}
