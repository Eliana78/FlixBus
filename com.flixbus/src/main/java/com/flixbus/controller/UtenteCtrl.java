package com.flixbus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flixbus.entities.Utente;
import com.flixbus.service.UtenteService;


@RestController
@RequestMapping("api")
public class UtenteCtrl {

	@Autowired
	private UtenteService service;
	
	
	@GetMapping("utenti")
	@CrossOrigin
	public List<Utente> getUtenti(){
		return service.getUtenti();
	}
	
	@GetMapping("utenti/{id}")
	@CrossOrigin
	public Utente getUtenteById(@PathVariable int id){
		return service.getUtenteById(id);
	}
	
	@GetMapping("utente/{email}")
	@CrossOrigin
	public Utente getUtenteByEmail(@PathVariable String email) {
		return service.getUtenteByEmail(email);
	}
	
	@PostMapping("utentei/add")
	@CrossOrigin
	public Utente addUtente(@RequestBody Utente u) {
		return service.addUtente(u);
	}
	
	
	@PutMapping("utenti/update")
	@CrossOrigin
	public Utente updateUtente( @RequestBody Utente u) {
		return service.updateUtente(u);
	}
	
	@DeleteMapping("delete/{id}")
	@CrossOrigin
	public void deleteUtente (@PathVariable int id) {
		service.deleteUtente(service.getUtenteById(id));
		
	}
	
	
}
