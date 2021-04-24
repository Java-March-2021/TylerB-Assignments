package com.tylerbeck.dojooverflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tylerbeck.dojooverflow.repositories.AnswerRepository;

@Service
public class AnswerService {
	@Autowired
	AnswerRepository aRepo;
	
	
}
