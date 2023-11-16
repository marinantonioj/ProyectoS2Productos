<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.curso.service.ProductoService"%>
<%@ page import="com.curso.model.Producto"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.HashSet"%>
<%@ page import="java.util.Set"%>
<%@ page import="java.util.Collections"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Altas</title>
</head>
<body>

	<h1>Dar de alta un nuevo producto</h1>
	<br>
	<h2>Rellene los campos y pulse enviar para agregar un nuevo producto.</h2>
	<br>
	<form action="EliminacionShow" method="post">
		<label>Nombre del producto que desea eliminar</label>
		<input type="text" name="nombre">
		<input type="submit">
	</form>
</body>
</html>