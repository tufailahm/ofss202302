https://github.com/tufailahm/ofss202302

https://dbeaver.io/files/dbeaver-ce-latest-x86_64-setup.exe


SQL> alter session set "_ORACLE_SCRIPT"=true;

Session altered.

SQL> CREATE USER harry IDENTIFIED BY porter  DEFAULT TABLESPACE "USERS" TEMPORARY TABLESPACE "TEMP";

User created.


SQL> grant create session to harry;

Grant succeeded.

SQL> grant all privileges to harry;

Grant succeeded.

SQL > connect harry/porter;


===============Oracle codes==================

SELECT * FROM EMPLOYEES e ;

SELECT sysdate FROM dual d;

SELECT 2+2 FROM DUAL d;

SELECT FIRST_NAME ,SALARY , SALARY *0.3 , salary+SALARY *0.3 FROM EMPLOYEES e ;

SELECT * FROM employees WHERE COMMISSION_PCT IS NULL;

SELECT * FROM employees WHERE COMMISSION_PCT IS NOT NULL;

SELECT FIRST_NAME ,SALARY , SALARY *12 FROM EMPLOYEES e ;

SELECT FIRST_NAME ,SALARY , 12 * SALARY * COMMISSION_PCT  FROM EMPLOYEES e ;

SELECT FIRST_NAME ,SALARY , 12 * SALARY * COMMISSION_PCT  AS "Annual Salary"  FROM EMPLOYEES e ;

----To do --- NVL function



SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID 
FROM EMPLOYEES e 
WHERE JOB_ID = 'AD_VP';


SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID 
FROM EMPLOYEES e 
WHERE salary >= 2300 
AND job_id = 'IT_PROG';

SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID 
FROM EMPLOYEES e 
WHERE salary >= 2300 
OR job_id = 'IT_PROG';

SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID 
FROM EMPLOYEES e 
WHERE salary BETWEEN  1000 AND 2000


SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID 
FROM EMPLOYEES e 
WHERE salary BETWEEN  1000 AND 2000

----Fetch all the records whose job_id is IT_PROG or AD_VP
1) 
SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID 
FROM EMPLOYEES e 
WHERE JOB_ID = 'IT_PROG' OR JOB_ID ='AD_VP'

2) -- BY USING IN 
SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID 
FROM EMPLOYEES e 
WHERE JOB_ID IN ('IT_PROG' ,'AD_VP')


SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID 
FROM EMPLOYEES e 
WHERE FIRST_NAME like 'T%'

SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID ,HIRE_DATE 
FROM EMPLOYEES e 
WHERE FIRST_NAME like '_a%'


---------Order By Clause

SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID ,HIRE_DATE 
FROM EMPLOYEES e 
WHERE salary > 1200
ORDER BY salary


SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID ,HIRE_DATE 
FROM EMPLOYEES e 
WHERE salary > 1200
ORDER BY salary DESC

SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID ,HIRE_DATE 
FROM EMPLOYEES e 
WHERE salary > 1200
ORDER BY JOB_ID asc  ,salary DESC 






----------------------ASSIGNMENT 

Performs querying on this:

All tables with records are created,
now we will perform queries on these tables:


Problem#1:

Write a query to display the customer number, 
firstname, customer’s date of birth. 
Display in sorted order of date of birth
year and within that sort by firstname.

Soln:
  select custid,fname,dob 
  from customer
  order by dob,fname

Problem#2:

Write a query to display the customer’s number, 
first name, and middle name. 
The customer’s who don’t have a middle name, 
for them display the last name. 
Give the alias name as Cust_Name.

Soln:
  select custid,fname,nvl(mname,ltname)  cust_name
  from customer


Problem#3:

Write a query to display account number, customer’s number, customer’s firstname,
lastname,account opening date.

Soln:
  select a.acnumber,a.custid,c.fname,c.ltname,a.aod
  from customer c,account a
  where c.custid=a.custid

Problem # 4:

Write a query to display the number of customer’s from Delhi. 
Give the count an alias name of Cust_Count.

Soln:
  select count(*) Cust_Count
  from customer
  where city in 'Delhi'

Problem # 5:

Write a query to display  the customer number, 
customer firstname,account NUMBER
for the customer’s whose accounts were
created after 15th of any month.

SELECT * FROM customer;

SELECT * FROM ACCOUNT a
WHERE AOD > '___';













Problem # 6:

Write a query to display the female customers firstname, 
city and account number 
who are not into business, service or studies.


Problem # 7:
Write a query to display city name
and count of branches in that city. 
Give the count of branches an alias name of Count_Branch.


