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
<title>Creación base de datos</title>
</head>
<body>

	<%
	//Iniciamos nuestra base de datos desde la clase "ProductoService"
	ProductoService ps = new ProductoService();
	List<Producto> lp = ps.buscarTodo();
	ProductoService.listaProductos = lp;
	%>

	<h1>Base de datos creada</h1>

</body>
</html>