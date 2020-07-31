package com.globallogic.pilaresdeprogramacion_5_2;

public class Televisor extends Electrodomestico {

	private double pulgadas;
	private String resolucion;
	
	public void cambiarCanal(int canal) {
		
	}
	
	@Override
	public void encender() {
		System.out.println("Encendiendo televisor");
	}
}
