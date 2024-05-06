package com.flixbus.service;

import java.util.List;

import com.flixbus.entities.Utente;

public interface UtenteService {

	List<Utente> getUtenti();
	Utente getUtenteById(int id);
	Utente addUtente(Utente u);
	Utente updateUtente(Utente u);
	void deleteUtente(Utente u);
	Utente getUtenteByEmail(String email);
	
	
}
