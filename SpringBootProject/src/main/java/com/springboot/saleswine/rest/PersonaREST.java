package com.springboot.saleswine.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.saleswine.modelo.Persona;
import com.springboot.saleswine.service.PersonaService;

@RestController
@RequestMapping("/persona/")
public class PersonaREST {
	
	@Autowired
	private PersonaService perServ;
	
	@GetMapping
	private ResponseEntity<List<Persona>> getAllPer(){
		return ResponseEntity.ok(perServ.findAll());
	}
}