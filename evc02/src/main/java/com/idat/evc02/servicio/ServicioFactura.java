package com.idat.evc02.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class ServicioFactura {
	
	public List<Factura> ListadoFacturas(Cabecera fact) {
		
		List<Factura> list_fact=new ArrayList<Factura>();
		
		for(int i=0;i<fact.getFacturas().size();i++) {
			System.out.println("************************************************");
			System.out.println("Factura N?_"+(i+1)+" :");
			System.out.println("-------");
			System.out.println("# Factura: "+fact.getFacturas().get(i).getNumFac());
			
			System.out.println("C?digo Cliente: "+fact.getFacturas().get(i).getCliente());
			System.out.println("Fecha de venta: "+fact.getFacturas().get(i).getFechaVenta());
			System.out.println("Fecha de vencimiento: "+fact.getFacturas().get(i).getFechaVencimiento());
			System.out.println("Monto Total: "+fact.getFacturas().get(i).getMontoTotal());
			System.out.println("D?as vencidos: "+fact.getFacturas().get(i).NumDiasVencidos());
			System.out.println("Mora: "+fact.getFacturas().get(i).Mora());
			list_fact.add(fact.getFacturas().get(i));
			
			
			
		}
		
		System.out.println("N?mero de item de la cabecera: "+list_fact.size());
		return list_fact;
	}
}
