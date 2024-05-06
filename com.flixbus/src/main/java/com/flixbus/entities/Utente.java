package com.flixbus.entities;

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
@Table(name="utenti")
public class Utente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	private String name;
	private String surname;
	
	@Column(name="phone_number")
	private String phoneNumber;
	private String email;
	private String cartaCredito;
	
	@OneToMany(mappedBy = "utente",cascade = CascadeType.ALL)
	@JsonIgnore
	Set<Prenotazione> prenotazioni;
	
	
public Utente() {
	// TODO Auto-generated constructor stub
}



	public Utente(int id, String name, String surname, String phoneNumber, String email, String cartaCredito,
			Set<Prenotazione> prenotazioni) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.cartaCredito = cartaCredito;
		this.prenotazioni = prenotazioni;
	}



	public String getCartaCredito() {
		return cartaCredito;
	}



	public void setCartaCredito(String cartaCredito) {
		this.cartaCredito = cartaCredito;
	}



	public Set<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}



	public void setPrenotazioni(Set<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	
	
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
