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

	public String getCodUbi() {
		return codUbi;
	}

	public void setCodUbi(String codUbi) {
		this.codUbi = codUbi;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public String getDis() {
		return dis;
	}

	public void setDis(String dis) {
		this.dis = dis;
	}
}