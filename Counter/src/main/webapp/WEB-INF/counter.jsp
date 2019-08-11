<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Counter</title>
	</head>
	<body>
		You have visited <c:out value="${count}"/><br>
		
		<a href="/">Return to the home page</a><br>
		<a href="/reset">Click here to reset your counter</a><br>
	</body>
</html>