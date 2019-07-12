package com.PruebaSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioImpl implements Usuario{
	@Autowired
	private Persona persona;
	//private String id;
	//-------------------------------------------------------------------------------------------------------
	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}

/*
	public String getId() {
		return id;
	}*/


	/*public void setId(String id) {
		this.id = id;
	}*/
	//-------------------------------------------------------------------------------------------------------
	@Override
	public UsuarioImpl getDatosUsuario(PersonaImpl per) {
		UsuarioImpl user=new UsuarioImpl();
		user.setPersona(per.getPersona(per));
		
		return user;
	}


}
