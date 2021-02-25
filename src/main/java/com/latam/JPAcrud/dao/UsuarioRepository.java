package com.latam.JPAcrud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.latam.JPAcrud.modelo.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	@Query("FROM Usuario WHERE nombre = ?1 and clave = ?2")
	public List<Usuario> findByNombreAndClave(String nombre, String clave);

}
