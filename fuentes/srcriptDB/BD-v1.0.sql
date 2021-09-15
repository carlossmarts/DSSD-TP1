-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

/*
-- -----------------------------------------------------
-- Schema Sist. Distribuidos-TP01
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Sist. Distribuidos-TP01` ;

-- -----------------------------------------------------
-- Schema Sist. Distribuidos-TP01
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Sist. Distribuidos-TP01` DEFAULT CHARACTER SET utf8 ;


*/

USE `bclnro5zyhtbtwvryre1` ;

-- -----------------------------------------------------
-- Table `Sist. Distribuidos-TP01`.`tipo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tipo` (
  `nombre_tipo` VARCHAR(45) NOT NULL,
  `activo` TINYINT NULL DEFAULT 1,
  PRIMARY KEY (`nombre_tipo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Sist. Distribuidos-TP01`.`medicamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `medicamento` (
  `id` INT NOT NULL,
  `cod_medicamento` VARCHAR(11) NOT NULL,
  `nombre` VARCHAR(100) NOT NULL,
  `droga` VARCHAR(100),
  `tipo_nombre_tipo` VARCHAR(45) NOT NULL,
  `activo` TINYINT NULL DEFAULT 1,
  PRIMARY KEY (`cod_medicamento`),
  CONSTRAINT `fk_medicamento_tipo`
    FOREIGN KEY (`tipo_nombre_tipo`)
    REFERENCES `tipo` (`nombre_tipo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_medicamento_tipo_idx` ON `medicamento` (`tipo_nombre_tipo` ASC) VISIBLE;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
