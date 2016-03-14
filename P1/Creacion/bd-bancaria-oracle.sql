--ALTER SESSION SET CURRENT_SCHEMA = bd2;

DROP TABLE Pertenece_p1;
DROP TABLE Oficina_p1;
DROP TABLE CAhorro_p1;
DROP TABLE Operacion_p1;
DROP TABLE Tiene_p1;
DROP TABLE Cuenta_p1;
DROP TABLE Usuario_p1;

CREATE TABLE Usuario_p1 (
  dni VARCHAR(10) PRIMARY KEY,
  nombre VARCHAR(30) NOT NULL,
  apellidos VARCHAR(80) NOT NULL,
  edad NUMBER (3) NOT NULL,
  direccion VARCHAR(80) NOT NULL,
  email VARCHAR(80),
  telefono NUMBER(15)
);

CREATE TABLE Cuenta_p1 (
  iban VARCHAR(34) PRIMARY KEY,
  numero VARCHAR(34) NOT NULL,
  creacion DATE NOT NULL,
  saldo FLOAT DEFAULT 0
);

CREATE TABLE Tiene_p1 (
  dni VARCHAR(10),
  iban VARCHAR(34),
  FOREIGN KEY (dni) REFERENCES Usuario_p1(dni),
  FOREIGN KEY (iban) REFERENCES Cuenta_p1(iban),
  PRIMARY KEY (dni,iban)
);

CREATE TABLE Operacion_p1 (
  contador INT NOT NULL ,
  tipo CHAR NOT NULL,
  fechahora TIMESTAMP NOT NULL,
  corigen VARCHAR(34),
  cdestino VARCHAR(34),
  sucursal VARCHAR(80),
  concepto VARCHAR(200),
  cantidad NUMBER,
  FOREIGN KEY (corigen) REFERENCES Cuenta_p1(iban),
  FOREIGN KEY (cdestino) REFERENCES Cuenta_p1(iban),
  PRIMARY KEY (contador)
);

CREATE TABLE CAhorro_p1 (
  iban VARCHAR(34) PRIMARY KEY,
  interes FLOAT NOT NULL,
  dia NUMBER(2),
  FOREIGN KEY (iban) REFERENCES Cuenta_p1(iban)
);

CREATE TABLE Oficina_p1 (
  codigo NUMBER(4) PRIMARY KEY,
  direccion VARCHAR(80) NOT NULL ,
  telefono NUMBER(15) NOT NULL
);

CREATE TABLE Pertenece_p1 (
  iban VARCHAR(34),
  codigo NUMBER(4),
  FOREIGN KEY (iban) REFERENCES Cuenta_p1(iban),
  FOREIGN KEY (codigo) REFERENCES Oficina_p1(codigo),
  PRIMARY KEY (iban,codigo)
);

SET SERVEROUT ON;


CREATE OR REPLACE TRIGGER Modificar_Saldo
  BEFORE INSERT on Operacion_p1
  FOR EACH ROW
  DECLARE
    valor FLOAT;
  BEGIN
    SELECT saldo into valor FROM Cuenta_p1 WHERE IBAN = :new.corigen;
    IF(:new.tipo = 'i') THEN
      UPDATE CUENTA_P1 SET saldo = valor + :new.cantidad WHERE IBAN = :new.corigen;
    ELSIF (valor >= :new.cantidad) THEN
      IF(:new.tipo = 'r') THEN
        UPDATE CUENTA_P1 SET saldo = valor - :new.cantidad WHERE IBAN = :new.corigen;
      ELSIF(:new.tipo = 'T') THEN
        UPDATE CUENTA_P1 SET saldo = valor - :new.cantidad WHERE IBAN = :new.corigen;
        UPDATE CUENTA_P1 SET saldo = valor + :new.cantidad WHERE IBAN = :new.cdestino;
      ELSE
        raise_application_error("Saldo Insuficiente");
      END IF;
    ELSE
      raise_application_error("Saldo Insuficiente");
    END IF;
  END Modificar_saldo;


--Sin los mensajes por pantalla de raise_applicacion_error funciona bien.
CREATE OR REPLACE TRIGGER Modificar_Saldo
BEFORE INSERT on Operacion_p1
FOR EACH ROW
  DECLARE
    valor FLOAT;
  BEGIN
    SELECT saldo into valor FROM Cuenta_p1 WHERE IBAN = :new.corigen;
    IF(:new.tipo = 'i') THEN
      UPDATE CUENTA_P1 SET saldo = valor + :new.cantidad WHERE IBAN = :new.corigen;
    ELSIF (valor >= :new.cantidad) THEN
      IF(:new.tipo = 'r') THEN
        UPDATE CUENTA_P1 SET saldo = valor - :new.cantidad WHERE IBAN = :new.corigen;
      ELSIF (:new.tipo = 'T') THEN
        UPDATE CUENTA_P1 SET saldo = valor - :new.cantidad WHERE IBAN = :new.corigen;
        UPDATE CUENTA_P1 SET saldo = valor + :new.cantidad WHERE IBAN = :new.cdestino;
      END IF;
    END IF;
  END Modificar_saldo;
