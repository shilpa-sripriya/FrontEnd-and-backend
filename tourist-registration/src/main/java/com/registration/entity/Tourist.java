package com.registration.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tourist {
	
	@Id
	private long id;
	private String name;
	private String gender;
	private int age;
	private String fromPlace;
	private long numberOfDaysVisit;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public long getNumberOfDaysVisit() {
		return numberOfDaysVisit;
	}
	public void setNumberOfDaysVisit(long numberOfDaysVisit) {
		this.numberOfDaysVisit = numberOfDaysVisit;
	}
	public Tourist(long id, String name,  String gender, int age, String fromPlace, long numberOfDaysVisit) {
		super();
		this.id = id;
		this.name = name;
		
		this.gender = gender;
		this.age = age;
		this.fromPlace = fromPlace;
		this.numberOfDaysVisit = numberOfDaysVisit;
	}
	public Tourist() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	}
	

	


