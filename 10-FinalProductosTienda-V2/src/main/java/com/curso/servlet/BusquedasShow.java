package com.curso.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.curso.model.Producto;
import com.curso.service.ProductoService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BusquedasMuestra
 */
public class BusquedasShow extends HttpServlet {
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
		out.println("<title>Productos por sección</title>");
		out.println("</head>");
		out.println("<body>");
		ProductoService ps = new ProductoService();
		List<Producto> listaProductos = ps.buscarTodo();
		out.println("<p>Estos son los productos de la sección " + request.getParameter("secciones") + ":</p>");
		out.println("<ul>");
		for(Producto p:listaProductos) {
			if(p.getSeccion()==Integer.parseInt(request.getParameter("secciones"))) {
				out.println("<li>" + p.getNombre() + "</li>");
			}
		}
		out.println("<ul>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
