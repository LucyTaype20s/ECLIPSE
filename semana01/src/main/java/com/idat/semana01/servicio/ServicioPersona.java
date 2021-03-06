package com.idat.semana01.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;


//los m?todos ser?n del servicio web
@WebService
public class ServicioPersona {
	public String saludar(String nombre) {
		return "Hola "+nombre+" !";
	}
	public List<Persona> listarPersona(){
		List<Persona>lista=new ArrayList<Persona>();
		lista.add(new Persona(1,"Ronald","Donayre"));
		lista.add(new Persona(2,"Luisa","Perez"));
		lista.add(new Persona(3,"Winston","Arcos"));
		lista.add(new Persona(4,"Melissa","Teran"));
			return lista;
	}
	public Persona registrar(Persona personaNueva) {
		personaNueva.setNombre(personaNueva.getNombre()+" - Registrado");
		personaNueva.setApellido(personaNueva.getApellido()+" - Registrado");
		return personaNueva;
	}
	
	//retornr? un msj
	public String procesarFactura(Cabecera datos) {
		System.out.println("Datos Factura");
		System.out.println("N?mero: "+datos.getNroFactura());
		System.out.println("Fecha: "+ datos.getFecDocumento());
		System.out.println("Monto: "+datos.getMtoFactura());
		for(int i=0;i<datos.getDetalle().size();i++) {
			System.out.println("****************************************************************");
			System.out.println(datos.getDetalle().get(i).getProducto());
			System.out.println(datos.getDetalle().get(i).getCantidad());
			System.out.println(datos.getDetalle().get(i).getPrecio());
		}
		return "Datos Procesados";
	}
}
