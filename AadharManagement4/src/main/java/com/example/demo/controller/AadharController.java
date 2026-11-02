package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AadharDto;
import com.example.demo.service.AadharService;

@RestController
public class AadharController {
	
	@Autowired
	AadharService aadharService;
	
	@PostMapping("aadhar")
	ResponseEntity assignAadhar(@RequestBody AadharDto aadharDto) {
		aadharService.addAadharForPerson(aadharDto);
		return new ResponseEntity(HttpStatus.CREATED);
		
	}

}
