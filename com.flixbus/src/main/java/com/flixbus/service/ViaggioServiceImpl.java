package com.flixbus.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flixbus.entities.Viaggio;
import com.flixbus.repo.ViaggioRepo;


@Service 
public class ViaggioServiceImpl implements ViaggioService {

	
	@Autowired
	private ViaggioRepo viaggioRepo;
	
	@Override
	public List<Viaggio> getViaggi() {
		
		return viaggioRepo.findAll();
	}

	@Override
	public List<Viaggio> getFirstTenViaggi() {
		
		return viaggioRepo.getFirstTenViaggi();
}

	@Override
	public Viaggio getViaggioById(int id) {
		
		return viaggioRepo.findById(id).get();
	}

	@Override
	public Viaggio addViaggio(Viaggio v) {
			return viaggioRepo.save(v);
	}

	@Override
	public Viaggio updateViaggio(Viaggio v) {
		
		return viaggioRepo.save(v);
	}

	@Override
	public void deleteViaggio(Viaggio v) {
		viaggioRepo.delete(v);
	}

}
