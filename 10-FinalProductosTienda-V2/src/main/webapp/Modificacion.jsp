<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modificación</title>
</head>
<body>

	<h1>Modificar un producto</h1>
	<br>
	<h2>Rellene los campos y pulse enviar para modificar el precio del producto.</h2>
	<br>
	<form action="ModificacionShow" method="post">
		<label>Nombre del producto que desea modificar</label>
		<input type="text" name="nombre"><br>
		<label>Nuevo precio del producto</label>
		<input type="number" name="precio"><br><br>
		<input type="submit">
	</form>
</body>
</html>