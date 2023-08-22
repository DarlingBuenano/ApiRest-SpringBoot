package com.software.app.models;

import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "personas")
public class Persona {

    @Id
	@Getter @Setter @Column(name = "id")
    private Integer id;

    @Getter @Setter @Column(name = "nombres")
    private String nombres;

    @Getter @Setter @Column(name = "apellidos")
    private String apellidos;

    @Getter @Setter @Column(name = "identificacion")
    private String identificacion;

    @Getter @Setter @Column(name = "fechaNacimiento")
    private String fechaNacimiento;
}