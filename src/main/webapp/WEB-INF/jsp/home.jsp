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
	<h1>JSP CRUD</h1>
	<h3>${mensaje}</h3>
	<a href="agregarForm">Agregar usuario</a>
	<br style="margin-top: 15px" />
	<table border="1" width="90%">
		<tr>
			<th>IdUsuario</th>
			<th>Nombre</th>
			<th>Clave</th>
			<th>Rut</th>
			<th>Acciones</th>
		</tr>
		<c:forEach items="${VO.usuarios}" var="u">
			<tr>
				<td>${u.getIdUsuario()}</td>
				<td>${u.getNombre()}</td>
				<td>${u.getClave()}</td>
				<td>${u.getRut()}-${u.getDv()}</td>
				<td><a href="editarForm?idUsuario=${u.getIdUsuario()}">Editar</a>
					<br /> <a href="eliminar?idUsuario=${u.getIdUsuario()}">Eliminar</a>
				</td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>