<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Altas</title>
</head>
<body>

	<h1>Eliminar un producto</h1>
	<br>
	<h2>Rellene el campo y pulse enviar para eliminar el producto.</h2>
	<br>
	<form action="EliminacionShow" method="post">
		<label>Nombre del producto que desea eliminar</label>
		<input type="text" name="nombre"><br><br>
		<input type="submit">
	</form>
</body>
</html>