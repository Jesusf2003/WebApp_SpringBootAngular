package com.springboot.saleswine.modelo;

import javax.persistence.*;

@Entity
@Table(name = "PERSONA")
public class Persona {
	
	@Id
	@SequenceGenerator(name = "seqPER", sequenceName = "INCPERSONA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPER")
	@Column(name = "CODPER")
	private int codPer;
	
	@Column(name = "NOMPER")
	private String nombre;
	
	@Column(name = "APEPER")
	private String apellido;
	
	@Column(name = "USERPER")
	private String user;
	
	@Column(name = "PSWPER")
	private String password;
	
	@Column(name = "CELPER")
	private String celular;
	
	@Column(name = "DNIPER")
	private String dni;
	
	@Column(name = "ESTPER")
	private String estado;
	
	@Column(name = "MAILPER")
	private String mail;
	
	@Column(name = "DIRPER")
	private String direc;
	
	@Column(name = "ROLPER")
	private String rol;
	
	@ManyToOne
	@JoinColumn(name = "CODUBI")
	private Ubigeo codUbi;

	public int getCodPer() {
		return codPer;
	}

	public void setCodPer(int codPer) {
		this.codPer = codPer;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDirec() {
		return direc;
	}

	public void setDirec(String direc) {
		this.direc = direc;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Ubigeo getCodUbi() {
		return codUbi;
	}

	public void setCodUbi(Ubigeo codUbi) {
		this.codUbi = codUbi;
	}
}