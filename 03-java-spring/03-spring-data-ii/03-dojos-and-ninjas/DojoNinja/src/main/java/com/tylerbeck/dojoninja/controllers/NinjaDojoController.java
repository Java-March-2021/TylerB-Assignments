package com.tylerbeck.dojoninja.controllers;

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

import com.tylerbeck.dojoninja.models.Dojo;
import com.tylerbeck.dojoninja.models.Ninja;
import com.tylerbeck.dojoninja.service.DojoService;
import com.tylerbeck.dojoninja.service.NinjaService;

@Controller
public class NinjaDojoController {

	@Autowired
	private NinjaService nService;
	
	@Autowired
	private DojoService dService;
	
	
	@RequestMapping("")
	public String index(Model viewModel) {
		viewModel.addAttribute("dojos", dService.findAll());
		return "index.jsp";
	}
	
	@GetMapping("dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		} else {
			dService.create(dojo);
			return "redirect:/";
		}
	}
	
	@GetMapping("ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		viewModel.addAttribute("dojo", dService.findAll());
		return "newNinja.jsp";
	}
	
	@PostMapping("ninjas/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "newNinja.jsp";
		} else {
			nService.create(ninja);
			return "redirect:/";
		}
	}
	
	@GetMapping("dojos/{id}")
	public String showNinjas(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("dojo", dService.getOneDojo(id));
		viewModel.addAttribute("ninjas", dService.getOneDojo(id).getNinjas());
		return "show.jsp";
	}
}
