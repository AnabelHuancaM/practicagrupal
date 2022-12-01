package com.certus.spring.models;

import java.util.List;

public class Response<T> {
	private boolean estado;
	private String mensaje;
	private List<T> data;
	
	public boolean getEstado1() {
		return estado;
	}
	public void setEstado1(boolean estado1) {
		this.estado = estado1;
	}
	public String getMensaje1() {
		return mensaje;
	}
	public void setMensaje1(String mensaje1) {
		this.mensaje = mensaje1;
	}
	public List<T> getData1() {
		return data;
	}
	public void setData1(List<T> data1) {
		this.data = data1;
	}
	
}
