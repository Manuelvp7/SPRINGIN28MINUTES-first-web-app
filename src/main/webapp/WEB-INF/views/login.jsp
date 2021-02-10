<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yahoo!!!!! FROM JSP</title>
</head>

<%
System.out.println(request.getParameter("name"));
java.util.Date date = new Date();
%>

<body>
	
	
	<form action="/spring-mvc/login" method="POST">
		<p><font color="red"/>${errorMessage}</font></p>
		Name
		<input type="text" name="name"/>
		Password
		<input type="text" name="pass"/>
		<input type="submit" value="LOGIN"/>
	</form>
</body>
</html>