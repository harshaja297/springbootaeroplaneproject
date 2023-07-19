package edu.jsp.aeroplane_app.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Aeroplane {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String name,departure,arrival;
	private int capacity;
	@OneToMany
	private List<Passenger> passengers;
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
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	@Override
	public String toString() {
		return "{\nid : " + id + ",\n name : " + name + ",\n departure : " + departure + ",\n arrival : " + arrival
				+ ",\n capacity : " + capacity + ", \npassengers : " + passengers + "\n}";
	}


	
}
