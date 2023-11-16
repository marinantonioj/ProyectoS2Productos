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
<title>Búsquedas</title>
</head>
<body>

	<%
	//Iniciamos nuestra base de datos desde la clase "ProductoService"
	ProductoService ps = new ProductoService();
	List<Producto> lp = ps.buscarTodo();
	ProductoService.listaProductos=lp;
	List<Integer> lsecciones = new ArrayList<>();
	Set<Integer> secciones = new HashSet<>();
	//vamos insertando cada seccion al Set, para que no haya repetidos
	for (Producto p : ProductoService.listaProductos) {
		secciones.add(p.getSeccion());
	}
	lsecciones.addAll(secciones);
	//Pasamos el Set a Lista y la ordenamos
	Collections.sort(lsecciones);
	%>

	<h1>Búsqueda por secciones</h1>
	<br>
	<h2>Seleccione una sección del desplegable para que se muestre los
		productos.</h2>
	<br>
	<form action="BusquedasShow" method="post">
		<select name="secciones">
			<%
			for (Integer i : lsecciones) {
			%>
			<option value="<%=i%>"><%=i%></option>
			<%
			}
			%>
		</select> 
		<input type="submit">
	</form>


</body>
</html>