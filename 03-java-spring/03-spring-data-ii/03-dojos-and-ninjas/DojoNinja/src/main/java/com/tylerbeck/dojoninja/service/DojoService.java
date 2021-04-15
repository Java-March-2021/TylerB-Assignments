package com.tylerbeck.dojoninja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tylerbeck.dojoninja.models.Dojo;
import com.tylerbeck.dojoninja.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dojoRepo;
	
	public Dojo getOneDojo(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}
	
	public Dojo create(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public List<Dojo> findAll(){
		return dojoRepo.findAll();
	}
}
