CREATE DATABASE db_usuarios DEFAULT CHARACTER SET utf8  DEFAULT COLLATE utf8_bin;
USE db_usuarios;

CREATE TABLE personas
(
    id INT NOT NULL AUTO_INCREMENT,
    nombres VARCHAR(60),
    apellidos VARCHAR(60),
    identificacion VARCHAR(10),
    fecha_nacimiento DATE,
    PRIMARY KEY(id)
);

CREATE TABLE usuarios
(
    id INT NOT NULL AUTO_INCREMENT,
    nombre_usuario VARCHAR(50),
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
    fecha_ingreso DATE,
    fecha_cierre DATE,
    usuario_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(usuario_id)  REFERENCES usuarios(id)
);

CREATE TABLE roles
(
    id INT NOT NULL AUTO_INCREMENT,
    nombre_rol VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE rol_usuarios
(
    id INT NOT NULL AUTO_INCREMENT,
    rol_id INT NOT NULL,
    usuario_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(rol_id) REFERENCES roles(id),
    FOREIGN KEY(usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE rol_opciones
(
    id INT NOT NULL AUTO_INCREMENT,
    nombre_opcion VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE rol_rolOpciones
(
    id INT NOT NULL AUTO_INCREMENT,
    rol_id INT NOT NULL,
    rol_opcion_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (rol_id) REFERENCES roles(id),
    FOREIGN KEY (rol_opcion_id) REFERENCES rol_opciones(id)
);


insert into personas (nombres, apellidos, identificacion, fecha_nacimiento) values ("Darlyn Omar", "Buenaño Vera", "1112223334", "1999-02-05");
insert into usuarios (nombre_usuario, password, correo, sesion_activa, estado, persona_id) values("Darlyn05", "D123456$", "dbuenanov@mail.com", "1", "Disponible", 1);

insert into personas (nombres, apellidos, identificacion, fecha_nacimiento) values ("Cristian Jackson", "Buenaño Vera", "1112223334", "2000-06-10");
insert into usuarios (nombre_usuario, password, correo, sesion_activa, estado, persona_id) values("Cristian06", "C123456$", "cbuenanov@mail.com", "1", "Disponible", 2);
select * from personas;