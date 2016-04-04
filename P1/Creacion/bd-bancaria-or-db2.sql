DROP TABLE tiene_p4;
DROP TABLE pertenece_p4;
DROP TABLE hace_p4;
DROP TABLE usuarioTabla_p4;
DROP TABLE oficinaTabla_p4;
DROP TABLE cuentaTabla_p4;
DROP TABLE operacionTabla_p4;
DROP TYPE usuario_p4;
DROP TYPE cuentaCorriente_p4;
DROP TYPE cuentaAhorro_p4;
DROP TYPE cuenta_p4;
DROP TYPE oficina_p4;
DROP TYPE operacion_p4;
DROP TYPE listaCuentas_p4;
DROP TYPE listaOperaciones_p4;

CREATE TYPE listaCuentas_p4 as VARCHAR(34) ARRAY[];
CREATE TYPE listaOperaciones_p4 as VARCHAR(34) ARRAY[];

CREATE TYPE usuario_p4 as(
  dni VARCHAR(10),
  nombre VARCHAR(30),
  apellidos VARCHAR(80),
  edad INT,
  direccion VARCHAR(80),
  email VARCHAR(80),
  telefono INT
  -- cuentas listaCuentas_p4
)MODE DB2SQL;

CREATE TYPE cuenta_p4 as(
  iban VARCHAR(34),
  numero VARCHAR(34),
  creacion DATE,
  saldo FLOAT(20)
  -- operaciones listaOperaciones_p4
)MODE DB2SQL;

CREATE  TYPE cuentaCorriente_p4 UNDER cuenta_p4 MODE DB2SQL;

CREATE  TYPE cuentaAhorro_p4 UNDER cuenta_p4 as(
  interes FLOAT(5),
  dia DATE
)MODE DB2SQL;

CREATE  TYPE oficina_p4 as(
  codigo VARCHAR(50),
  direccion VARCHAR(80),
  telefono INT
)MODE DB2SQL;

CREATE  TYPE operacion_p4 as(
  contador INT,
  tipo VARCHAR(15),		--mirar si hacer tipo nuevo
  fechaHora DATE,		--juntar fecha y hora porque el tipo date en oracle almacena las dos
  cOrigen VARCHAR(34),
  cDestino VARCHAR(34),
  sucursal VARCHAR(80),
  concepto VARCHAR(200),
  cantidad INT
)MODE DB2SQL;

CREATE TABLE usuarioTabla_p4 OF usuario_p4 (REF IS oid USER GENERATED, dni WITH OPTIONS NOT NULL);
CREATE TABLE cuentaTabla_p4 OF cuenta_p4(REF IS oid USER GENERATED, iban WITH OPTIONS NOT NULL);
CREATE TABLE oficinaTabla_p4 OF oficina_p4(REF IS oid USER GENERATED, codigo WITH OPTIONS NOT NULL);
CREATE TABLE operacionTabla_p4 OF operacion_p4(REF IS oid USER GENERATED, contador WITH OPTIONS NOT NULL);

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