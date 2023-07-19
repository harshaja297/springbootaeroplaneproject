package edu.jsp.aeroplane_app.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passenger {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private String name,gender;
	private long mob;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "{\nid : " + id + ",\n name : " + name + ",\n gender : " + gender + ", \nmob : " + mob + "\n}";
	}
	
	
}
