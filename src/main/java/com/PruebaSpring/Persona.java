package com.PruebaSpring;

import org.springframework.stereotype.Repository;


public interface Persona {
	public String getDatos(PersonaImpl per);
	
	public String modificar(PersonaImpl per, String nuevoNombre);
	 
}
