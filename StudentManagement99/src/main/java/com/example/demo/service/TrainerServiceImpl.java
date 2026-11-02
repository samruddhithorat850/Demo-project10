package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Batch;
import com.example.demo.entity.Trainer;
import com.example.demo.repository.BatchRepository;
import com.example.demo.repository.TrainerRepository;

@Service
public class TrainerServiceImpl implements TrainerService{
	
	@Autowired
	TrainerRepository trainerRepo;
	
	@Autowired
	BatchRepository batchRepo;

	@Override
	public void saveTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		trainerRepo.save(trainer);
		
	}

	@Override
	public Trainer getTrainer(int id) {
		// TODO Auto-generated method stub
		return trainerRepo.findById(id).get();
	}

	@Override
	public void assignBatch(int trainerId, int batchId) {
		// TODO Auto-generated method stub
		Trainer trainer=trainerRepo.findById(trainerId).get();
		Batch batch=batchRepo.findById(batchId).get();	
		trainer.getBatches().add(batch);
		batch.getTrainers().add(trainer);
		trainerRepo.save(trainer);
		batchRepo.save(batch);
		}

}
