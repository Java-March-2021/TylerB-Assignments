package com.tylerbeck.loginregistration.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tylerbeck.loginregistration.models.User;
import com.tylerbeck.loginregistration.service.LoginService;
import com.tylerbeck.loginregistration.validators.UserValidator;

@Controller
public class HomeController {
	@Autowired
	LoginService lService;
	@Autowired
	private UserValidator validator;
	
	@RequestMapping("/login")
	public String registerForm(@ModelAttribute("user") User user) {
	    return "loginRegistration.jsp";
	}
	
	@PostMapping(value="/register")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
	    validator.validate(user, result);
		if(result.hasErrors()) {
	    	return "loginRegistration.jsp";
	    }
	    User newUser = this.lService.registerUser(user);
	    session.setAttribute("user__id", newUser.getId());
	    return "redirect:/home";
	}
	
	@PostMapping(value="/login")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, RedirectAttributes redirectAttrs, HttpSession session) {
	    if(!this.lService.authenticateUser(email, password)) {
	    	redirectAttrs.addFlashAttribute("loginError", "Invalid Credentials");
	    	return "redirect:/login";
	    }
	    User user = this.lService.getByEmail(email);
	    session.setAttribute("user__id", user.getId());
	    return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home(HttpSession session, Model model) {
	    Long userId = (Long)session.getAttribute("user__id");
	    User user = this.lService.find(userId);
	    model.addAttribute("user", user);
	    return "home.jsp";
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate();
	    return "redirect:/login";
	}	
}
