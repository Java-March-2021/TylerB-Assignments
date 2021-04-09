package com.tylerbeck.languages.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tylerbeck.languages.models.Language;
import com.tylerbeck.languages.service.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService langService;
	
	public LanguageController(LanguageService langService) {
		this.langService = langService;
	}
	
	
	@RequestMapping("/languages")
	public String index(@ModelAttribute("newLanguage") Language lang, Model model) {
		model.addAttribute("languages", langService.allLanguages());
		return "languages/index.jsp";
	}
	
	@PostMapping("/languages")
	public String addLanguage(@Valid @ModelAttribute("newLanguage") Language lang, BindingResult result) {
		if (result.hasErrors()) {
			return "languages/index.jsp";
		} else {
			System.out.println("Language Recieved");
			langService.createLang(lang);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/{id}")
	public String viewLang(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", langService.findLang(id));
		return "languages/show.jsp";
	}
	
	@RequestMapping("/languages/edit/{id}")
	public String editLang(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", langService.findLang(id));
		return "languages/edit.jsp";
	}
	
	@PutMapping("/languages/edit/{id}")
	public String updateLang(@Valid @ModelAttribute("language") Language lang, BindingResult result) {
		if (result.hasErrors()) {
			return "languages/edit.jsp";
		} else {
			langService.updateLang(lang);
			return "redirect:/languages/";
		}
	}
	
	@DeleteMapping("languages/delete/{id}")
	public String deleteLang(@PathVariable("id") Long id) {
		langService.deleteLang(id);
		return "redirect:/languages";
	}
}
