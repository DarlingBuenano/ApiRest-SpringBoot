package com.software.app.models;

import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sesiones")
public class Sesion {

    @Id
	@Getter @Setter @Column(name = "id")
    private Integer id;

    @Getter @Setter @Column(name = "fechaIngreso")
    private String fechaIngreso;

    @Getter @Setter @Column(name = "fechaCierre")
    private String fechaCierre;

    @Getter @Setter @Column(name = "usuario_id")
    private String usuario_id;
}