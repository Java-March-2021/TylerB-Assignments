package com.tylerbeck.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping(path="/submit", method=RequestMethod.POST)
	public String submit(HttpSession session,
			@RequestParam(value="name") String name,
			@RequestParam(value="location") String location,
			@RequestParam(value="language") String language,
			@RequestParam(value="comment") String comment) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result(HttpSession session) {
		session.getAttribute("name");
		session.getAttribute("location");
		session.getAttribute("language");
		session.getAttribute("comment");
		return "result.jsp";
	}
}
