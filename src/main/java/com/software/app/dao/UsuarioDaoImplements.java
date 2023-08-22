package com.software.app.dao;

import com.software.app.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class UsuarioDaoImplements implements UsuarioDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public String agregarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario obtenerUsuario(Integer id_usuario) {
		Usuario usuario = entityManager.find(Usuario.class, id_usuario);
		return usuario;
	}

	@Override
	public String actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
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