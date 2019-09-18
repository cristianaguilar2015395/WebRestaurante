-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema dbrestaurante
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dbrestaurante
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbrestaurante` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `dbrestaurante` ;

-- -----------------------------------------------------
-- Table `dbrestaurante`.`arearestaurante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbrestaurante`.`arearestaurante` (
  `idarea` INT(11) NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idarea`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbrestaurante`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbrestaurante`.`clientes` (
  `idcliente` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(100) NOT NULL,
  `nit` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbrestaurante`.`cocineros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbrestaurante`.`cocineros` (
  `idcocinero` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcocinero`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbrestaurante`.`meseros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbrestaurante`.`meseros` (
  `idmesero` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idmesero`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbrestaurante`.`mesas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbrestaurante`.`mesas` (
  `idmesa` INT(11) NOT NULL AUTO_INCREMENT,
  `numeroPersonas` INT(10) NOT NULL,
  `idarea` INT(11) NOT NULL,
  PRIMARY KEY (`idmesa`),
  INDEX `idArea` (`idarea` ASC) VISIBLE,
  CONSTRAINT `mesas_ibfk_1`
    FOREIGN KEY (`idarea`)
    REFERENCES `dbrestaurante`.`arearestaurante` (`idarea`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbrestaurante`.`notaorden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbrestaurante`.`notaorden` (
  `idorden` INT(11) NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idorden`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbrestaurante`.`facturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbrestaurante`.`facturas` (
  `idfactura` INT(11) NOT NULL AUTO_INCREMENT,
  `fechaFactura` VARCHAR(100) NOT NULL,
  `idcliente` INT(11) NOT NULL,
  `idmesero` INT(11) NOT NULL,
  `idmesa` INT(11) NOT NULL,
  `idorden` INT(11) NOT NULL,
  PRIMARY KEY (`idfactura`),
  INDEX `idMesero` (`idmesero` ASC) VISIBLE,
  INDEX `idMesa` (`idmesa` ASC) VISIBLE,
  INDEX `idCliente` (`idcliente` ASC) VISIBLE,
  INDEX `idOrden` (`idorden` ASC) VISIBLE,
  CONSTRAINT `facturas_ibfk_1`
    FOREIGN KEY (`idmesero`)
    REFERENCES `dbrestaurante`.`meseros` (`idmesero`),
  CONSTRAINT `facturas_ibfk_2`
    FOREIGN KEY (`idmesa`)
    REFERENCES `dbrestaurante`.`mesas` (`idmesa`),
  CONSTRAINT `facturas_ibfk_3`
    FOREIGN KEY (`idcliente`)
    REFERENCES `dbrestaurante`.`clientes` (`idcliente`),
  CONSTRAINT `facturas_ibfk_4`
    FOREIGN KEY (`idorden`)
    REFERENCES `dbrestaurante`.`notaorden` (`idorden`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbrestaurante`.`plato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbrestaurante`.`plato` (
  `idplato` INT(11) NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idplato`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `dbrestaurante`.`detallefacturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbrestaurante`.`detallefacturas` (
  `iddetalleFactura` INT(11) NOT NULL AUTO_INCREMENT,
  `idfactura` INT(11) NOT NULL,
  `idcocinero` INT(11) NOT NULL,
  `idplato` INT(11) NOT NULL,
  `precio` DOUBLE NOT NULL,
  `cantidad` INT(10) NOT NULL,
  `totalVenta` DOUBLE NOT NULL DEFAULT ('cantidad' * 'precio'),
  PRIMARY KEY (`iddetalleFactura`),
  INDEX `idFactura` (`idfactura` ASC) VISIBLE,
  INDEX `idCocinero` (`idcocinero` ASC) VISIBLE,
  INDEX `idPlato` (`idplato` ASC) VISIBLE,
  CONSTRAINT `detallefacturas_ibfk_1`
    FOREIGN KEY (`idfactura`)
    REFERENCES `dbrestaurante`.`facturas` (`idfactura`),
  CONSTRAINT `detallefacturas_ibfk_2`
    FOREIGN KEY (`idcocinero`)
    REFERENCES `dbrestaurante`.`cocineros` (`idcocinero`),
  CONSTRAINT `detallefacturas_ibfk_3`
    FOREIGN KEY (`idplato`)
    REFERENCES `dbrestaurante`.`plato` (`idplato`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
