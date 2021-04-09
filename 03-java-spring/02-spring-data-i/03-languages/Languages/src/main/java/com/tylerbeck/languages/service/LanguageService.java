package com.tylerbeck.languages.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.tylerbeck.languages.models.Language;
import com.tylerbeck.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository langRepo;
	
	public LanguageService(LanguageRepository langRepo) {
		this.langRepo = langRepo;
	}
	
	public List<Language> allLanguages() {
		return langRepo.findAll();
	}

	public Language findLang(Long id) {
		return this.langRepo.findById(id).orElse(null);
	}
	
	public Language createLang(Language newLang) {
		return this.langRepo.save(newLang);
	}

	public void updateLang(@Valid Language lang) {
		this.langRepo.save(lang);
	}

	public void deleteLang(Long id) {
		langRepo.deleteById(id);
		
	}

}
