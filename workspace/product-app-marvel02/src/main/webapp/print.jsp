<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<h1>Printing 1 to 5 using JSTL</h1>
	<font color="green"> 
	<c:forEach begin="1" end="5" var="i"
			step="1">
			<br/><c:out value="${i}"></c:out>
		</c:forEach>
	</font>
	<hr />

</body>
</html>