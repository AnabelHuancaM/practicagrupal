package com.certus.spring.models;

import java.util.List;

public class Response<T> {
	private boolean estado;
	private String mensaje;
	private List<T> data;
	
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado1) {
		this.estado = estado1;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje1) {
		this.mensaje = mensaje1;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data1) {
		this.data = data1;
	}
	
}
