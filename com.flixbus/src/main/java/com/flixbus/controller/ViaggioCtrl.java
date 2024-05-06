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


import com.flixbus.entities.Viaggio;
import com.flixbus.service.ViaggioService;



@RestController
@RequestMapping("api")
public class ViaggioCtrl {
	
	@Autowired
	private ViaggioService service;

	
	@GetMapping("viaggi")
	@CrossOrigin
	public List<Viaggio> getViaggi(){
	return	service.getViaggi();
	}
	
	@GetMapping("viaggi/topTen")
	@CrossOrigin
	public List<Viaggio> getFirstTenViaggi(){
	return	service.getFirstTenViaggi();
	}
	
	@GetMapping("viaggi/{id}")
	@CrossOrigin
	public Viaggio getViaggioById(@PathVariable int id){
	return	service.getViaggioById(id);
	}
	
	@PostMapping("viaggi/add")
	@CrossOrigin
	public Viaggio addViaggio(@RequestBody Viaggio v) {
		return service.addViaggio(v);
	}
	

	@PutMapping("viaggi/update")
	@CrossOrigin
	public Viaggio updateViaggio( @RequestBody Viaggio v) {
		return service.updateViaggio(v);
	}
	
	@DeleteMapping("viaggi/{id}")
	@CrossOrigin
	public void deleteViaggio (@PathVariable int id) {
		service.deleteViaggio(service.getViaggioById(id));
		
	}
	
}
