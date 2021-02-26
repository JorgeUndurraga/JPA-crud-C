<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.latam.JPAcrud.modelo.Usuario"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>JSP crud</title>
</head>

<body>

	<h1>Iniciar sesión</h1>
	<h3>${mensaje}</h3>
	<br>
	<form action="handleLogin" method="POST">
		<input type="text" name="nombre" placeholder="Nombre de usuario">
		<input type="password" name="clave" placeholder="Contraseña">
		<input type="submit" name="btnEnviar" value="Enviar">
	</form>

</body>
</html>