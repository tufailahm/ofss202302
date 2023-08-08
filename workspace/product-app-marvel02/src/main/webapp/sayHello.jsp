<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%-- Comments --%>
<%! 
int num1;
String name="Harsh";
%>
<body>
<h1>Hello and welcome</h1>
<%
	for(int i=1;i<=3;i++){
		out.println("<h1>OFSS bangalore");
	}
%>
<h2>Copyright : @M</h2>
<% out.println(new java.util.Date()); %>
<h1><% out.println("Welcome ,"+name); %></h1>
<h1><%= "Welcome ,"+name %></h1>
</body>
</html>




