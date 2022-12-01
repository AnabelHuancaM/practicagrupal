package com.certus.spring.controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;








@Controller
@RequestMapping("/app")
public class HomeController {


	 @Value("${title.generic}")
	 private String titlePage;
	
   @GetMapping({ "/home", "/inicio", "/", "/Home", "/Inicio" })
	public String Home(Model model) {


		return "Home";

	}
   
  
   @GetMapping("/listar")
	public String ListarPersonajes(Model model) {
	   return "Lista";
		}
   
   
   
   @GetMapping("/crear")
	public String Formulario(Model model) {


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
	public String creaPersonaje() {
			
			return "errores";
		

	}
}
