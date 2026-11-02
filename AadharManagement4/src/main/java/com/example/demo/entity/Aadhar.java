package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Aadhar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String aadharNumber;
	
	@OneToOne
	@JoinColumn(name="person_id",referencedColumnName = "id")
	Person person;

	public int getId() {
		return id;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