Problem # 8:
Write a query to display account id, customer’s 
firstname, customer’s lastname for the customer’s 
whose account is Active.

Problem # 9:
Write a query to display the customer’s number, 
customer’s firstname, branch id and 
loan amount for people who have taken loans.

Problem # 10:
Write a query to display customer number, 
customer name, account NUMBER
where the account status is terminated.

=============================
--------Functions in oracle

SELECT upper('ahmed') FROM dual;

SELECT EMPLOYEE_ID ,upper(FIRST_NAME) "Fname" ,SALARY ,JOB_ID ,HIRE_DATE 
FROM EMPLOYEES e 
WHERE salary > 1200
ORDER BY salary DESC

SELECT * FROM EMPLOYEES e 

SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID 
FROM EMPLOYEES e 
WHERE JOB_ID = 'AD_VP';

SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID 
FROM EMPLOYEES e 
WHERE lower(JOB_ID) = 'ad_vp';

SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,JOB_ID 
FROM EMPLOYEES e 
WHERE upper(JOB_ID) = 'AD_VP';


SELECT employee_id, CONCAT(first_name, last_name) NAME,
LENGTH(last_name), INSTR(last_name, 'a') "Contains 'a'?"
FROM   employees
WHERE  SUBSTR(last_name, -1, 1) = 'n';

SELECT SUBSTR('HelloWorld',1,1) FROM dual;	--H
SELECT SUBSTR('HelloWorld',1,2) FROM dual;	--HE
SELECT SUBSTR('HelloWorld',2,1) FROM dual;	--e
SELECT LENGTH(UPper(SUBSTR('HelloWorld',-3,2))) FROM dual;	--HE


SELECT SUBSTR(last_name, -1, 1) FROM EMPLOYEES e 

----------------Date functions


SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,HIRE_DATE  FROM EMPLOYEES e ;


SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY ,HIRE_DATE,sysdate,
MONTHS_BETWEEN(SYSDATE,HIRE_DATE)/12  
FROM EMPLOYEES e ;

SELECT MONTHS_BETWEEN
           ('01-SEP-18','11-JAN-17')
FROM dual;


SELECT SYSDATE - to_date(HIRE_DATE)  FROM EMPLOYEES e ;



SELECT last_name, TO_CHAR(hire_date, 'DD-Mon-YYYY')
FROM  employees
WHERE hire_date < to_date('01-03-14','DD-MM-RR')


------------NVL
---problem
SELECT FIRST_NAME ,SALARY , 
12 * SALARY * COMMISSION_PCT  AS "Annual Salary" 
FROM EMPLOYEES e ;

--solution
SELECT FIRST_NAME ,SALARY , nvl(COMMISSION_PCT,0) ,
SALARY + (SALARY * nvl(COMMISSION_PCT,0)/100)  AS "Monthly Salary" ,
(SALARY + (SALARY * nvl(COMMISSION_PCT,0)/100))*12  AS "Annual Salary" 
FROM EMPLOYEES e 
WHERE lower(FIRST_NAME) = 'john'

-----COALESCE 

SELECT FIRST_NAME ,COALESCE (COMMISSION_PCT ,MANAGER_ID,salary  ) FROM EMPLOYEES e ;


-----------AGGREGATE FUNCTIONS

selec * FROM EMPLOYEES e ;

SELECT count(*) FROM EMPLOYEES e ;
SELECT count(COMMISSION_PCT) FROM EMPLOYEES e ;

SELECT avg(salary) FROM EMPLOYEES e ;

SELECT sum(salary) FROM EMPLOYEES e ;

SELECT min(salary) FROM EMPLOYEES e ;

SELECT max(salary) FROM EMPLOYEES e ;

----Group by

SELECT manager_id,count(EMPLOYEE_ID) FROM EMPLOYEES e 
GROUP BY MANAGER_ID ;

--dept wise of sum of salary ?
SELECT DEPARTMENT_ID ,MANAGER_ID , count(salary) FROM EMPLOYEES e 
GROUP BY DEPARTMENT_ID ,MANAGER_ID 
ORDER BY count(SALARY) desc

---------------------problem
SELECT   department_id, job_id, SUM(salary)
FROM     employees
WHERE	 department_id > 40
AND sum(SALARY) > 10000
GROUP BY department_id, job_id 
ORDER BY department_id;

-------------solution

SELECT   department_id, job_id, SUM(salary)
FROM     employees
WHERE	 department_id > 40
GROUP BY department_id, job_id 
HAVING sum(SALARY) >10000
ORDER BY department_id;

--------Find out the job_id wise where 
--------sum of salary(job_id ) greater than 5000
---------sort by sum of salary desc wise

-------------Joins

--Natural JOIN 

