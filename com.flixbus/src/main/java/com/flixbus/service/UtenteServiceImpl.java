package com.flixbus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flixbus.entities.Utente;
import com.flixbus.repo.UtenteRepo;


@Service
public class UtenteServiceImpl implements UtenteService {
	
	
	@Autowired
	private UtenteRepo utenteRep ;
	
	@Override
	public List<Utente> getUtenti() {
		return utenteRep.findAll();
	}

	
	@Override
	public Utente getUtenteById(int id) {
		
		return utenteRep.getById(id); 
	}

	@Override
	public Utente addUtente(Utente u) {
		return utenteRep.save(u);
	}

	@Override
	public Utente updateUtente(Utente u) {
		
		return utenteRep.save(u);
	}

	@Override
	public void deleteUtente(Utente u) {
		utenteRep.delete(u);
		
	}

	@Override
	public Utente getUtenteByEmail(String email) {
		
		return utenteRep.findByEmail(email);
	}

}
