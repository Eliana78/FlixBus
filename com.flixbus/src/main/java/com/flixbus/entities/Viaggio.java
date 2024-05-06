package com.flixbus.entities;

import java.time.LocalDate;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="viaggio")
public class Viaggio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String departure;
	private String destination;
	@Column(name="trip_date")
	private LocalDate tripDate;
	@Column(name="available_spots")
	private int availableSpots;
	private double price;   
	
	@OneToMany(mappedBy="viaggio",cascade = CascadeType.ALL)
	@JsonIgnore
	Set<Prenotazione> prenotazioni;


	
	
	public Viaggio() {
		super();
	}


	public Viaggio(int id, String departure, String destination, int numberOfDays, LocalDate tripDate,
			int availableSpots, double price, Set<Prenotazione> prenotazioni) {
		super();
		this.id = id;
		this.departure = departure;
		this.destination = destination;
		this.tripDate = tripDate;
		this.availableSpots = availableSpots;
		this.price = price;
		this.prenotazioni = prenotazioni;
	}




	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDeparture() {
		return departure;
	}



	public void setDeparture(String departure) {
		this.departure = departure;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public LocalDate getTripDate() {
		return tripDate;
	}



	public void setTripDate(LocalDate tripDate) {
		this.tripDate = tripDate;
	}



	public int getAvailableSpots() {
		return availableSpots;
	}



	public void setAvailableSpots(int availableSpots) {
		this.availableSpots = availableSpots;
	}



	public Set<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}



	public void setPrenotazioni(Set<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}



	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
