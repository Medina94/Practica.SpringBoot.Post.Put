package com.PruebaSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class Controlador {
	@Autowired
	private Servicio servicio;
	@Autowired
	private ServicioUsuario userService;
	
	//---------------------------------------------------------------------------------------------------------------
	//SERVICIOS PERSONA
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public String traerServicio(@RequestBody PersonaImpl per) {
		return servicio.traerDatos(per);
	} 
	
	@RequestMapping("/update")
	@PutMapping(consumes = {MediaType.APPLICATION_PROBLEM_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public String modificarUsuario(@RequestBody PersonaImpl per, @RequestParam String nuevoNombre) {
		return servicio.traerModificado(per, nuevoNombre);
	}
	
	/*@RequestMapping("/delete")
	@DeleteMapping(consumes = {MediaType.APPLICATION_PROBLEM_JSON_VALUE})
	public String eliminarDato(@RequestBody PersonaImpl per) {
		return null;
	}*/	
	
	//--------------------------------------------------------------------------------------------------------------
	//SERVICIOS USUARIO
	@RequestMapping("/user")
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public UsuarioImpl CreateUser(@RequestBody PersonaImpl per) {
		return userService.traerUsuario(per);
	}
}
