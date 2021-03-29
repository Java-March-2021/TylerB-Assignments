package com.tylerbeck.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String human(Model viewModel) {
		viewModel.addAttribute("name", "Human");
		return "index.jsp";
	}
	
	@RequestMapping("/{name}")
	public String hello(@PathVariable("name") String name, Model viewModel) {
		viewModel.addAttribute("name", name);
		return "index.jsp";
	}
}
