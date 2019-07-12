package com.PruebaSpring;

public interface Servicio {
	public String traerDatos(PersonaImpl per);
	
	public String traerModificado(PersonaImpl per, String nuevoNombre);
}
