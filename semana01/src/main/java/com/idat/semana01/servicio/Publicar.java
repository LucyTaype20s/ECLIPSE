package com.idat.semana01.servicio;

import javax.xml.ws.Endpoint;

public class Publicar {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8088/ws/persona",new ServicioPersona());
		System.out.println("Servicio persona iniciado");

	}

}
