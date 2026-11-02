package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Batch {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String mode;
	private String time;
	private int duration;
	
	@ManyToMany(mappedBy="batches")
	private List<Trainer>trainers;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMode() {
		return mode;
	}
	public String getTime() {
		return time;
	}
	public int getDuration() {
		return duration;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public List<Trainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}
	
	
	

}
