package com.software.app.dao;

import com.software.app.models.Usuario;

public interface UsuarioDao {
    public String agregarUsuario(Usuario usuario);
    public Usuario obtenerUsuario(Integer id_usuario);
    public String actualizarUsuario(Usuario usuario);
    public String eliminarUsuario(Integer id_usuario);
}