package com.latam.JPAcrud.servicio;

import com.latam.JPAcrud.modelo.Usuario;

public interface SecurityService {
	public boolean isLoggedIn();
	public void setUsuarioConectado(Usuario usuario);
	public Usuario getUsuarioConectado();
}
