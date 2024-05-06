package com.flixbus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flixbus.entities.Prenotazione;

public interface PrenotazioneRepo extends JpaRepository<Prenotazione, Integer> {

}
