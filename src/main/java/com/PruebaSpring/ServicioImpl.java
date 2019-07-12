package com.PruebaSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicioImpl implements Servicio{
	@Autowired
	private Persona persona;
	
	
	public String traerDatos(PersonaImpl per) {
		return persona.getDatos(per);
	}


	@Override
	public String traerModificado(PersonaImpl per, String nuevoNombre) {
		return persona.modificar(per, nuevoNombre);
	}
}
