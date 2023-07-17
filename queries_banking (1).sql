Performs querying on this:

All tables with records are created, now we will perform queries on these tables:


Problem#1:

Write a query to display the customer number, firstname, customer’s date of birth. 
Display in sorted order of date of birth year and within that sort by firstname.

Soln:
  select custid,fname,dob 
  from customer
  order by dob,fname

Problem#2:

Write a query to display the customer’s number, first name, and middle name. 
The customer’s who don’t have a middle name, for them display the last name. 
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

Write a query to display  the customer number, customer firstname,account number for the customer’s whose accounts were created after 15th of any month.
Problem # 6:

Write a query to display the female customers firstname, city and account number who are not into business, service or studies.
Problem # 7:

Write a query to display city name and count of branches in that city. Give the count of branches an alias name of Count_Branch.
Problem # 8:

Write a query to display account id, customer’s firstname, customer’s lastname for the customer’s whose account is Active.
Problem # 9:

Write a query to display the customer’s number, customer’s firstname, branch id and loan amount for people who have taken loans.
Problem # 10:

Write a query to display customer number, customer name, account number where the account status is terminated.