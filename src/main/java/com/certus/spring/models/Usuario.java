package com.certus.spring.models;

public class Usuario {
	private String Nombre;
	private String User;
	private String Password;
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
