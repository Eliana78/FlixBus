package com.flixbus.service;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flixbus.entities.Prenotazione;
import com.flixbus.repo.PrenotazioneRepo;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {
	
	@Autowired
	PrenotazioneRepo prenotazioneRep;
	
	
	@Override
	public Set<Prenotazione> getPrenotazioni() {
		
//		Set<Prenotazione> set = new HashSet<Prenotazione>();
//		set.addAll(prenotazioneRep.findAll());
		
		return new HashSet<Prenotazione>(prenotazioneRep.findAll());
	}

	@Override
	public Prenotazione getPrenotazioneById(int id) {
		
		return prenotazioneRep.findById(id).get();
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		
		return prenotazioneRep.save(p);
	}

	@Override
	public Prenotazione updatePrenotazione(Prenotazione p) {
		
		return prenotazioneRep.save(p);
	}

	@Override
	public void deletePrenotazione(Prenotazione p) {
		prenotazioneRep.delete(p);

	}

}
