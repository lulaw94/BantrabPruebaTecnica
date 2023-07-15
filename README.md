# BantrabPruebaTecnica
Creación API REST
Se crearon los siguientes Endpoints:
Endpoints Cliente
Endpoints Productos
Endpoints Ordenes
Endpoints Detalles

Para poder probar el consumo en POSTMAN es necesario crear la base de dato Mysql libreria con nombre dbstock con las siguientes archivos:
order, customers, details. Se adjunto los querys para la creacion de estos respectivamente:

CREATE TABLE `dbstock`.`order` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `customerID` INT NULL,
  `status` VARCHAR(1) NULL);

  CREATE TABLE `dbstock`.`customers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fullname` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `pass` VARCHAR(45) NULL,
   `status` VARCHAR(45) NULL);

  CREATE TABLE `dbstock`.`details` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `productId` INT NULL,
   `quantity` INT NULL,
  `price` DECIMAL(2) NULL);
