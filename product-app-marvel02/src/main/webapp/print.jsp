<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font color=red>
<%
		for(int i=1;i<=10;i++){
			if(i%2==0)
			{
				out.print(i+"  OFSS");
			}
			else
			{
				
			}
		}
%>
</font>
</h1>
</body>
</html>