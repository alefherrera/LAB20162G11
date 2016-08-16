CREATE DATABASE `agenda`;
USE agenda;
CREATE TABLE `personas`
(
  `idPersona` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `email` varchar(40) NOT NULL,
  `fechaNac` datetime NOT NULL,
  `tipoContacto` int NOT NULL,
  `domicilio` int NOT NULL,
  `calle` varchar(100) NOT NULL,
  `altura` int NOT NULL,
  `piso` int,
  `depto` int,
  `localidad` int,
  PRIMARY KEY (`idPersona`)
);
CREATE TABLE `localidades`
(
  `id` int AUTO_INCREMENT,
  `descripcion` varchar(40) NOT NULL
);
CREATE TABLE `tiposContacto`
(
  `id` int AUTO_INCREMENT,
  `descripcion` varchar(40) NOT NULL
);
