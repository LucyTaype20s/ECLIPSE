package com.idat.evc02.servicio;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		
		
		Endpoint.publish("http://localhost:8089/ws/factura",new ServicioFactura());
		
		
		
		
		System.out.println("Servicio Factura iniciado");


	}

}
