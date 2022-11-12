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
		<h1>Bienvenid@ ${param.studentName}</h1>
		
		<!-- 		Manipulacion de modelo en la clase "inicioController" -->
		<p>${respuestaModelo}</p>
		
		<br>
		<br>
								<!-- Obtener la raiz de nuestro sitio web (WEBAPP)-->
		<img alt="Cat Image" src="${pageContext.request.contextPath}/resources/img/logo.png">
	</div>
</body>
</html>