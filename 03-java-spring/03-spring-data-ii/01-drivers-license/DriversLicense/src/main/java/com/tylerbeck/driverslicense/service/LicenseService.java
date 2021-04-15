package com.tylerbeck.driverslicense.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tylerbeck.driverslicense.models.License;
import com.tylerbeck.driverslicense.repositories.LicenseRepository;

@Service
public class LicenseService {

	@Autowired
	private LicenseRepository lRepo;
	
	public License create(License license) {
		Long num = license.getPerson().getId();
		String number = String.format("%06d", num);
		license.setNumber(number);
		System.out.println(number);
		return this.lRepo.save(license);
	}
	
}
