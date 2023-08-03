<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   
<html>
<body>
<h2>####Printing all the products###</h2>
<table border="4" cellspacing="10" cellpadding="10">
    <c:forEach var="product" items="${allProducts}">
    <tr>
        <td> <c:out value="${product.productId}"></c:out></td>
        <td><c:out value="${product.productName}"></c:out></td>
        <td><c:out value="${product.quantityOnHand}"></c:out></td>
        <td><c:out value="${product.price}"></c:out></td>
        </tr>
    </c:forEach>
</table>

	
	<a href="index.jsp">Home</a>|<a href="product.html">Add Product</a>
</body>
</html>



