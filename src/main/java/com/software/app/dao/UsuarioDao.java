package com.software.app.dao;

import com.software.app.models.Usuario;

public interface UsuarioDao {
    public String agregarUsuario(String nombre_usuario, 
			String password, String nombres, String apellidos, 
			String identificacion, String fechaNacimiento);
    public Usuario obtenerUsuario(Integer id_usuario);
    public String actualizarUsuario(Usuario usuario);
    public String eliminarUsuario(Integer id_usuario);
}