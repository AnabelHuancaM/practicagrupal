package com.certus.spring.service;

import com.certus.spring.models.Usuario;
import com.certus.spring.models.Response;

public interface IUsuarioService {
	public Response<Usuario> crearUsuario(Usuario m);
	public String EditarUsuario();
	public String EliminarUsuario();
}
