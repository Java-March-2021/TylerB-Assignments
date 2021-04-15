package com.tylerbeck.dojoninja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tylerbeck.dojoninja.models.Ninja;
import com.tylerbeck.dojoninja.repositories.NinjaRepository;

@Service
public class NinjaService {

	@Autowired
	private NinjaRepository ninjaRepo;
	
	public Ninja getOneNinja(Long id) {
		return ninjaRepo.findById(id).orElse(null);
	}
	
	public Ninja create(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public List<Ninja> findAll(){
		return ninjaRepo.findAll();
	}
}
