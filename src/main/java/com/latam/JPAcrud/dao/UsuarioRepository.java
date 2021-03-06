package com.latam.JPAcrud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import com.latam.JPAcrud.modelo.Usuario;

public interface UsuarioRepository extends  Repository<Usuario, Integer>, PagingAndSortingRepository<Usuario, Integer> {
	// Extendí el repositorio con PagingAndSortingRepository para paginación.
	
	@Query("FROM Usuario WHERE nombre = ?1 and clave = ?2")
	public List<Usuario> findByNombreAndClave(String nombre, String clave);

}
