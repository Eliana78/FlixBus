package com.flixbus.service;

import java.util.Set;

import com.flixbus.entities.Prenotazione;

public interface PrenotazioneService {

	Set<Prenotazione> getPrenotazioni();
	Prenotazione getPrenotazioneById(int id);
	Prenotazione addPrenotazione(Prenotazione p);
	Prenotazione updatePrenotazione(Prenotazione p);
	void deletePrenotazione (Prenotazione p);
	
	
	
	
	
}
