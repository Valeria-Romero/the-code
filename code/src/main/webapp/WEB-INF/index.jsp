<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The code</title>
</head>
<body>
	<h1>What is the code?</h1>
	
	
	<form action="/code" method="POST" model="codigo">
		<input type="text" name="codigoSecreto">
		<input type="submit" value="Try code">
	</form>
</body>
</html>