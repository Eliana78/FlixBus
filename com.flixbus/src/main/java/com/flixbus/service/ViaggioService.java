package com.flixbus.service;

import java.util.List;

import com.flixbus.entities.Viaggio;

public interface ViaggioService {

	
	List<Viaggio> getViaggi();
	List<Viaggio> getFirstTenViaggi();
	Viaggio getViaggioById(int id);
	Viaggio addViaggio(Viaggio v);
	Viaggio updateViaggio(Viaggio v);
	void deleteViaggio(Viaggio v);
	
	
	
}
