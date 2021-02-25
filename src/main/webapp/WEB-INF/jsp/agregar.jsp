<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.latam.JPAcrud.modelo.Usuario"%>
<%@page import="com.latam.JPAcrud.vo.UsuarioVO"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>JSP crud</title>
</head>

<body>
	<h1>AGREGAR USUARIO</h1>
	<h3>${mensaje}</h3>
	<form action="agregar" method="post">
		<table>
			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="nombre" /></td>
			</tr>
			<tr>
				<td>Clave:</td>
				<td><input type="password" name="clave" /></td>
			</tr>
			<tr>
				<td>Rut:</td>
				<td><input type="number" name="rut" />-<input type="text"
					step="1" size="1" maxlength="1" name="dv" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Agregar" /></td>
			</tr>
		</table>
	</form>

</body>
</html>