package com.tylerbeck.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tylerbeck.productsandcategories.models.Category;
import com.tylerbeck.productsandcategories.models.Product;
import com.tylerbeck.productsandcategories.service.CategoryService;
import com.tylerbeck.productsandcategories.service.ProductService;

@Controller
public class ProductCategoryController {
	
	@Autowired
	private ProductService pService;
	
	@Autowired
	private CategoryService cService;
	
	@GetMapping("")
	public String index(Model viewModel) {
		viewModel.addAttribute("products", pService.findAllProducts());
		viewModel.addAttribute("categories", cService.findAll());
		return "index.jsp";
	}
	
	@GetMapping("categories/new")
	public String addCategory(@ModelAttribute("category") Category category) {
		return "newCategory.jsp";
	}
	
	@PostMapping("categories/new")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newCategory.jsp";
		} else {
			cService.createCategory(category);
			return "redirect:/ ";
		}
	}
	
	@GetMapping("products/new")
	public String addProduct(@ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	}
	
	@PostMapping("products/new")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newProduct.jsp";
		} else {
			pService.createProduct(product);
			return "redirect:/ ";
		}
	}
	

	@GetMapping("products/{id}")
	public String showProduct(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("product", pService.getOneProduct(id));
		viewModel.addAttribute("categories", this.cService.findAllBut(pService.getOneProduct(id)));
		return "showProduct.jsp";
	}
	
	@PostMapping("products/add/{id}")
	public String addCatToProduct(@PathVariable("id") Long id, @RequestParam("category") Long catId) {
		Product productToAddCat = this.pService.getOneProduct(id);
		Category catToAdd = this.cService.findOneCategory(catId);
		this.pService.addCategory(productToAddCat, catToAdd);
		return "redirect:/products/{id}";
	}
	
	@GetMapping("categories/{id}")
	public String showCategory(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("category", cService.findOneCategory(id));
		viewModel.addAttribute("products", this.pService.findAllBut(cService.findOneCategory(id)));
		return "showCategory.jsp";
	}
	
	@PostMapping("categories/add/{id}")
	public String addProductToCat(@PathVariable("id") Long id, @RequestParam("product") Long prodId) {
		Category catToUpdate = this.cService.findOneCategory(id);
		Product prodToAdd = this.pService.getOneProduct(prodId);
		this.cService.addProduct(prodToAdd, catToUpdate);
		return "redirect:/categories/{id}";
	}
}
