
drop table trandetails;

drop table loan;

drop table account;

drop table branch;

drop table customer;



CREATE TABLE customer
   (
       custid VARCHAR2(6),
       fname VARCHAR2(30),
       mname VARCHAR2(30),
       ltname VARCHAR2(30),
       city VARCHAR2(15),
       mobileno VARCHAR2(10),
       occupation VARCHAR2(10),
       dob DATE,
      CONSTRAINT customer_custid_pk PRIMARY KEY(custid)   
   )
/

INSERT INTO customer VALUES('C00001','Ramesh','Chandra','Sharma','Delhi','9543198345','Service','06-DEC-1976')
/
INSERT INTO customer VALUES('C00002','Avinash','Sunder','Minha','Delhi','9876532109','Service','16-OCT-1974')
/
INSERT INTO customer VALUES('C00003','Rahul',null,'Rastogi','Delhi','9765178901','Student','26-SEP-1981')
/
INSERT INTO customer VALUES('C00004','Parul',null,'Gandhi','Delhi','9876532109','Housewife','03-NOV-1976')
/
INSERT INTO customer VALUES('C00005','Naveen','Chandra','Aedekar','Mumbai','8976523190','Service','19-SEP-1976')
/
INSERT INTO customer VALUES('C00006','Chitresh',null,'Barwe','Mumbai','7651298321','Student','06-NOV-1992')
/
INSERT INTO customer VALUES('C00007','Amit','Kumar','Borkar','Mumbai','9875189761','Student','06-SEP-1981')
/
INSERT INTO customer VALUES('C00008','Nisha',null,'Damle','Mumbai','7954198761','Service','03-DEC-1975')
/
INSERT INTO customer VALUES('C00009','Abhishek',null,'Dutta','Kolkata','9856198761','Service','22-MAY-1973')
/
INSERT INTO customer  VALUES('C00010','Shankar',null,'Nair','Chennai','8765489076','Service','12-JULY-1976')
/

CREATE TABLE branch
   (
    bid VARCHAR2(6),
    bname VARCHAR2(30),
    bcity VARCHAR2(30),
    CONSTRAINT branch_bid_pk PRIMARY KEY(bid) 
   )
/
INSERT INTO branch VALUES('B00001','Asaf ali road','Delhi')
/
INSERT INTO branch VALUES('B00002','New delhi main branch','Delhi')
/
INSERT INTO branch VALUES('B00003','Delhi cantt','Delhi')
/
INSERT INTO branch VALUES('B00004','Jasola','Delhi')
/
INSERT INTO branch VALUES('B00005','Mahim','Mumbai')
/
INSERT INTO branch VALUES('B00006','Vile parle','Mumbai')
/
INSERT INTO branch VALUES('B00007','Mandvi','Mumbai')
/
INSERT INTO branch VALUES('B00008','Jadavpur','Kolkata')
/
INSERT INTO branch VALUES('B00009','Kodambakkam','Chennai')
/

CREATE TABLE account
   (
      acnumber VARCHAR2(6),
      custid  VARCHAR2(6),
      bid VARCHAR2(6),
      opening_balance number(8,2),
      aod DATE,
      atype VARCHAR2(10),
      astatus VARCHAR2(10),
      CONSTRAINT account_acnumber_pk PRIMARY KEY(acnumber),
      CONSTRAINT account_custid_fk FOREIGN KEY(custid) REFERENCES customer(custid),
      CONSTRAINT account_bid_fk FOREIGN KEY(bid) REFERENCES branch(bid) 
    )
/
INSERT INTO account VALUES('A00001','C00001','B00001',1000,'15-DEC-2012','Saving','Active')
/
INSERT INTO account VALUES('A00002','C00002','B00001',1000,'12-JUNE-2012','Saving','Active')
/
INSERT INTO account VALUES('A00003','C00003','B00002',1000,'17-MAY-2012','Saving','Active')
/
INSERT INTO account VALUES('A00004','C00002','B00005',1000,'27-JAN-2013','Saving','Active')
/
INSERT INTO account VALUES('A00005','C00006','B00006',1000,'17-DEC-2012','Saving','Active')
/
INSERT INTO account VALUES('A00006','C00007','B00007',1000,'12-AUG-2010','Saving','Suspended')
/
INSERT INTO account VALUES('A00007','C00007','B00001',1000,'02-OCT-2012','Saving','Active')
/
INSERT INTO account VALUES('A00008','C00001','B00003',1000,'09-NOV-2009','Saving','Terminated')
/
INSERT INTO account VALUES('A00009','C00003','B00007',1000,'30-NOV-2008','Saving','Terminated')
/
INSERT INTO account VALUES('A00010','C00004','B00002',1000,'01-MAR-2013','Saving','Active')
/



CREATE TABLE trandetails
    (   
     tnumber VARCHAR2(6),
     acnumber VARCHAR2(6),
     dot DATE,
     medium_of_transaction VARCHAR2(20),
     transaction_type VARCHAR2(20),
     transaction_amount number(7,2),    
     CONSTRAINT trandetails_tnumber_pk PRIMARY KEY(tnumber),
     CONSTRAINT trandetails_acnumber_fk FOREIGN KEY(acnumber) REFERENCES account(acnumber)  
    )
/
INSERT INTO trandetails VALUES('T00001','A00001','01-JAN-2013','Cheque','Deposit',2000)
/
INSERT INTO trandetails VALUES('T00002','A00001','01-FEB-2013','Cash','Withdrawal',1000)
/
INSERT INTO trandetails VALUES('T00003','A00002','01-JAN-2013','Cash','Deposit',2000)
/
INSERT INTO trandetails VALUES('T00004','A00002','01-FEB-2013','Cash','Deposit',3000)
/
INSERT INTO trandetails VALUES('T00005','A00007','11-JAN-2013','Cash','Deposit',7000)
/
INSERT INTO trandetails VALUES('T00006','A00007','13-JAN-2013','Cash','Deposit',9000)
/
INSERT INTO trandetails VALUES('T00007','A00001','13-MAR-2013','Cash','Deposit',4000)
/
INSERT INTO trandetails VALUES('T00008','A00001','14-MAR-2013','Cheque','Deposit',3000)
/
INSERT INTO trandetails VALUES('T00009','A00001','21-MAR-2013','Cash','Withdrawal',9000)
/
INSERT INTO trandetails VALUES('T00010','A00001','22-MAR-2013','Cash','Withdrawal',2000)
/
INSERT INTO trandetails VALUES('T00011','A00002','25-MAR-2013','Cash','Withdrawal',7000)
/
INSERT INTO trandetails VALUES('T00012','A00007','26-MAR-2013','Cash','Withdrawal',2000)
/


CREATE TABLE loan
   (
    custid VARCHAR2(6),
    bid VARCHAR2(6),
    loan_amount number(9,2),
    CONSTRAINT loan_customer_custid_bid_pk PRIMARY KEY(custid,bid),
    CONSTRAINT loan_custid_fk FOREIGN KEY(custid) REFERENCES  customer(custid),
    CONSTRAINT loan_bid_fk FOREIGN KEY(bid) REFERENCES  branch(bid)
   )
/

INSERT INTO loan VALUES('C00001','B00001',100000)
/
INSERT INTO loan VALUES('C00002','B00002',200000)
/
INSERT INTO loan VALUES('C00009','B00008',400000)
/
INSERT INTO loan VALUES('C00010','B00009',500000)
/
INSERT INTO loan VALUES('C00004','B00003',600000)
/
INSERT INTO loan VALUES('C00003','B00001',600000)
/
