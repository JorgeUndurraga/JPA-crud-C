<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.latam.JPAcrud.modelo.Usuario"%>
<%@page import="com.latam.JPAcrud.vo.UsuarioVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP crud</title>
</head>
<body>

	<h1>EDITAR USUARIO</h1>
	<h3>${mensaje}</h3>
	<form action="editar" method="post">
		<table>
			<tr>
				<td>Nombre:</td>
				<td><input class="form-control" type="text" name="nombre"
					placeholder="Nombre" value="${VO.getNombre()}" /></td>
			</tr>
			<tr>
				<td>Clave:</td>
				<td><input class="form-control" type="password"
					placeholder="Contraseña" name="clave" value="${VO.getClave()}" /></td>
			</tr>
			<tr>
				<td>Rut:</td>
				<td><input class="form-control" type="number" placeholder="Rut"
					name="rut" maxlength="99999999" value="${VO.getRut()}" /></td>
				<td>-</td>
				<td><input type="text" size="1" step="1" class="form-control"
					name="dv" value="${VO.getDv()}" maxlength="1" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Agregar" /></td>
			</tr>
		</table>
	</form>


</body>
</html>