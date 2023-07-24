Oracle 19c Material Link : https://drive.google.com/file/d/1GTJWiPYNOLL7Gi4q3UzUpzypT7r4iKCn/view?usp=sharing

Unix/Linux Material Link :
https://drive.google.com/file/d/131ES9ut0tz__Gnh6RkYZoEZQfI2DE-hi/view?usp=sharing
https://drive.google.com/file/d/15zycTlzJ4D3h5BWm5gC25UUa2gDArXyc/view?usp=sharing

Core Java Link :https://drive.google.com/file/d/1UHv-KkHwKBFSs0RnCIJiFtnDOJKBHNuU/view?usp=sharing

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


-------------------PL-SQL
declare 
num1 number:=100;
begin 
dbms_output.put_line('number is :' || num1);
end;

----PL-SQL -- to add numbers

DECLARE
num1 NUMBER := 100;
num2 NUMBER := 200;
res NUMBER :=0;
BEGIN
	res := num1 + num2;
	dbms_output.put_line('The sum is '|| res);
END;

-------------------Hands on
--------Loop
BEGIN
         FOR v_loopcounter IN 1..5 LOOP
              DBMS_OUTPUT.PUT_LINE('Loop counter is ' || v_loopcounter);
         END LOOP;
    END;

 ----------Hands on - table of a given number : 
   tableOf NUMBER := 9
   
   
BEGIN 
	dbms_output.put_line('Hello');
END;


----------
declare
v_day NUMBER := TO_CHAR(sysdate,'DD');
begin
	if v_day > 12
	then
		DBMS_OUTPUT.put_line(v_day||': Off-peak');
	else
		DBMS_OUTPUT.put_line(v_day||': Peak');
	end if;
end;


DECLARE
 v_Score Number := 85; --Percentage
 v_LetterGrade Char(1);
BEGIN
     IF v_Score >= 90 THEN
            v_LetterGrade := 'A';
        ELSIF v_Score >= 80 THEN
             v_LetterGrade := 'B';
        ELSIF v_Score >= 70 THEN
            v_LetterGrade := 'C';
       ELSIF v_Score >= 60 THEN
           v_LetterGrade := 'D';
      ELSE
           v_LetterGrade := 'E';
      END IF;
      DBMS_OUTPUT.PUT_LINE('Your Letter Grade is: ' || v_LetterGrade);
 END;


----------------Table

declare 
num1 number:=1;
num2 number:=10;
res number:= 0;
num4 number:=12;
begin
	for i in num1..num2 LOOP
		res := num4 * num1;
		dbms_output.put_line(num4 ||' X ' || num1 || ' = ' || res);
		num1:= num1+ 1;
	end loop;
end;

--------------

DECLARE
v_fname varchar(20) := 'NA';
BEGIN
	SELECT first_name INTO v_fname FROM EMPLOYEES e WHERE EMPLOYEE_ID =100;
	dbms_output.put_line('The first is : '|| v_fname);
END;


SELECT * FROM EMPLOYEES e2
----------------
DECLARE
v_fname1 EMPLOYEES.first_name%type := 'NA';
sal1 EMPLOYEES.salary%type :=0;
BEGIN
	SELECT first_name,salary INTO v_fname1,sal1 FROM EMPLOYEES e 
	WHERE EMPLOYEE_ID =100;
	dbms_output.put_line('The first name is : '|| v_fname1);
	dbms_output.put_line('The salary is : '|| sal1);
END;
---------------------

DECLARE
 v_outer_variable VARCHAR2(20):='GLOBAL VARIABLE';
BEGIN
  DECLARE
   v_inner_variable VARCHAR2(20):='INNER VARIABLE';
  BEGIN
   DBMS_OUTPUT.PUT_LINE(v_inner_variable);
   DBMS_OUTPUT.PUT_LINE(v_outer_variable);
  END;
 DBMS_OUTPUT.PUT_LINE(v_outer_variable); 
END;



VARIABLE b_result NUMBER
BEGIN
  SELECT (SALARY*12) + NVL(COMMISSION_PCT,0) INTO :b_result
  FROM employees WHERE employee_id = 144;
END;
/
PRINT b_result


-----------------------

DECLARE
  v_countryid    locations.country_id%TYPE := 'CA';
  v_loc_id       locations.location_id%TYPE;
  v_counter		  NUMBER(2) := 1;
  v_new_city     locations.city%TYPE := 'Montreal';
