package com.software.app.models;

import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
	@Getter @Setter @Column(name = "id")
    private Integer id;

    @Getter @Setter @Column(name = "nombreUsuario")
    private String nombreUsuario;
    
    @Getter @Setter @Column(name = "correo")
    private String correo;

    @Getter @Setter @Column(name = "password")
    private String password;

    @Getter @Setter @Column(name = "sesion_activa")
    private String sesion_activa;

    @Getter @Setter @Column(name = "estado")
    private String estado;

    @Getter @Setter @Column(name = "persona_id")
    private Integer persona_id;
    
    public Usuario() {}
    
    public Usuario(String nombreUsuario, String correo, String password, 
    		String sesion_activa, String estado, Integer persona_id) {
    	this.nombreUsuario = nombreUsuario;
    	this.correo = correo;
    	this.password = password;
    	this.sesion_activa = sesion_activa;
    	this.estado = estado;
    	this.persona_id = persona_id;
    }
}
