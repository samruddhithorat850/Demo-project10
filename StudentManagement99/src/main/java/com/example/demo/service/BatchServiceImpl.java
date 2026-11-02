package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Batch;
import com.example.demo.repository.BatchRepository;

@Service
public class BatchServiceImpl implements BatchService{
	
	@Autowired
	BatchRepository batchRepo;

	@Override
	public void saveBatch(Batch batch) {
		// TODO Auto-generated method stub
		batchRepo.save(batch);
		
	}

	@Override
	public Batch getBatch(int id) {
		// TODO Auto-generated method stub
		return batchRepo.findById(id).get();
	}

}
