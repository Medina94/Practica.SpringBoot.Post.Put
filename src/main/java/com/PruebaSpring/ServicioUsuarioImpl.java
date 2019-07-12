package com.PruebaSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuarioImpl implements ServicioUsuario{
	@Autowired
	private Usuario user;
	
	@Override
	public UsuarioImpl traerUsuario(PersonaImpl per) {
		
		return user.getDatosUsuario(per);
	}
	
}
