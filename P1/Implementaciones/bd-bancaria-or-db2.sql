DROP TABLE usuarioTabla_p3;
DROP TABLE oficinaTabla_p4;
DROP TABLE cuentaTabla_p4;
DROP TABLE operacionTabla_p4;
DROP TABLE tiene_p4;
DROP TABLE pertenece_p4;
DROP TABLE hace_p4;
DROP TYPE usuario_p4;
DROP TYPE cuentaCorriente_p4;
DROP TYPE cuentaAhorro_p4;
DROP TYPE cuenta_p4;
DROP TYPE oficina_p4;
DROP TYPE operacion_p4;


CREATE OR REPLACE TYPE usuario_p4 as(
  dni VARCHAR(10),
  nombre VARCHAR(30),
  apellidos VARCHAR(80),
  edad NUMBER,
  direccion VARCHAR(80),
  email VARCHAR(80),
  telefono NUMBER
);

CREATE OR REPLACE TYPE cuenta_p4 as(
  iban VARCHAR(34),
  numero VARCHAR(34),
  creacion DATE,
  saldo FLOAT(20)
)NOT FINAL;

CREATE OR REPLACE TYPE cuentaCorriente_p4 UNDER cuenta_p4;

CREATE OR REPLACE TYPE cuentaAhorro_p4 UNDER cuenta_p4 as(
  interes FLOAT(5),
  dia DATE
);

CREATE OR REPLACE TYPE oficina_p4 as(
  codigo VARCHAR(50),
  direccion VARCHAR(80),
  telefono NUMBER
);

CREATE OR REPLACE TYPE operacion_p4 as(
  contador NUMBER,
  tipo VARCHAR(15),		--mirar si hacer tipo nuevo
  fechaHora DATE,		--juntar fecha y hora porque el tipo date en oracle almacena las dos
  cOrigen VARCHAR(34),
  cDestino VARCHAR(34),
  sucursal VARCHAR(80),
  concepto VARCHAR(200),
  cantidad NUMBER
);

CREATE TABLE usuarioTabla_p4 OF usuario_p4;
ALTER TABLE usuarioTabla_p4 ADD PRIMARY KEY(dni);
CREATE TABLE cuentaTabla_p4 OF cuenta_p4;
ALTER TABLE cuentaTabla_p4 ADD PRIMARY KEY(iban);
CREATE TABLE oficinaTabla_p4 OF oficina_p4;
ALTER TABLE oficinaTabla_p4 ADD PRIMARY KEY(codigo);
CREATE TABLE operacionTabla_p4 OF operacion_p4;
ALTER TABLE operacionTabla_p4 ADD PRIMARY KEY(contador);

CREATE TABLE tiene_p4(
  dni REF(usuario_p4),
  iban REF(cuenta_p4)
);

CREATE TABLE pertenece_p4(
  codigo REF(oficina_p4),
  iban REF(cuenta_p4)
);

CREATE TABLE hace_p4(
  iban REF(cuenta_p4),
  contador REF(operacion_p4)
);