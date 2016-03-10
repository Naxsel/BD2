DROP TABLE usuarioTabla_p2;
DROP TABLE oficinaTabla_p2;
DROP TABLE cuentaTabla_p2;
DROP TABLE operacionTabla_p2;
DROP TABLE tiene_p2;
DROP TABLE pertenece_p2;
DROP TABLE hace_p2;
DROP TYPE usuario_p2;
DROP TYPE cuentaCorriente_p2;
DROP TYPE cuentaAhorro_p2;
DROP TYPE cuenta_p2 FORCE;
DROP TYPE oficina_p2;
DROP TYPE operacion_p2;


CREATE OR REPLACE TYPE usuario_p2 as OBJECT(
	dni VARCHAR(10),
	nombre VARCHAR(30),
	apellidos VARCHAR(80),
	edad NUMBER(3),
	direccion VARCHAR(80),
	email VARCHAR(80),
	telefono NUMBER(15)
);

CREATE OR REPLACE TYPE cuenta_p2 as OBJECT(
	iban VARCHAR(34),
	numero VARCHAR(34),
	creacion DATE,
	saldo FLOAT(20)
)NOT FINAL;



CREATE OR REPLACE TYPE cuentaCorriente_p2 UNDER cuenta_p2();

CREATE OR REPLACE TYPE cuentaAhorro_p2 UNDER cuenta_p2(
	interes FLOAT(5),
	dia DATE
);

CREATE OR REPLACE TYPE oficina_p2 as OBJECT(
	codigo VARCHAR(50),
	direccion VARCHAR(80),
	telefono INT(9)
);

CREATE OR REPLACE TYPE operacion_p2 as OBJECT(
	contador INT(20),
	tipo VARCHAR(15),		--mirar si hacer tipo nuevo
	fechaHora DATE,		--juntar fecha y hora porque el tipo date en oracle almacena las dos
	cOrigen VARCHAR(34),
	cDestino VARCHAR(34),
	sucursal VARCHAR(80),
	concepto VARCHAR(200)
);

CREATE TABLE usuarioTabla_p2 OF usuario_p2(PRIMARY KEY(dni));
CREATE TABLE cuentaTabla_p2 OF cuenta_p2(PRIMARY KEY(iban));
CREATE TABLE oficinaTabla_p2 OF oficina_p2(PRIMARY KEY(codigo));
CREATE TABLE operacionTabla_p2 OF operacion_p2(PRIMARY KEY(contador));

CREATE TABLE tiene_p2(
	dni REF usuario_p2,
	iban REF cuenta_p2
);

CREATE TABLE pertenece_p2(
	codigo REF oficina_p2,
	iban REF cuenta_p2
);

CREATE TABLE hace_p2(
	iban REF cuenta_p2,
	contador REF operacion_p2
);