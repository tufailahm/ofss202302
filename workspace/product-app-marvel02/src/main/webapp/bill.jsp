<%@page import="com.training.pms.marvel.model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<html>
<body>
	<%
	String uname = (String) session.getAttribute("usern");
	Product product = (Product) session.getAttribute("productData");
	%>
	<h2>
		Hi ,
		<%=uname%>, your final bill is below :
	</h2>
	<table border="2" cellspacing="10" cellpadding="10">
		<tr>
			<td>Product Id</td>
			<td><%=product.getProductId()%></td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td><%=product.getProductName()%></td>
		</tr>
		<tr>
			<td>Quantity On hand</td>
			<td><%=product.getQuantityOnHand()%></td>
		</tr>
		<tr>
			<td>Price</td>
			<td><%=product.getPrice()%></td>
		</tr>
	</table>
	<br />
	<br />
	<br />
	<a href="index.jsp">Home</a>
</body>
</html>