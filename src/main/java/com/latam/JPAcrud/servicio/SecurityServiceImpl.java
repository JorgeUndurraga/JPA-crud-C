package com.latam.JPAcrud.servicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.latam.JPAcrud.JpaCrudCApplication;
import com.latam.JPAcrud.modelo.Usuario;

@SessionScope /* indica que se creará una instancia del bean por cada cliente que se conecte
a la aplicación, lo que permitirá tener usuarios conectados (sesiones) de forma paralela con su
usuario almacenado dentro de Usuario usuarioConectado = null; . Esta variable contendrá la
información el usuario conectado y la dejaremos nula si el usuario se desconecta manualmente.*/
@Service
public class SecurityServiceImpl implements SecurityService {
	
	private static final Logger log = LoggerFactory.getLogger(JpaCrudCApplication.class);
	Usuario usuarioConectado = null;

/*	 Dos métodos permitirán establecer al usuario conectado y obtenerlo en cualquier
	 momento desde otro punto de la aplicación.
*/

	@Override
	public boolean isLoggedIn() {
		log.info("Consultando por usuario autenticado");
		return null != this.usuarioConectado;
	}

	@Override
	public void setUsuarioConectado(Usuario usuario) {
		log.info("Estableciendo usuario conecado");
		this.usuarioConectado = usuario;
	}

	@Override
	public Usuario getUsuarioConectado() {
		log.info("Devolviendo al usuario conectado");
		return usuarioConectado;
	}

}
