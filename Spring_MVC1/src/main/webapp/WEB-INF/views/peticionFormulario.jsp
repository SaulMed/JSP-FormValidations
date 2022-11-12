<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css">
</head>
<body>
	<div class="container">
		<h2>Ingresa tu nombre</h2>
		<form action="resModelForm" method="get">
		<label>Nombre: </label>
		<input type="text" name="studentName"/>
		<input type="submit"/>
		</form>
	</div>
</body>
</html>