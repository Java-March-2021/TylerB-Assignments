package com.tylerbeck.code.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(@ModelAttribute("errors") String errors) {
		System.out.println(errors);
		return "index.jsp";
	}
	
	@RequestMapping(path="/code", method=RequestMethod.POST)
	public String codeEntry(@RequestParam(value="code") String code) {
		System.out.println(code);
		String secretCode = "bushido";
		if(code.equals(secretCode)) {
			System.out.println("code recieved");
			return "redirect:/secretpage";
		} else {
			System.out.println("code not recieved");
			return "redirect:/errors";
		}
	}
	
	@RequestMapping("/secretpage")
	public String secretPage() {
		return "secretpage.jsp";
	}
	
	@RequestMapping("/errors")
	public String errors(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("errors", "You must train harder!");
		return "redirect:/";
	}
}
