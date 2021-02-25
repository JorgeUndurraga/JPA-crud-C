package com.latam.JPAcrud.servicio;

import com.latam.JPAcrud.modelo.Usuario;
import com.latam.JPAcrud.vo.UsuarioVO;

public interface UsuarioService {
	
	public UsuarioVO getAllUsuarios();
	public UsuarioVO findByNombreAndClave(String nombre, String clave);
	public UsuarioVO login(String nombre, String clave);
	public UsuarioVO add(Usuario usuario);
	public UsuarioVO update(Usuario usuario);
	public UsuarioVO delete(Usuario usuario);
	public UsuarioVO findById(Integer id);


}
