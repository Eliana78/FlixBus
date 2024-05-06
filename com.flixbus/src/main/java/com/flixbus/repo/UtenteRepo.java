package com.flixbus.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.flixbus.entities.Utente;

public interface UtenteRepo extends JpaRepository<Utente,Integer> {

	Utente findByEmail(String email);

}
