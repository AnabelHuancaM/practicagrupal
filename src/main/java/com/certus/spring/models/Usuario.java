package com.certus.spring.models;

import jakarta.validation.constraints.NotEmpty;

public class Usuario {
	
	@NotEmpty(message = "Completar el nombre")
	private String Nombre;
	
	@NotEmpty(message = "Completar user")
	private String User;
	
	@NotEmpty(message = "Completar el password")
	private String Password;
	
	@NotEmpty(message = "Completar el cod_sucursal")
	private String Cod_Sucursal;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getCod_Sucursal() {
		return Cod_Sucursal;
	}
	public void setCod_Sucursal(String cod_Sucursal) {
		Cod_Sucursal = cod_Sucursal;
	}

}
