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
 * Servlet implementation class EliminacionShow
 */
public class EliminacionShow extends HttpServlet {
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
		out.println("<title>Eliminación del producto</title>");
		out.println("</head>");
		out.println("<body>");

		// obtenemos el nombre del producto a eliminar por parametro
		String nombre = request.getParameter("nombre");

		// si existe en la lista, lo eliminamos
		boolean eliminado = ProductoService.listaProductos.removeIf(p -> p.getNombre().equals(nombre));

		// Control de errores: Si sale bien eliminamos el producto. En caso contrario
		// mostramos mensaje de que no ha sido posible
		if (eliminado == true) {
			out.println("<p>Producto eliminado. Esta es la lista con todos los productos:</p>");
			out.println("<ol>");
			for (Producto prod : ProductoService.listaProductos) {
				out.println("<li>" + prod.getNombre() + "</li>");
			}
			out.println("<ol>");
		} else {
			out.println("<p>El producto no se ha podido eliminar.</p>");
		}

		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
