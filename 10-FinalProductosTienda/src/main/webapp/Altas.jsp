<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<form action="AltasShow" method="post">
		<label>Nombre</label>
		<input type="text" name="nombre">
		<label>Sección</label>
		<input type="number" name="seccion">
		<label>Precio</label>
		<input type="number" name="precio">
		<label>Stock</label>
		<input type="number" name="stock">
		<input type="submit">
	</form>
</body>
</html>