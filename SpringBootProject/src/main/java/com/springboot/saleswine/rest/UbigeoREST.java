package com.springboot.saleswine.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.saleswine.modelo.Ubigeo;
import com.springboot.saleswine.service.UbigeoService;

@RestController
@RequestMapping("/ubigeo/")
public class UbigeoREST {
	
	@Autowired
	private UbigeoService ubiServ;
	
	@GetMapping
	private ResponseEntity<List<Ubigeo>> getAllUbi(){
		return ResponseEntity.ok(ubiServ.findAll());
	}
}