package com.idat.evc02.servicio;

import java.util.List;

public class Cabecera {

	private List<Factura> facturas;

	public Cabecera(List<Factura> facturas) {
		
		this.facturas = facturas;
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public Cabecera() {
		super();
	}
}
