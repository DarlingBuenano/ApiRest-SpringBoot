package com.software.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id @Column(name = "id")
    private Integer id;

    @Column(name = "nombre_usuario")
    private String nombre_usuario;

	@Column(name = "correo")
    private String correo;

    @Column(name = "password")
    private String password;

    @Column(name = "sesion_activa")
    private char sesion_activa;

    @Column(name = "estado")
    private String estado;
    
    @Column(name = "persona_id")
    private Integer persona_id;
    
    public Usuario() {}
    
    public Usuario(String nombre_usuario, String correo, String password, 
    		char sesion_activa, String estado, Integer persona_id) {
    	this.nombre_usuario = nombre_usuario;
    	this.correo = correo;
    	this.password = password;
    	this.sesion_activa = sesion_activa;
    	this.estado = estado;
    	this.persona_id = persona_id;
    }
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getSesion_activa() {
		return sesion_activa;
	}

	public void setSesion_activa(char sesion_activa) {
		this.sesion_activa = sesion_activa;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getPersona_id() {
		return persona_id;
	}

	public void setPersona_id(Integer persona_id) {
		this.persona_id = persona_id;
	}
}
