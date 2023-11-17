package com.curso.service;

import java.util.ArrayList;
import java.util.List;
import com.curso.model.Producto;

/**
 * 
 * @author Admin
 * @version 1.0.0
 * En esta clase crearemos nuestra "base de datos" de productos. En listaProductos están todos los productos que hemos creado.
 */
public class ProductoService {
	public static List<Producto> listaProductos = new ArrayList<>();
	
	public List<Producto> buscarTodo(){
		Producto p1 = new Producto("pan", 1, 0.2, 30);
		Producto p2 = new Producto("leche", 1, 0.90, 20);
		Producto p3 = new Producto("detergente", 2, 3.3, 5);
		Producto p4 = new Producto("agua", 3, 0.6, 50);
		Producto p5 = new Producto("patatas", 3, 0.5, 15);
		Producto p6 = new Producto("papel", 3, 1.20, 40);
		
		List<Producto> lp = new ArrayList<>();
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
		lp.add(p4);
		lp.add(p5);
		lp.add(p6);
		
		return lp;
	}
}
