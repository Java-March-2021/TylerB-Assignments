package com.tylerbeck.driverslicense.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tylerbeck.driverslicense.models.License;
import com.tylerbeck.driverslicense.models.Person;
import com.tylerbeck.driverslicense.service.LicenseService;
import com.tylerbeck.driverslicense.service.PersonService;

@Controller
public class LicenseController {

	@Autowired
	private PersonService pService;
	
	@Autowired
	private LicenseService lService;
	
	@RequestMapping("")
	public String home() {
		return "index.jsp";
	}
	
	@GetMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "persons/newPerson.jsp";
	}
	
	//WORKS
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license") License license, Model viewModel) {
		viewModel.addAttribute("persons", pService.allPersons());
		return "licenses/newLicense.jsp";
	}
	
	//HELP
	@PostMapping("/licenses/addLicense")
	public String addLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "licenses/newLicense.jsp";
		} else {
			lService.create(license);
			Long id = license.getPerson().getId();
			return "redirect:/persons/show/" + id;
		}
	}
	
	//COMPLETE - WORKS 
	@RequestMapping("persons/show/{id}")
	public String showPerson(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("person", this.pService.getOnePerson(id));
		return "persons/showPerson.jsp";
	}
	
	@PostMapping("persons/addPerson")
	public String addPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "persons/newPerson.jsp";
		} else {
			pService.create(person);
			Long id = person.getId();
			return "redirect:/persons/show/" + id;
		}
	}
}
