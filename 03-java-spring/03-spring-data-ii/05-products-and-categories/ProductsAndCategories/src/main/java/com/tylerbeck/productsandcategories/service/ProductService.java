package com.tylerbeck.productsandcategories.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tylerbeck.productsandcategories.models.Category;
import com.tylerbeck.productsandcategories.models.Product;
import com.tylerbeck.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository pRepo;

	public Product createProduct(Product product) {
		return pRepo.save(product);
	}
	
	public Product getOneProduct(Long id) {
		return pRepo.findById(id).orElse(null);
	}
	
	public List<Product> findAllProducts(){
		return pRepo.findAll();
	}
	
	public void addCategory(Product product, Category category) {
		List<Category> categories = product.getCategories();
		categories.add(category);
		this.pRepo.save(product);
	}
	
	public List<Product> findAllBut(Category category){
		List<Product> products = this.pRepo.findByCategoriesNotContains(category);
		return products;
	}
}

	