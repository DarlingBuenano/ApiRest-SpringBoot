CREATE DATABASE db_usuarios;
USE db_usuarios;

CREATE TABLE personas
(
    id INT NOT NULL AUTO_INCREMENT,
    nombres VARCHAR(60),
    apellidos VARCHAR(60),
    identificacion VARCHAR(10),
    fechaNacimiento DATE,
    PRIMARY KEY(id)
);

CREATE TABLE usuarios
(
    id INT NOT NULL AUTO_INCREMENT,
    nombreUsuario VARCHAR(50),
    password VARCHAR(50),
    correo VARCHAR(120),
    sesion_activa CHAR(1),
    estado VARCHAR(20),
    persona_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (persona_id) REFERENCES personas(id)
);

CREATE TABLE sesiones
(
    id INT NOT NULL AUTO_INCREMENT,
    fechaIngreso DATE,
    fechaCierre DATE,
    usuario_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(usuario_id)  REFERENCES usuarios(id)
);

CREATE TABLE roles
(
    id INT NOT NULL AUTO_INCREMENT,
    nombreRol VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE rol_usuarios
(
    rol_id INT NOT NULL,
    usuario_id INT NOT NULL,
    FOREIGN KEY(rol_id) REFERENCES roles(id),
    FOREIGN KEY(usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE rol_opciones
(
    id INT NOT NULL AUTO_INCREMENT,
    nombreOpcion VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE rol_rolOpciones
(
    rol_id INT NOT NULL,
    rolOpcion_id INT NOT NULL,
    FOREIGN KEY (rol_id) REFERENCES roles(id),
    FOREIGN KEY (rolOpcion_id) REFERENCES rol_opciones(id)
);


insert into personas (nombres, apellidos, identificacion, fechaNacimiento) values ("Darlyn Omar", "Buenaño Vera", "1112223334", "1999-02-05");
insert into personas (nombres, apellidos, identificacion, fechaNacimiento) values ("Cristian Jackson", "Buenaño Vera", "1112223334", "2000-06-10");
select * from personas;