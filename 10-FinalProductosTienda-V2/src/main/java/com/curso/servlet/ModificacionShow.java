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
 * Servlet implementation class ModificacionShow
 */
public class ModificacionShow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"es\">");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Modificación del producto</title>");
		out.println("</head>");
		out.println("<body>");

		// obtenemos el nombre y nuevo precio del producto a modificar
		String nombre = request.getParameter("nombre");
		double precio = Double.parseDouble(request.getParameter("precio"));

		// si existe en la lista, lo modificamos
		boolean existe = false;
		for(Producto p:ProductoService.listaProductos) {
			if(p.getNombre().equals(nombre)) {
				p.setPrecio(precio);
				existe = true;
			}
		}

		// Control de errores: Si sale bien, modificamos el producto. En caso contrario
		// mostramos mensaje de que no ha sido posible
		if (existe == true) {
			out.println("<p>Producto modificado. Esta es la lista con todos los productos y sus precios:</p>");
			out.println("<table border=\"1\">");
			out.println("<tr>");
			out.println("<th>");
			out.println("Nombre del producto");
			out.println("</th>");
			out.println("<th>");
			out.println("Precio");
			out.println("</th>");
			out.println("</tr>");
			for (Producto prod : ProductoService.listaProductos) {
				out.println("<tr>");
				out.println("<td>");
				out.println(prod.getNombre());
				out.println("</td>");
				out.println("<td>");
				out.println(prod.getPrecio());
				out.println("</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} else {
			out.println("<p>El producto no se ha podido modificar ya que no existe.</p>");
		}

		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
