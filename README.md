
SQL> alter session set "_ORACLE_SCRIPT"=true;

Session altered.

SQL> CREATE USER harry IDENTIFIED BY porter  DEFAULT TABLESPACE "USERS" TEMPORARY TABLESPACE "TEMP";

User created.


SQL> grant create session to harry;

Grant succeeded.

SQL> grant all privileges to harry;

Grant succeeded.

SQL > connect harry/porter;