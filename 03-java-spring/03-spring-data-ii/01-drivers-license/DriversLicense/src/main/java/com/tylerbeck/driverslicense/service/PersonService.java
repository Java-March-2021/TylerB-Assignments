package com.tylerbeck.driverslicense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tylerbeck.driverslicense.models.Person;
import com.tylerbeck.driverslicense.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository pRepo;

	public Person create(Person person) {
		return this.pRepo.save(person);
	}
	
	public Object getOnePerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Person> allPersons() {
		return pRepo.findAll();
	}
}
