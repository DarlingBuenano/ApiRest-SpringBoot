package com.software.app.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.software.app.models.Usuario;
import com.software.app.dao.UsuarioDao;

@RestController
@RequestMapping(path = "/api")
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;

    //Create
    @PostMapping(path = "/agregar-usuario")
    public String agregarUsuario() {
        Usuario usuario = new Usuario();
        return usuarioDao.agregarUsuario(usuario);
    }

    //Read
    @GetMapping(path = "/obtener-usuario/{id}")
    public Usuario obtenerUsuario(@PathVariable Integer id) {
    	return usuarioDao.obtenerUsuario(id);
    }
    
    //Update
    @PutMapping(path = "/actualizar-usuario/{id}")
    public String actualizarUsuario(@PathVariable Integer id) {
        Usuario usuario = new Usuario();
        return usuarioDao.agregarUsuario(usuario);
    }

    //Delete
    @DeleteMapping(path = "/eliminar-usuario/{id}")
    public String eliminarUsuario(@PathVariable Integer id) {
        return usuarioDao.eliminarUsuario(id);
    }
}