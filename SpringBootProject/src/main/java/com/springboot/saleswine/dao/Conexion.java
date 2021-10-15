package com.springboot.saleswine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static Connection cnx = null;
	public static Connection conectar() throws Exception {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cnx = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "USDEV", "root");
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Error en la conexión de la base de datos en: " + ex.getMessage());
		}
		return cnx;
	}

	public static void cerrarCnx() throws Exception {
		if (Conexion.cnx != null) {
			cnx.close();
		}
	}
	
	public static void main(String[] args) throws Exception {
		conectar();
		
		if(cnx != null) {
			System.out.println("Conectado");
		} else {
			System.out.println("Sin conectar");
		}
	}
}