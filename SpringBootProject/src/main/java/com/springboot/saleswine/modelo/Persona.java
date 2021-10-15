package com.springboot.saleswine.modelo;

import javax.persistence.*;

public class Persona {
	
	@Id
	@SequenceGenerator(name = "seqPER", sequenceName = "INCPERSONA", allocationSize = 1)
	private int codPer;
	
	private String nombre;
	
	private String apellido;
	
	private String user;
	
	private String password;
	
	private String celular;
	
	private String dni;
	
	private String estado;
	
	private String mail;
	
	private String direc;
	
	private String rol;
	
	private String codUbi;
}