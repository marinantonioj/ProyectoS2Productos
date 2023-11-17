package com.curso.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.curso.model.Producto;
import com.curso.service.ProductoService;

/**
 * Servlet implementation class AltasShow
 */
public class AltasShow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"es\">");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Producto dado de alta</title>");
		out.println("</head>");
		out.println("<body>");

		// obtenemos todos los valores por parametro para agregarlos a la lista
		// "listaProductos". Esta lista hace de nuestra base de datos.
		String nombre = request.getParameter("nombre");
		int seccion = Integer.parseInt(request.getParameter("seccion"));
		double precio = Double.parseDouble(request.getParameter("precio"));
		int stock = Integer.parseInt(request.getParameter("stock"));

		Producto p = new Producto(nombre, seccion, precio, stock);
		ProductoService.listaProductos.add(p);

		out.println("<p>Esta es la lista con todos los productos:</p>");
		out.println("<ol>");
		for (Producto prod : ProductoService.listaProductos) {

			out.println("<li>" + prod.getNombre() + "</li>");

		}
		out.println("<ol>");

		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
