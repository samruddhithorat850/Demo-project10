package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AadharDto;
import com.example.demo.entity.Aadhar;
import com.example.demo.entity.Person;
import com.example.demo.repository.AadharRepository;
import com.example.demo.repository.PersonRepository;

@Service
public class AadharServiceImpl implements AadharService{
	
	@Autowired
	AadharRepository aadharRepo;
	
	@Autowired
	PersonRepository personRepo;

	@Override
	public void addAadharForPerson(AadharDto aadharDto) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.setName(aadharDto.getPersonName());
		p.setAddress(aadharDto.getAddress());
		Person savedPerson=personRepo.save(p);
		
		
		Aadhar a=new Aadhar();
		a.setAadharNumber(aadharDto.getAadharNumber());
		a.setPerson(savedPerson);
		aadharRepo.save(a);
		
		
	}

}
