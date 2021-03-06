package com.idat.evc02.servicio;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Factura {
	private String NumFac;
	private String Cliente;
	private String FechaVenta;
	private String FechaVencimiento;
	private double MontoTotal;
	
	
	public int DiasVencidos() {
		
		int[] list_fVenta=DDMMYYY(FechaVenta);
		int[]list_fVencimiento=DDMMYYY(FechaVencimiento);
		
		Calendar venta=Calendar.getInstance();
		venta.set(list_fVenta[2],list_fVenta[1],list_fVenta[0]);
		venta.set(Calendar.HOUR, 0);
		venta.set(Calendar.HOUR_OF_DAY, 0);
		venta.set(Calendar.MINUTE, 0);
		venta.set(Calendar.SECOND, 0);
		
		Calendar vencimiento=Calendar.getInstance();
		vencimiento.set(list_fVencimiento[2],list_fVencimiento[1],list_fVencimiento[0]);
		vencimiento.set(Calendar.HOUR, 0);
		vencimiento.set(Calendar.HOUR_OF_DAY, 0);
		vencimiento.set(Calendar.MINUTE, 0);
		vencimiento.set(Calendar.SECOND, 0);
		
		long finMS = vencimiento.getTimeInMillis();
		long inicioMS=venta.getTimeInMillis();
		
		int dias=(int)((Math.abs(finMS-inicioMS))/(1000*60*60*24));
		return dias;
	}
	
	public int NumDiasVencidos() {
		int dias_vencidos=0;
		int[] list_fVenta=DDMMYYY(FechaVenta);
		int[]list_fVencimiento=DDMMYYY(FechaVencimiento);
		Date vencimiento=new Date(list_fVencimiento[2],list_fVencimiento[1],list_fVencimiento[0]);
		Date venta=new Date(list_fVenta[2],list_fVenta[1],list_fVenta[0]);
		if(venta.after(vencimiento)) {
			dias_vencidos=DiasVencidos();
		}
		return dias_vencidos;
	}
	
	
	
	public double Mora() {
		double cant_mora=0;
		int[] list_fVenta=DDMMYYY(FechaVenta);
		int[]list_fVencimiento=DDMMYYY(FechaVencimiento);
		Date vencimiento=new Date(list_fVencimiento[2],list_fVencimiento[1],list_fVencimiento[0]);
		Date venta=new Date(list_fVenta[2],list_fVenta[1],list_fVenta[0]);
		if(venta.after(vencimiento)) {
			cant_mora=DiasVencidos()*0.1;
		}
		return cant_mora;
	}
	
	
	public String getNumFac() {
		return NumFac;
	}
	public void setNumFac(String numFac) {
		NumFac = numFac;
	}
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String cliente) {
		Cliente = cliente;
	}
	public String getFechaVenta() {
		return FechaVenta;
	}
	public void setFechaVenta(String fechaVenta) {
		FechaVenta = fechaVenta;
	}
	public String getFechaVencimiento() {
		return FechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}
	public double getMontoTotal() {
		return MontoTotal;
	}
	public void setMontoTotal(double montoTotal) {
		MontoTotal = montoTotal;
	}
	public Factura(String numFac, String cliente, String fechaVenta, String fechaVencimiento, double montoTotal) {
		super();
		NumFac = numFac;
		Cliente = cliente;
		FechaVenta = fechaVenta;
		FechaVencimiento = fechaVencimiento;
		MontoTotal = montoTotal;
	}
	public Factura() {
		
	}
	
	private int[] DDMMYYY(String _fecha) {
		
		String[] fecha= _fecha.split("/");
		int[] items_fecha= {Integer.parseInt(fecha[0]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[2])};
		
		return items_fecha;
		
		
		
		
	}
	
}
