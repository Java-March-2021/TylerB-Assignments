package com.tylerbeck.routingpractice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{param}")
	public String home() {
		return "The dojo is awesome";
	}
	@RequestMapping("/{param}/burbank")
	public String burbank(@PathVariable ("param") String parameter) {
		return "Burbank " + parameter + " is located in Southern California";
	}
	@RequestMapping("/{param}/san-jose")
	public String sanJose(@PathVariable ("param") String parameter) {
		return "SJ " + parameter + " is the headquarters";
	}
	
}
