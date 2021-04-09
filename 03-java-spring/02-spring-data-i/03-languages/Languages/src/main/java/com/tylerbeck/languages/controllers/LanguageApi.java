package com.tylerbeck.languages.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tylerbeck.languages.models.Language;
import com.tylerbeck.languages.service.LanguageService;
@RestController
public class LanguageApi {
	private final LanguageService langService;
	
	public LanguageApi(LanguageService langService) {
		this.langService = langService;
	}
	
	@RequestMapping("/api/languages/{id}")
	public Language show(@PathVariable("id") Long id) {
		return langService.findLang(id);
	}
}
