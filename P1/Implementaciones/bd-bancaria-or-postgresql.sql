DROP TABLE usuarioTabla_p3 CASCADE;
DROP TABLE cuentaTabla_p3 CASCADE;
/*DROP TABLE cuentaAhorroTabla_p3;
DROP TABLE cuentaCorrienteTabla_p3; */
DROP TABLE oficinaTabla_p3 CASCADE;
DROP TABLE operacionTabla_p3 CASCADE;
DROP TABLE tiene_p3;
DROP TABLE pertenece_p3;

DROP TYPE tipooperacion_p3;
DROP TYPE usuario_p3;
DROP TYPE cuenta_p3;
DROP TYPE cuentaCorriente_p3;
DROP TYPE cuentaAhorro_p3;
DROP TYPE oficina_p3 CASCADE;
DROP TYPE operacion_p3 CASCADE;

CREATE TYPE tipoOperacion_p3 as ENUM( 'ingresada', 'retirada', 'transferida');

CREATE TYPE usuario_p3 AS(
  dni VARCHAR(10),
  nombre VARCHAR(30),
  apellidos VARCHAR(80),
  edad INTEGER,
  direccion VARCHAR(80),
  email VARCHAR(80),
  telefono INTEGER
);

CREATE TYPE cuenta_p3 AS(
  iban VARCHAR(34),
  numero VARCHAR(34),
  creacion DATE,
  saldo FLOAT(20)
);

CREATE TYPE cuentaCorriente_p3;

CREATE TYPE cuentaAhorro_p3 AS (
  interes FLOAT(20),
  dia INTEGER
);

CREATE TYPE oficina_p3 AS(
  codigo INTEGER,
  direccion VARCHAR(80),
  telefono INTEGER
);

CREATE TYPE operacion_p3 AS(
  contador INTEGER,
  tipo CHAR,
  fechaHora DATE,
  cOrigen VARCHAR(34),
  cDestino VARCHAR(34),
  sucursal VARCHAR(80),
  concepto VARCHAR(200),
  cantidad INTEGER
);

CREATE TABLE usuarioTabla_p3 OF usuario_p3(PRIMARY KEY(dni));		/*añadir constraint?*/
CREATE TABLE cuentaTabla_p3 OF cuenta_p3(PRIMARY KEY(iban));
CREATE TABLE cuentaCorrienteTabla_p3(cCorriente cuenta_p3) INHERITS (cuentaTabla_p3);
CREATE TABLE cuentaAhorroTabla_p3(cAhorro cuenta_p3) INHERITS (cuentaTabla_p3);
CREATE TABLE oficinaTabla_p3 OF oficina_p3(PRIMARY KEY(codigo));
CREATE TABLE operacionTabla_p3 OF operacion_p3(PRIMARY KEY(contador),
  FOREIGN KEY (cDestino) REFERENCES cuentatabla_p3(iban),
  FOREIGN KEY (cOrigen) REFERENCES cuentatabla_p3(iban)
);

CREATE TABLE tiene_p3(
  dni VARCHAR(10) REFERENCES usuarioTabla_p3(dni),
  iban VARCHAR(34) REFERENCES cuentaTabla_p3(iban)
);

CREATE TABLE pertenece_p3(
  codigo INTEGER REFERENCES oficinaTabla_p3(codigo),
  iban VARCHAR(34) REFERENCES cuentaTabla_p3(iban)
);