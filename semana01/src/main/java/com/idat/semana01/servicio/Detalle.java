package com.idat.semana01.servicio;

public class Detalle {
	private String Producto;
	private int Cantidad;
	private double precio;
	public String getProducto() {
		return Producto;
	}
	public void setProducto(String producto) {
		Producto = producto;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Detalle(String producto, int cantidad, double precio) {
		super();
		Producto = producto;
		Cantidad = cantidad;
		this.precio = precio;
	}
	public Detalle() {
		
	}
	
}
