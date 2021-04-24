package com.tylerbeck.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tylerbeck.dojooverflow.models.Question;
import com.tylerbeck.dojooverflow.models.Tag;
import com.tylerbeck.dojooverflow.service.AnswerService;
import com.tylerbeck.dojooverflow.service.QuestionService;
import com.tylerbeck.dojooverflow.service.TagService;

@Controller
public class HomeController {
	@Autowired
	QuestionService qService;
	@Autowired
	AnswerService aService;
	@Autowired
	TagService tService;
	
	@GetMapping("")
	public String dashboard(Model viewModel) {
		viewModel.addAttribute("questions", qService.allQuestions());
		return "dashboard.jsp";
	}
	
	@GetMapping("new")
	public String newQuestion(@ModelAttribute("newQuestion") Question question) {
		return "newQuestion.jsp";
	}
	
	//This controller is rather large. It currently is posting data to the database, but I get an error when it tries to add the Tag to the Question.
	//I noticed the solution on the assignment has models for TagQuestion and NewQuestion instead of tagging the many to many in the simple version of each model. 
	//Why this way instead? Can I get it to work without this method?
	//It's hard to learn anything from the solutions when they use advanced ways to solve the task that we aren't really taught. 
	
	@PostMapping("ask")
	public String addQuestion(@Valid @ModelAttribute("newQuestion") Question question, @RequestParam("tag") String tag, BindingResult result) {
		String[] tagArray = tService.separateString(tag);
		if (tagArray.length > 3) {
			result.rejectValue("tag", "Please enter 3 tags or less");
			//This is also the frustrating part because we didn't learn custom validations until after this assignment was supposed to be done. 
		} else if(result.hasErrors()) {
			return "newQuestion.jsp";
			
		} else {
			qService.create(question);
			for(int i = 0; i < tagArray.length; i++) {
				String tagToConvert = tagArray[i];
				Tag newTag = new Tag(tagToConvert);
				tService.create(newTag);
				qService.addTag(newTag, question); //ERROR HAPPENS HERE
			}
		}
		return "redirect:/";
	}
}
