CREATE TABLESPACE db2_perm_01
DATAFILE 'db2_perm_01.dat'
SIZE 20M
ONLINE;

CREATE TEMPORARY TABLESPACE db2_temp_01
TEMPFILE 'db2_temp_01.dbf'
SIZE 5M
AUTOEXTEND ON;

CREATE USER db2
IDENTIFIED BY root
DEFAULT TABLESPACE db2_perm_01
TEMPORARY TABLESPACE db2_temp_01
QUOTA 20M on db2_perm_01;

GRANT create session TO db2;
GRANT create table TO db2;
GRANT create view TO db2;
GRANT create any trigger TO db2;
GRANT create any procedure TO db2;
GRANT create sequence TO db2;
GRANT create synonym TO db2;