SELECT FIRST_NAME ,DEPARTMENT_name 
FROM EMPLOYEES e 
NATURAL JOIN DEPARTMENTS d ;

SELECT FIRST_NAME ,DEPARTMENT_name 
FROM EMPLOYEES e 
NATURAL JOIN DEPARTMENTS d ;

SELECT  FIRST_NAME ,JOB_TITLE 
FROM EMPLOYEES e 
NATURAL JOIN JOBS j   ;

---------------EQUI /Inner join by using using keyword

SELECT FIRST_NAME ,DEPARTMENT_name 
FROM EMPLOYEES e 
JOIN DEPARTMENTS d 
USING (department_id)


SELECT FIRST_NAME ,DEPARTMENT_name 
FROM EMPLOYEES e 
JOIN DEPARTMENTS d 
USING (manager_id)


SELECT FIRST_NAME ,DEPARTMENT_name 
FROM EMPLOYEES e 
JOIN DEPARTMENTS d 
USING (manager_id)


SELECT FIRST_NAME ,DEPARTMENT_name 
FROM EMPLOYEES e 
JOIN DEPARTMENTS d 
ON  e.DEPARTMENT_ID  = d.DEPARTMENT_ID 

----OUTER 

LEFT 

SELECT FIRST_NAME ,DEPARTMENT_name 
FROM EMPLOYEES e  LEFT OUTER JOIN DEPARTMENTS d 
ON  e.DEPARTMENT_ID  = d.DEPARTMENT_ID 


RIGHT 
SELECT FIRST_NAME ,DEPARTMENT_name 
FROM EMPLOYEES e  RIGHT OUTER JOIN DEPARTMENTS d 
ON  e.DEPARTMENT_ID  = d.DEPARTMENT_ID 
FULL 

SELECT FIRST_NAME ,DEPARTMENT_name ,e.DEPARTMENT_ID 
FROM EMPLOYEES e  FULL OUTER JOIN DEPARTMENTS d 
ON  e.DEPARTMENT_ID  = d.DEPARTMENT_ID 

------self JOIN 

Neena reports TO steven

SELECT e2.FIRST_name || ' reports to ' || e1.first_name 
FROM EMPLOYEES e1 JOIN EMPLOYEES e2
ON e1.EMPLOYEE_ID = e2.MANAGER_ID 

------------Cross JOIN 

emp*DEPARTMENTS d2 

SELECT * FROM EMPLOYEES e CROSS JOIN DEPARTMENTS d ;


----------------------Subquery

SELECT hire_date FROM EMPLOYEES e WHERE lower(FIRST_NAME) = 'neena'


SELECT first_name,hire_date FROM EMPLOYEES e WHERE HIRE_DATE < '21-Sep-2005'

--1

SELECT first_name,hire_date FROM EMPLOYEES e
WHERE HIRE_DATE < 
(SELECT hire_date FROM EMPLOYEES e WHERE lower(FIRST_NAME) = 'neena')

---display firstname, job_id of all the employees 
--whose job_id is same as neena

 SELECT first_name,job_id FROM EMPLOYEES e WHERE JOB_ID 
 = ( SELECT JOB_ID FROM EMPLOYEES e2 WHERE lower(FIRST_NAME) = 'neena')
 



SELECT first_name,hire_date FROM EMPLOYEES e
WHERE HIRE_DATE IN 
(SELECT hire_date FROM EMPLOYEES e WHERE lower(FIRST_NAME) = 'david')

---DML

SELECT * FROM 
SELECT * FROM DEPARTMENTS d WHERE DEPARTMENT_ID = 1099

INSERT INTO DEPARTMENTS d VALUES (1099,'HR',100,1700)

INSERT INTO DEPARTMENTS d VALUES (1098,'Operations')	-- will NOT WORK AT all

INSERT INTO DEPARTMENTS d VALUES (1098,'Operations',NULL,null);

INSERT INTO DEPARTMENTS (department_name,department_id) VALUES 
('Operations',1918)


SELECT * FROM EMPLOYEES e ;



-----------UPDATE 
UPDATE EMPLOYEES 
SET DEPARTMENT_ID = 100
WHERE EMPLOYEE_ID = 100

UPDATE EMPLOYEES 
SET SALARY = salary + salary *.25
WHERE lower(FIRST_NAME) = 'neena'


----Neha is logged in 

SELECT FIRST_NAME ,salary FROM employees
WHERE EMPLOYEE_ID =100;

UPDATE EMPLOYEES 
SET SALARY = SALARY +1000
WHERE EMPLOYEE_ID =100

SAVEPOINT updateemp1

UPDATE EMPLOYEES 
SET FIRST_NAME ='Steven'
WHERE EMPLOYEE_ID =100