BEGIN
  SELECT MAX(location_id) INTO v_loc_id FROM locations
  WHERE country_id = v_countryid;
  LOOP
    INSERT INTO locations(location_id, city, country_id)   
    VALUES((v_loc_id + v_counter), v_new_city, v_countryid);
    v_counter := v_counter + 1;
    EXIT WHEN v_counter < 30;
  END LOOP;
DBMS_OUTPUT.PUT_LINE(v_counter-1||' rows added.');
END;

SELECT * FROM LOCATIONS l ;


-----------


DECLARE
  v_total SIMPLE_INTEGER := 0;
BEGIN
  FOR i IN 1..10 LOOP
    v_total := v_total + i;
    DBMS_OUTPUT.PUT_LINE
     ('Total is: '|| v_total);
    CONTINUE WHEN i > 5;
    v_total := v_total + i; 
    DBMS_OUTPUT.PUT_LINE
     ('Out of Loop Total is:
      '|| v_total);    
  END LOOP;
END;

-----------------------------------Collections
DECLARE
  TYPE t_rec IS RECORD
    (
	 v_first_name employees.first_name%type,
	 v_sal number(8),
	 v_hire_date employees.hire_date%type,
	 );
  v_myrec t_rec;
 
BEGIN
SELECT first_name,salary, hire_date INTO v_myrec
      FROM employees WHERE employee_id = 100;
  DBMS_OUTPUT.PUT_LINE('First Name: 
 '||v_myrec.v_first_name ||'Salary: 
 '||v_myrec.v_sal ||'Hire Date:
 '|| v_myrec.v_hire_date);
END;

------------------------%ROWTYPE

DECLARE
  TYPE t_rec IS RECORD
    (v_sal number(8),
     v_minsal number(8) default 1000,
     v_hire_date employees.hire_date%type,
     v_rec1 employees%rowtype);
  v_myrec t_rec;
BEGIN
  v_myrec.v_sal := v_myrec.v_minsal + 500;
  v_myrec.v_hire_date := sysdate;
  SELECT * INTO v_myrec.v_rec1
      FROM employees WHERE employee_id = 100;
  DBMS_OUTPUT.PUT_LINE(v_myrec.v_rec1.last_name ||' '||
  v_myrec.v_hire_date ||' '|| v_myrec.v_sal);
 DBMS_OUTPUT.PUT_LINE('Printing data from db');
  DBMS_OUTPUT.PUT_LINE(v_myrec.v_rec1.last_name ||' '||
  v_myrec.v_rec1.hire_date ||' '|| v_myrec.v_rec1.salary);
END;



--------------------Associative Arrays

DECLARE
  TYPE email_table IS TABLE OF
    employees.email%TYPE 
    INDEX BY PLS_INTEGER;
    email_list       email_table; 
BEGIN
   email_list(1) := 'tufailahmedkhan@gmail.com';
  	email_list(2) := 'tarun@gmail.com';
  	email_list(3) := 'neha@gmail.com';
   DBMS_OUTPUT.PUT_LINE(email_list(1)); 
   DBMS_OUTPUT.PUT_LINE(email_list(2)); 
   DBMS_OUTPUT.PUT_LINE(email_list(3)); 
END; 


DECLARE
TYPE dept_table_type IS TABLE OF 
  departments%ROWTYPE 
  INDEX BY PLS_INTEGER;
  dept_table dept_table_type;
  -- Each element of dept_table is a record
BEGIN
   SELECT * INTO dept_table(1) FROM departments 
   WHERE department_id = 10;
   DBMS_OUTPUT.PUT_LINE(dept_table(1).department_id ||' '||
   dept_table(1).department_name ||' '||           
   dept_table(1).manager_id);
END;

	SELECT employee_id,first_name,salary
	FROM EMPLOYEES ;

---------------Cursor


DECLARE
	CURSOR emp_name_salary IS
	SELECT employee_id,first_name,salary
	FROM EMPLOYEES ;
	employee_record emp_name_salary%rowtype;

BEGIN
		OPEN emp_name_salary;
		LOOP
				FETCH emp_name_salary INTO employee_record;
		EXIT WHEN emp_name_salary%NOTFOUND;
				dbms_output.put_line(employee_record.employee_Id || ' ' || employee_record.first_name || ' ' || employee_record.salary || ' ' );
		END LOOP;
		CLOSE emp_name_salary;
END;



------------cursors parameters 

DECLARE
	CURSOR emp_name_salary (m_id number) IS
	SELECT employee_id,first_name,salary
	FROM EMPLOYEES WHERE manager_id = m_id;
	employee_record emp_name_salary%rowtype;
BEGIN
		OPEN emp_name_salary(1);
		LOOP
				FETCH emp_name_salary INTO employee_record;
		EXIT WHEN emp_name_salary%NOTFOUND;
				dbms_output.put_line(employee_record.employee_Id || ' ' || employee_record.first_name || ' ' || employee_record.salary || ' ' );
		END LOOP;
		CLOSE emp_name_salary;
		dbms_output.put_line('Printing the details about manager id : 101');
		OPEN emp_name_salary(101);
		LOOP
				FETCH emp_name_salary INTO employee_record;
		EXIT WHEN emp_name_salary%NOTFOUND;
				dbms_output.put_line(employee_record.employee_Id || ' ' || employee_record.first_name || ' ' || employee_record.salary || ' ' );
		END LOOP;
		CLOSE emp_name_salary;
END;


-----------------

DECLARE
	CURSOR emp_name_salary (m_id number) IS
	SELECT employee_id,first_name,salary
	FROM EMPLOYEES WHERE manager_id = m_id;
	employee_record emp_name_salary%rowtype;
	mng_id NUMBER := 100;

BEGIN
		LOOP mng_id  100..101 
			OPEN emp_name_salary(mng_id);
			LOOP
					FETCH emp_name_salary INTO employee_record;
			EXIT WHEN emp_name_salary%NOTFOUND;
					dbms_output.put_line(employee_record.employee_Id || ' ' || employee_record.first_name || ' ' || employee_record.salary || ' ' );
			END LOOP;
			CLOSE emp_name_salary;
			dbms_output.put_line('Printing the details about manager id : 101');

		END
		--		OPEN emp_name_salary(101);
--		LOOP
--				FETCH emp_name_salary INTO employee_record;
--		EXIT WHEN emp_name_salary%NOTFOUND;
--				dbms_output.put_line(employee_record.employee_Id || ' ' || employee_record.first_name || ' ' || employee_record.salary || ' ' );
--		END LOOP;
--		CLOSE emp_name_salary;
END;

 SELECT last_name,salary
  FROM employees WHERE FIRST_NAME ='Neena'

UPDATE EMPLOYEES SET salary = 13000 WHERE FIRST_NAME ='Neena';

--------------------------------------Exception Handling

DECLARE
  v_lname VARCHAR2(15);
  searchName varchar(20) := 'Neena';
 	sal employees.salary%TYPE;
 	invalid_salary EXCEPTION;		-- DECLARE THE EXCEPTION
BEGIN
  SELECT last_name,salary INTO v_lname,sal 
  FROM employees
  WHERE first_name= searchName ; 
 	IF sal < 5000 THEN
    RAISE invalid_salary;
  END IF;
  		DBMS_OUTPUT.PUT_LINE (searchName || ' last name is :' ||v_lname);
  		
 EXCEPTION
 	WHEN TOO_MANY_ROWS THEN dbms_output.put_line('There are many '|| searchName );
 	WHEN NO_DATA_FOUND THEN dbms_output.put_line('No user with '||  searchName);
 	WHEN invalid_salary THEN dbms_output.put_line('Your salary is invalid in accordance with company policy');
 	WHEN OTHERS THEN dbms_output.put_line('Some other error occurred');
END;



-------------------------Procedure

CREATE OR REPLACE PROCEDURE firstProcedure
IS 
BEGIN 
	declare 
		num1 number:=100;
		begin 
			dbms_output.put_line('number is :' || num1);
		end;
END;




--calling prcedure

BEGIN
		firstProcedure;
END;


CREATE OR REPLACE PROCEDURE checkName 
(
	searchName IN varchar
)
as
BEGIN 
	DECLARE
  v_lname VARCHAR2(15);
 	sal employees.salary%TYPE;
 	invalid_salary EXCEPTION;		-- DECLARE THE EXCEPTION
BEGIN
  SELECT last_name,salary INTO v_lname,sal 
  FROM employees
  WHERE first_name= searchName ; 
 	IF sal < 5000 THEN
    RAISE invalid_salary;
  END IF;
  		DBMS_OUTPUT.PUT_LINE (searchName || ' last name is :' ||v_lname);	
 EXCEPTION
 	WHEN TOO_MANY_ROWS THEN dbms_output.put_line('There are many '|| searchName );
 	WHEN NO_DATA_FOUND THEN dbms_output.put_line('No user with '||  searchName);
 	WHEN invalid_salary THEN dbms_output.put_line('Your salary is invalid in accordance with company policy');
 	WHEN OTHERS THEN dbms_output.put_line('Some other error occurred');
END;
END;
-----------calling procedure
BEGIN
	checkName('Ahmed');
	checkName('Steven');
	checkName('Neha');
END;

------------------CREATING A FUNCTION

CREATE FUNCTION check_sal RETURN Boolean IS
v_dept_id employees.department_id%TYPE;
 v_empno   employees.employee_id%TYPE;
 v_sal     employees.salary%TYPE;
 v_avg_sal employees.salary%TYPE;
BEGIN
 v_empno:=205;
 SELECT salary,department_id INTO v_sal,v_dept_id FROM employees
 WHERE employee_id= v_empno;
 SELECT avg(salary) INTO v_avg_sal FROM employees WHERE department_id=v_dept_id;
 IF v_sal > v_avg_sal THEN
  RETURN TRUE;
 ELSE
  RETURN FALSE;  
 END IF;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
   RETURN NULL;
END;

---------------calling  a function

SELECT check_sal FROM dual;		-- NW


BEGIN
 IF (check_sal IS NULL) THEN
 DBMS_OUTPUT.PUT_LINE('The function returned  NULL due to exception');
 ELSIF (check_sal) THEN  
 DBMS_OUTPUT.PUT_LINE('Salary > average');
 ELSE
 DBMS_OUTPUT.PUT_LINE('Salary < average');
 END IF;
END;


create or replace function AddNumbers
(
     num1 number,
     num2 number
)
RETURN number
AS
BEGIN
      return num1+num2;
END;


SELECT addNumbers(12,12) FROM dual;

---------------Parameters


declare 
num1 number:=1;
num2 number:=10;
res number:= 0;
num4 number:=12;
begin
	for i in num1..num2 LOOP
		res := num4 * num1;
		dbms_output.put_line(num4 ||' X ' || num1 || ' = ' || res);
		num1:= num1+ 1;
	end loop;
end;



BEGIN
	myTable(18);
	myTable(23);
END




-----------------To do
DECLARE
v_fname1 EMPLOYEES.first_name%type := 'NA';
sal1 EMPLOYEES.salary%type :=0;
BEGIN
	SELECT first_name,salary INTO v_fname1,sal1 FROM EMPLOYEES e 
	WHERE EMPLOYEE_ID =100;
	dbms_output.put_line('The first name is : '|| v_fname1);
	dbms_output.put_line('The salary is : '|| sal1);
END;

-------------execute

BEGIN
	searchEmployee(19012112);
END;



CREATE OR REPLACE PROCEDURE searchEmployee
(
	epid EMPLOYEES.EMPLOYEE_ID%type :=0
)
AS 
BEGIN 
DECLARE
v_fname1 EMPLOYEES.first_name%type := 'NA';
sal1 EMPLOYEES.salary%type :=0;
BEGIN
	SELECT first_name,salary INTO v_fname1,sal1 FROM EMPLOYEES e 
	WHERE EMPLOYEE_ID=epid ;
	dbms_output.put_line('The first name is : '|| v_fname1);
	dbms_output.put_line('The salary is : '|| sal1);
EXCEPTION
WHEN NO_DATA_FOUND THEN dbms_output.put_line('No user with '|| epid );
END;
END;


---------------------------------
BEGIN
	searchEmployee(100);
END;

------------------OUT parameter

CREATE OR REPLACE PROCEDURE query_emp
 (p_id     IN  employees.employee_id%TYPE,
  message IN OUT varchar2,
  p_name   OUT employees.last_name%TYPE,
  p_salary OUT employees.salary%TYPE) IS
BEGIN
		message := message || ' OFSS';
  SELECT  last_name, salary INTO p_name, p_salary
  FROM    employees
  WHERE   employee_id = p_id;
END query_emp;

------------executing
CREATE OR REPLACE PROCEDURE display
(
	p_id   IN  employees.employee_id%TYPE
)AS
  message varchar2(40) := 'Welcome to Oracle ';
  v_emp_name employees.last_name%TYPE;
  v_emp_sal  employees.salary%TYPE;
BEGIN
  query_emp(p_id, message, v_emp_name, v_emp_sal);
  DBMS_OUTPUT.PUT_LINE(v_emp_name||' earns '|| to_char(v_emp_sal, '$999,999.00'));
 	DBMS_OUTPUT.put_line('Message for you is : '|| message );
END display;

--------------------------
BEGIN
	display(101);
END;




=====================================================sql developer code
BEGIN
	display(&eid);
END;


select employee_id, getSalary(employee_id) from employees;

EXECUTE dbms_output.put_line(getSalary(100))

execute comm_pkg.reset_comm(1.8);


execute ofss.reset_comm(0.3);








---------------
select * from employees where employee_id = 100;
update employees set salary = 1000 where employee_id = 100;

update employees set salary = 29000 where employee_id = 100;


select sysdate from dual;





update employees set salary = 17000 where employee_id = 103;


create table saldetails
(
  employee_id number,
  old_salary number,
  new_salary number
)

select * from saldetails;





set autocommit  off;
select * from employees where employee_id = 1987;
update employees set salary = 1000 where employee_id = 103;
INSERT INTO EMPLOYEES
(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID)
VALUES(1987, 'Shubham', 'Jaiswal', 'shubhi', '123', sysdate, 'SA_REP', 160000, 0.9, 100, 100);

CREATE OR REPLACE TRIGGER derive_commission_pct
BEFORE INSERT OR UPDATE OF salary ON employees
FOR EACH ROW
WHEN (NEW.job_id = 'SA_REP')
BEGIN
 IF INSERTING THEN
   :NEW.commission_pct := 0;
ELSIF UPDATING THEN
   :NEW.commission_pct := 0;
 ELSIF :OLD.commission_pct IS NULL THEN
   :NEW.commission_pct := 0;
 ELSE 
   :NEW.commission_pct := :OLD.commission_pct+0.05;
 END IF;
END;

DESCRIBE user_triggers

CREATE OR REPLACE VIEW commissioned AS SELECT first_name, last_name, commission_pct FROM employees WHERE commission_pct > 0.00;

CREATE OR REPLACE VIEW emp_mails AS SELECT first_name, last_name, email FROM employees;

SELECT object_name, status
FROM user_objects
WHERE object_type = 'VIEW'
ORDER BY object_name;


ALTER TABLE employees MODIFY email VARCHAR2(100);


select * from commissioned;
select * from emp_mails;

SELECT name, type, referenced_name, referenced_type
FROM   user_dependencies
WHERE  referenced_name IN ('EMPLOYEES');

@c:\ofss\utldtree.sql

select * from deptree_temptab ;

EXECUTE deptree_fill('TABLE', 'harry', 'EMPLOYEES')

SELECT   nested_level, type, name
FROM     deptree
ORDER BY seq#;

-----------------fine grained 

select * from t2;
CREATE TABLE t2 (col_a NUMBER, col_b NUMBER, col_c NUMBER);
CREATE VIEW v AS SELECT col_a, col_b FROM t2;

SELECT ud.name, ud.type, ud.referenced_name, 
       ud.referenced_type, uo.status
FROM user_dependencies ud, user_objects uo
WHERE ud.name = uo.object_name AND ud.name = 'V';

ALTER TABLE t2 ADD (col_d VARCHAR2(20));
SELECT ud.name, ud.type, ud.referenced_name, 
       ud.referenced_type, uo.status
FROM user_dependencies ud, user_objects uo
WHERE ud.name = uo.object_name AND ud.name = 'V';


ALTER TABLE t2 MODIFY (col_a VARCHAR2(20));

SELECT ud.name, ud.referenced_name, ud.referenced_type, uo.status
FROM user_dependencies ud, user_objects uo
WHERE ud.name = uo.object_name AND ud.name = 'V';


----------------------------------------------


DECLARE
   TYPE EmpCurTyp IS REF CURSOR;
   emp_cv   EmpCurTyp;
   emp_rec  employees%ROWTYPE;
   sql_stmt VARCHAR2(200);
   my_job   VARCHAR2(10) := 'ST_CLERK';
BEGIN
   sql_stmt := 'SELECT * FROM employees
                WHERE job_id = :j';
   OPEN emp_cv FOR sql_stmt USING my_job;
   LOOP
      FETCH emp_cv INTO emp_rec;
      EXIT WHEN emp_cv%NOTFOUND;
      -- process record
      dbms_output.put_line(emp_rec.first_name);
   END LOOP;
   CLOSE emp_cv;
END;

set serveroutput on;