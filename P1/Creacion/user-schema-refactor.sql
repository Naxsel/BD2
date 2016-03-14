CREATE TABLESPACE bd2_perm_01
DATAFILE 'bd2_perm_01.dat'
SIZE 20M
ONLINE;

CREATE TEMPORARY TABLESPACE bd2_temp_01
TEMPFILE 'bd2_temp_01.dbf'
SIZE 5M
AUTOEXTEND ON;

CREATE USER bd2
IDENTIFIED BY root
DEFAULT TABLESPACE bd2_perm_01
TEMPORARY TABLESPACE bd2_temp_01
QUOTA 20M on bd2_perm_01;

GRANT create session TO bd2;
GRANT create table TO bd2;
GRANT create view TO bd2;
GRANT create any trigger TO bd2;
GRANT create any procedure TO bd2;
GRANT create sequence TO bd2;
GRANT create synonym TO bd2;