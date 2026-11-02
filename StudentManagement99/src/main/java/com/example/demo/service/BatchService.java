package com.example.demo.service;

import com.example.demo.entity.Batch;

public interface BatchService {
	
	public void saveBatch(Batch batch);
	
	Batch getBatch(int id);
	

}
