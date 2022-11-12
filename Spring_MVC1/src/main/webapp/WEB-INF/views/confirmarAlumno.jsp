<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmacion Registro</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css">
</head>
<body>
	<div class="container">
		El alumno <strong>${student.nombre}</strong> <strong>${student.app}</strong> con <strong>${student.edad}</strong> años de edad y C.P <strong>${student.codigoPostal}</strong> ha sido registrado con exito! <br/>
		<strong>${student.nombre}</strong> ha seleccionado como materia opcional: <strong>${student.opcional}</strong> durante este periodo. <br/>
		<strong>${student.nombre}</strong> se va a titular por <strong>${student.titulacion}</strong> y es buen@ hablando <strong>${student.idioma}</strong> <br/>
		Se puede contactar al alumno a traves del correo: <strong>${student.email}</strong> o al telefono <strong>${student.telefono}</strong>
	</div>
</body>
</html>