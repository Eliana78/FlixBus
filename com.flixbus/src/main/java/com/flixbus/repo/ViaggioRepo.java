package com.flixbus.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flixbus.entities.Viaggio;

@Repository
public interface ViaggioRepo extends JpaRepository<Viaggio, Integer> {

	
	@Query(value =  "select * from viaggio order by price limit 10", nativeQuery = true)
	List<Viaggio> getFirstTenViaggi();
//	
	
}
