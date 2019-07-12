package com.PruebaSpring;

import org.springframework.stereotype.Repository;

@Repository
public class PersonaImpl implements Persona{
	private String nombre;
	private String apellido;
	private long dni;
	private String direccion;
	
	//---------------------------------------------------------------------------------------------------------------
	//GET Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//---------------------------------------------------------------------------------------------------------------
	@Override
	public String getDatos(PersonaImpl per) {
		return "nombre: "+per.getNombre()+", apellido: "+per.getApellido()+", direc: "+per.getDireccion();
	}
	
	@Override
	public String modificar(PersonaImpl per, String nuevoNombre) {
		per.setNombre(nuevoNombre);
		return "nombre: "+per.getNombre()+", apellido: "+per.getApellido()+", direc: "+per.getDireccion();
	}
	
	
}
