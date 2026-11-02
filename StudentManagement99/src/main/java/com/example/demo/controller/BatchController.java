package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Batch;
import com.example.demo.service.BatchService;

@RestController
public class BatchController {
	
	@Autowired
	BatchService batchService;
	
	@PostMapping("batch")
	ResponseEntity addBatch(@RequestBody Batch batch) {
		batchService.saveBatch(batch);
		return new ResponseEntity(HttpStatus.CREATED);
		
	}

}
