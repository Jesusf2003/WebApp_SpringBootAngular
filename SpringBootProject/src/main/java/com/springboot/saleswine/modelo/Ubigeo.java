package com.springboot.saleswine.modelo;

import javax.persistence.*;

@Entity
@Table(name = "UBIGEO")
public class Ubigeo {
	
	@Id
	@Column(name = "CODUBI")
	private String codUbi;
	
	@Column(name = "DEPUBI")
	private String dep;
	
	@Column(name = "PROUBI")
	private String pro;
	
	@Column(name = "DISUBI")
	private String dis;
}