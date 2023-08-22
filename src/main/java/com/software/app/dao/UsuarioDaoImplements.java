package com.software.app.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.software.app.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
@Transactional
public class UsuarioDaoImplements implements UsuarioDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public String agregarUsuario(Usuario usuario) {
		entityManager.merge(usuario);
		return "Usuario registrado correctamente";
	}

	@Override
	public Usuario obtenerUsuario(Integer id_usuario) {
		return entityManager.find(Usuario.class, id_usuario);
	}

	@Override
	public String actualizarUsuario(Usuario usuario) {
		return null;
	}

	@Override
	public String eliminarUsuario(Integer id_usuario) {
		Usuario usuario = entityManager.find(Usuario.class, id_usuario);
		if (usuario == null)
			return "Usuario no encontrado";
		entityManager.remove(usuario);
		return "Usuario eliminado correctamente";
	}
    
}