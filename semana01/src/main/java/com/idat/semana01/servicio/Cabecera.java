package com.idat.semana01.servicio;
import java.util.*;
public class Cabecera {
	private String nroFactura;
	private String fecDocumento;
	private double mtoFactura;
	private List<Detalle>detalle;
	public String getNroFactura() {
		return nroFactura;
	}
	public void setNroFactura(String nroFactura) {
		this.nroFactura = nroFactura;
	}
	public String getFecDocumento() {
		return fecDocumento;
	}
	public void setFecDocumento(String fecDocumento) {
		this.fecDocumento = fecDocumento;
	}
	public double getMtoFactura() {
		return mtoFactura;
	}
	public void setMtoFactura(double mtoFactura) {
		this.mtoFactura = mtoFactura;
	}
	public List<Detalle> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<Detalle> detalle) {
		this.detalle = detalle;
	}
	public Cabecera(String nroFactura, String fecDocumento, double mtoFactura, List<Detalle> detalle) {
		super();
		this.nroFactura = nroFactura;
		this.fecDocumento = fecDocumento;
		this.mtoFactura = mtoFactura;
		this.detalle = detalle;
	}
	public Cabecera() {
		
	}
	
}
