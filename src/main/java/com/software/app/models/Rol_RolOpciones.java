package com.software.app.models;

import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol_rolopciones")
public class Rol_RolOpciones {
	
	@Id
	@Getter @Setter @Column(name = "id")
    private Integer id;

    @Getter @Setter @Column(name = "rol_id")
    private Integer rol_id;

    @Getter @Setter @Column(name = "rolOpcion_id")
    private Integer rolOpcion_id;
}