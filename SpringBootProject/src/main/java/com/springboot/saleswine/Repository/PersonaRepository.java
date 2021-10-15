package com.springboot.saleswine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.saleswine.modelo.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
	
}