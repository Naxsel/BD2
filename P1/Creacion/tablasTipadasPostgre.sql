CREATE TYPE tipoOperacion as ENUM( 'ingresada', 'retirada', 'transferida');


CREATE TYPE usuario AS(
	dni VARCHAR(9),
	nombre VARCHAR(20),
	apellidos VARCHAR(40),
	edad INT(3),
	direccion VARCHAR(80),
	email VARCHAR(20),
	telefono INT(9)
);

CREATE TYPE cuenta AS(
	iban VARCHAR(34),
	numero VARCHAR(34),
	creacion DATE(40),
	saldo FLOAT(20))
	NOT FINAL;

CREATE TYPE cuentaCorriente AS(); /*ACABAR*/

CREATE TYPE cuentaAhorro AS cuenta(
	interes FLOAT(5),
	dia DATE);

CREATE TYPE oficina AS(
	codigo VARCHAR(50),
	direccion VARCHAR(80),
	telefono INT(9)
);

CREATE TYPE operacion AS(
	contador INT(50),
	tipo VARCHAR(20),		//mirar si hacer tipo nuevo
	fechaHora DATE,		//juntar fecha y hora porque el tipo date en oracle almacena las dos
	cOrigen VARCHAR(34),
	cDestino VARCHAR(34),
	sucursal VARCHAR(50),
	concepto VARCHAR(50)
);

CREATE TABLE usuarioTabla OF usuario(PRIMARY KEY(dni));		/*añadir constraint?*/
CREATE TABLE cuentaTabla OF cuenta(PRIMARY KEY(iban));
CREATE TABLE cuentaCorrienteTabla OF cuentaINHERITS (cuentaTabla);
CREATE TABLE cuentaAhorroTabla(cuenta cuenta) INHERITS (cuentaTabla);
CREATE TABLE oficinaTabla OF oficina(PRIMARY KEY(codigo));
CREATE TABLE operacionTabla OF operacion(PRIMARY KEY(contador));

CREATE TABLE tiene(
	dni REF(usuarioTabla),
	iban REF(cuentaTabla));

CREATE TABLE pertenece(
	codigo REF(oficinaTabla),
	iban REF(cuentaTabla));

CREATE TABLE hace(
	iban REF(cuentaTabla),
	contador REF(operacionTabla));