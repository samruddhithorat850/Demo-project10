package com.example.demo.service;

import com.example.demo.entity.Trainer;

public interface TrainerService {
	
	public void saveTrainer(Trainer trainer);
	
	Trainer getTrainer(int id);
	
	void assignBatch(int trainerId,int batchId );

}
