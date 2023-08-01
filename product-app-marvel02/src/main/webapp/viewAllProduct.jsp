<%@page import="com.training.pms.marvel.utility.ProductData"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.training.pms.marvel.model.Product"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<center><h2>Product Details</h2></center>
<hr/>
	<%!Product product = new Product();%>
	<%
	List<Product> products = ProductData.getAllProducts();
	Iterator<Product> iterator = products.iterator();
	%>
	<table border="2" cellspacing="10" cellpadding="10" align="center">
		<tr>
			<th>Product Id</th>
			<th>Product name</th>
			<th>QOH</th>
			<th>Price</th>
		</tr>
		<%
		while (iterator.hasNext()) {
			product = iterator.next();
		%>
		<tr>
			<td><%=product.getProductId()%></td>
			<td><%=product.getProductName()%></td>
			<td><%=product.getQuantityOnHand()%></td>
			<td><%=product.getPrice()%></td>
		</tr>
		<%
		}
		%>
	</table>
	
	<a href="index.jsp">Home</a>|<a href="product.html">Add Product</a>
</body>
</html>