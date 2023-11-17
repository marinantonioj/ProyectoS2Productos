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
		<input type="text" name="nombre"><br>
		<label>Sección</label>
		<input type="number" name="seccion"><br>
		<label>Precio</label>
		<input type="number" name="precio"><br>
		<label>Stock</label>
		<input type="number" name="stock"><br><br>
		<input type="submit">
	</form>
</body>
</html>