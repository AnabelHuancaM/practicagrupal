package com.certus.spring.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.certus.spring.models.Response;
import com.certus.spring.models.Usuario;
import com.certus.spring.service.IUsuarioService;

import jakarta.validation.Valid;










@Controller
@RequestMapping("/app")
public class HomeController {


	 @Value("${title.generic}")
	 private String titlePage;
	 
	 @Autowired
		private IUsuarioService InterfaceUsuario;
		

	
   @GetMapping({ "/home", "/inicio", "/", "/Home", "/Inicio" })
	public String Home(Model model) {
	   model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("titulo", "Home principal");
		
		


		return "Home";

	}
   
  
   @GetMapping("/listar")
	public String ListarPersonajes(Model model) {
	   
	   model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("titulo", "Esta es la lista de usuarios");
	   return "Lista";
		}
   
   
   
   
   
   
   
   @GetMapping("/crear")
	public String Formulario(Model model) {
		model.addAttribute("tituloPagina", titlePage);
		model.addAttribute("tituloFormulario", "Formulario usuario");

		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		
		
		return "Formulario";
	}
   
   
   
   
   
   
	@GetMapping("/Editar/{idPersonaje}")
	public String EditarPersonaje(@PathVariable int idPersonaje, Model model) {



		return "Formulario";
	}
	@GetMapping("/Elimnar/{idPersonaje}")
	public String ElimnarPersonaje(@PathVariable int idPersonaje, Model model) {

			return "errores";
		}
	

	@PostMapping("/form")
	public String crearUsuario(@Valid Usuario random, BindingResult result ,Model model) {
			
		if (result.hasErrors()) {
			return "Formulario1";
		}
		
		Response<Usuario> rspta = InterfaceUsuario.crearUsuario(random);
		
		    model.addAttribute("listita1",rspta.getData());
			model.addAttribute("tituloPagina", titlePage);
			model.addAttribute("titulo", "Formulario Usuario");			
			
			
			
			return "Lista";
		

	}
}
