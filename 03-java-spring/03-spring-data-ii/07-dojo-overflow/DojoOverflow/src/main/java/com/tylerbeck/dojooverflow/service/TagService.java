package com.tylerbeck.dojooverflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tylerbeck.dojooverflow.models.Tag;
import com.tylerbeck.dojooverflow.repositories.TagRepository;

@Service
public class TagService {
	@Autowired
	TagRepository tRepo;
	
	public Tag create(Tag tag) {
		return tRepo.save(tag);
	}
	
	public String[] separateString(String tagInput){
		String[] tagArray = tagInput.split(",");
		return tagArray;
	}
	
	// I also had this in my controller, I'm assuming best practices is to have it here rather than make the controller large.
	public void createFromString(String[] tagArray) {
		for(int i = 0; i < tagArray.length; i++) {
			String tagToConvert = tagArray[i];
			Tag tag = new Tag(tagToConvert);
			create(tag);
		}
	}
	
	public List<Tag> duplicateChecker(String tag) {
		return tRepo.findBySubjectContaining(tag);
	}
}
