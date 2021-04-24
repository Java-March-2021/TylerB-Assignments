package com.tylerbeck.dojooverflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tylerbeck.dojooverflow.models.Question;
import com.tylerbeck.dojooverflow.models.Tag;
import com.tylerbeck.dojooverflow.repositories.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	QuestionRepository qRepo;

	public List<Question> allQuestions() {
		return this.qRepo.findAll();
	}
	
	public Question create(Question question) {
		return this.qRepo.save(question);
	}
	
	public void addTag(Tag tag, Question question) {
		List<Tag> tags = question.getTags();
		tags.add(tag);
		this.qRepo.save(question);
	}
	
	
}
