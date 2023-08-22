package com.software.app.models;

import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
	@Getter @Setter @Column(name = "id")
    private Integer id;

    @Getter @Setter @Column(name = "nombreRol")
    private String nombreRol;
}