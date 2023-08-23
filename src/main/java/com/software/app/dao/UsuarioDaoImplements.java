package com.software.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.software.app.models.Persona;
import com.software.app.models.Usuario;
import com.software.app.utils.ValidacionDeUsuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class UsuarioDaoImplements implements UsuarioDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public String agregarUsuario(String nombre_usuario, String password, String nombres, 
			String apellidos, String identificacion, String fechaNacimiento) {
		
		String valDeUsuario = ValidacionDeUsuario.validarNombreUsuario(nombre_usuario);
		
		if (valDeUsuario == "Correcto") {
			String valDePassword = ValidacionDeUsuario.validarPassword(password);
			
			if (valDePassword == "Correcto") {
				String valDeIdentificacion = ValidacionDeUsuario.validarIdentificacion(identificacion);
				
				if (valDeIdentificacion == "Correcto") {
					Persona persona = new Persona(nombres, apellidos, identificacion, fechaNacimiento);
					//entityManager.persist(persona);
					
					String correo = ValidacionDeUsuario.generarCorreo(nombres, apellidos, '0');
					String query = "select c from usuarios c where c.correo like :email";
					System.out.println(query);
					List<Usuario> usuarios = entityManager.createQuery(query).setParameter("email", "%"+correo+"%").getResultList();
					
					if (usuarios.isEmpty())
						correo = correo + "@mail.com";
					else
						correo = correo + usuarios.size() + "@mail.com";
					
					//Usuario usuario = new Usuario(nombre_usuario, correo, password, '1', "Habilitado", persona.getId());
					//entityManager.persist(usuario);
					
					return "Usuario registrado correctamente: " + correo;
				}
				return valDeIdentificacion;
			}
			return valDePassword;
		}
		return valDeUsuario;
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