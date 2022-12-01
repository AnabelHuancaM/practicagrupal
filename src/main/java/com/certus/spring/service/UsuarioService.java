package com.certus.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.certus.spring.models.Usuario;
import com.certus.spring.models.Response;

@Service
public class UsuarioService implements IUsuarioService {

	public Response<Usuario> crearUsuario(Usuario UsuarioRecibo) {

		
		
		Response<Usuario> response = new Response<>();
		boolean estadoCreacion = false;
		
		List<Usuario> listita1 = new ArrayList<>();

		//creando segunda mascota
		
		Usuario usuario1 = new Usuario();

		usuario1.setNombre("aaaaaaaa");
		usuario1.setUser("222222");
		usuario1.setPassword("aaaaa");
		usuario1.setCod_Sucursal("222222");

		
		//Creando segunda mascota
		
		Usuario usuario2 = new Usuario();

		usuario2.setNombre("eeeeeee");
		usuario2.setUser("33333");
		usuario2.setPassword("eeeee");
		usuario2.setCod_Sucursal("33333");
 
		
		//agregando la mascota a la lista
				
		listita1.add(usuario1);
		listita1.add(usuario2);

        //validacion 
		if(UsuarioRecibo.getNombre() != null &&
				UsuarioRecibo.getUser() != null	&&
						UsuarioRecibo.getPassword() != null &&
								UsuarioRecibo.getCod_Sucursal() != null 
				) {
			listita1.add(UsuarioRecibo);
		}
	
		
		//Validacion de lista de personajes
		if(listita1.size() > 0) {
			estadoCreacion = true;
			response.setEstado(estadoCreacion);
			response.setMensaje("Creado correctamente");
			response.setData(listita1);
		}else {
			response.setEstado(estadoCreacion);
			response.setMensaje("Se produjo un error al crear la mascota");
		}
		
		
		
		
		
		

		return response;
	}

	
	
	
	public String EditarUsuario() {

		return "Usuario editada";
	}

	public String EliminarUsuario() {

		return "Usuario  eliminada";
	}





	
}
