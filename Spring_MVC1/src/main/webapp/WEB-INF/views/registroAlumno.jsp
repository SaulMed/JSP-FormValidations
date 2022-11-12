<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro Alumno</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css">
</head>

<body>								
	<div class="container">
		<h2>Formulario Alumno</h2>
											<!-- Nombre del Modelo -->
		<form:form action="processForm" modelAttribute="student">
					<!-- Path = Nombre de metodo Get/Set -->
			Nombre: <form:input path="nombre"/>		<form:errors path="nombre" style="color:red;"/>
			<br/>
			Apellido: <form:input path="app"/>		<form:errors path="app" style="color:red;"/>
			<br/>
			Edad: <form:input path="edad" value="0"/>		<form:errors path="edad" style="color:red;"/>
			<br/>
			Email: <form:input path="email"/>		<form:errors path="email" style="color:red;"/>
			<br/>
			Telefono: <form:input path="telefono" type="number"/>		<form:errors path="telefono" style="color:red;"/>
			<br/>
			C.P <form:input path="codigoPostal"/>		<form:errors path="codigoPostal" style="color:red;"/>
			<br>
			Materia Opcional:  
			<br/>
			<form:select path="opcional" multiple="true">
				<form:option value="Geometria" label="Geometria"/>
				<form:option value="Diseño" lable="Diseño"/>
				<form:option value="Comercio" label="Comercio"/>
				<form:option value="Principios de POO" labe="Pricipios de POO"/>
			</form:select> 
			<br/>
			Forma de Titulacion:
			<br/>
				Promedio<form:radiobutton path="titulacion" value="Promedio"/>
			<br/>
				Exposicion de Proyecto<form:radiobutton path="titulacion" value="Exposicion"/>
			<br/>
				Tesis<form:radiobutton path="titulacion" value="Titulacion"/>
			<br/>
			Idiomas que domina:
			<br/>
				Español<form:checkbox path="idioma" value="Español"/>
			<br/>
				Aleman<form:checkbox path="idioma" value="Aleman"/>
			<br/>
				Frances<form:checkbox path="idioma" value="Frances"/>
			<br/>
				Japones<form:checkbox path="idioma" value="Japones"/>
			<br/>
				Ingles<form:checkbox path="idioma" value="Ingles"/>
			<br/>
			<input type="submit" value="Enviar"/>
		</form:form>
	</div>
</body>
</html>