package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Trainer;
import com.example.demo.repository.BatchRepository;
import com.example.demo.service.TrainerService;

@RestController
public class TrainerController {
	
	@Autowired
	TrainerService trainerService;
	
	
	
	@PostMapping("trainer")
	ResponseEntity addTrainer(@RequestBody Trainer trainer) {
		trainerService.saveTrainer(trainer);
		return new ResponseEntity(HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("assign/{trainerId}/{batchId}")
	ResponseEntity assignBatch(@PathVariable int trainerId,@PathVariable int batchId) {
		trainerService.assignBatch(trainerId, batchId);
		return new ResponseEntity(HttpStatus.CREATED);
	}

}
