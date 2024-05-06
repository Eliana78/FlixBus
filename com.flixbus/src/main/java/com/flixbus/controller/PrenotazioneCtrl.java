package com.flixbus.controller;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flixbus.entities.Prenotazione;

import com.flixbus.service.PrenotazioneService;

@RestController
//@RequestMapping("api")
public class PrenotazioneCtrl {

	
	@Autowired
	private PrenotazioneService service;
	
	
	@GetMapping("prenotazioni")
	@CrossOrigin
	public Set<Prenotazione> getPrenotazione(){
		return service.getPrenotazioni();
	}
	
	@GetMapping("prenotazioni/{id}")
	@CrossOrigin
	public Prenotazione getPrenotazioneById(int id) {
		return service.getPrenotazioneById(id);
	}
	
	@PostMapping("prenotazioni/add")
	@CrossOrigin
	public Prenotazione addPrenotazione(@RequestBody Prenotazione p) {
		return service.addPrenotazione(p);
		
		
	}
	
	@PutMapping
	@CrossOrigin
	public Prenotazione updatePrenotazione( @RequestBody Prenotazione p) {
		return service.updatePrenotazione(p);
	}
	

	@DeleteMapping("delete/{id}")
	@CrossOrigin
	public void deletePrenotazione (@PathVariable int id) {
		service.deletePrenotazione(service.getPrenotazioneById(id));
		
	}
	
	
}
