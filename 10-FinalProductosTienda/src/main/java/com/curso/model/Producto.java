package com.curso.model;

/**
 * 
 * @author Admin
 * @version 1.0.0 
 * Clase Producto. Atributos: nombre, sección, precio y stock.
 */
public class Producto {
	private String nombre;
	private int seccion;
	private double precio;
	private int stock;

	/**
	 * Constructor vacío
	 */
	public Producto() {
		super();
	}

	/**
	 * Constructor general
	 */
	public Producto(String nombre, int seccion, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.seccion = seccion;
		this.precio = precio;
		this.stock = stock;
	}

	/**
	 * A partir de aquí, tenemos los getters y setters
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