ROLLBACK TO updateemp1;

---------Neha is logged in 
COMMIT;
SELECT FIRST_NAME ,salary FROM employees
WHERE EMPLOYEE_ID =100;


UPDATE EMPLOYEES 
SET SALARY = SALARY +1000
WHERE EMPLOYEE_ID =100


------------DDL
DROP TABLE dept1;
CREATE TABLE dept1
(
   deptId NUMBER CONSTRAINT pkdept1 PRIMARY key,
   departmentName varchar2(20) CONSTRAINT pkdptNamenotNull NOT NULL, 
   email varchar2(20) CONSTRAINT emailUnique UNIQUE,
   gender varchar2(20) CONSTRAINT genderCheck CHECK ( gender IN ('Male', 'Female')),
   hire_date DATE DEFAULT sysdate  
)

INSERT INTO dept1 values(12,'Operations','a1@a.com','Male',default)


----Composite key
CREATE TABLE orders
(
	orderId NUMBER,
	shipmentId NUMBER,
	CONSTRAINT pk1 PRIMARY key(orderId,shipmentId)
)

INSERT INTO orders values(1,3)

SELECT * FROM orders;





CREATE TABLE dept2
(
   deptId NUMBER CONSTRAINT pkdeptId1 PRIMARY key,
   hire_date DATE DEFAULT sysdate
   
)

CREATE TABLE dept3
(
   deptId NUMBER,
   hire_date DATE DEFAULT sysdate,
   CONSTRAINT pkdeptId2 PRIMARY key(deptId)
   
)


SELECT * FROM dept1;

--FK 
CREATE TABLE emp1 
(
		empId NUMBER PRIMARY KEY,
		empName varchar(20),
		deptId NUMBER		
)
---adding fk constraint after creation of the table

alter TABLE emp1 ADD CONSTRAINT fkdeptId1 FOREIGN KEY (deptId) REFERENCES dept1(deptId);

INSERT INTO emp1 values(1010,'Tarun',2)

DELETE FROM dept1 WHERE deptId = 12;
----dropping the constraint
alter TABLE emp1 DROP CONSTRAINT fkdeptId1

--recreating this with on delete cascade

alter TABLE emp1 ADD CONSTRAINT fkdeptId1 FOREIGN KEY (deptId) REFERENCES dept1(deptId)
ON DELETE CASCADE;

SELECT * FROM emp1;

---------------sequence 
DROP  SEQUENCE dept_deptid_seq
CREATE SEQUENCE dept_deptid_seq2
                START WITH 100
                INCREMENT BY 30
                MAXVALUE 99999
                NOCACHE
                NOCYCLE
                SCALE EXTEND;
---
INSERT INTO dept1 values(dept_deptid_seq1.NEXTVAL,'HR_Ope','a4@a.com','Male',default)

SELECT * FROM dept1;

SELECT	dept_deptid_seq.CURRVAL
FROM	dual;

create sequence my_scale_seq2
  minvalue 1
  maxvalue 9999999999
  scale extend

 select my_scale_seq.currval  from dual;
 
---------Index
SELECT * FROM EMPLOYEES e WHERE FIRST_NAME LIKE 'T%'

SELECT INDEX_NAME, TABLE_NAME FROM USER_INDEXES
WHERE  upper(TABLE_NAME) = 'EMPLOYEES';

CREATE INDEX 	emp_last_name_idx
ON employees(last_name);

CREATE INDEX 	emp_first_name_idx
ON employees(first_name);


----------------------Views

SELECT * FROM USER_OBJECTS;
SELECT * FROM ALL_OBJECTS;

SELECT table_name
FROM   user_tables;

SELECT * FROM USER_TAB_COLUMNS
SELECT column_name, data_type, data_length,
       data_precision, data_scale, nullable
FROM   user_tab_columns
WHERE  table_name = 'EMPLOYEES'; 


SELECT * FROM USER_CONSTRAINTS WHERE  table_name = 'EMPLOYEES' ;
SELECT * FROM USER_CONSTRAINTS WHERE  lower(table_name) = 'dept1' ;

SELECT * FROM EMPLOYEES e WHERE EMPLOYEE_ID =145;


CREATE OR REPLACE VIEW emp_my_dept
as
SELECT employee_id, first_name,salary ,department_id
FROM EMPLOYEES e 
WHERE DEPARTMENT_ID =80
AND (manager_id = 100 AND SALARY > 10000)
WITH CHECK option

SELECT * from emp_my_dept;

SELECT * from emp_my_dept WHERE salary > 12000;

UPDATE emp_my_dept SET salary = 11000 WHERE employee_id = 146;
















