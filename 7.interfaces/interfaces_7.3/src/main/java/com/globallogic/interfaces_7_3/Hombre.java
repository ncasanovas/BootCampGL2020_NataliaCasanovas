package com.globallogic.interfaces_7_3;

public class Hombre implements Animal, Persona {

	@Override
	public void hablar() {
		
		System.out.println("Las personas hablan mucho");
		
	}

	@Override
	public void dormir() {

		System.out.println("El hombre duerme muchas horas");
		
	}

	@Override
	public void sonido() {

		System.out.println("El hombre no hace sonidos de animal");

	}
	
	public void metodoHombre() {

		System.out.println("Se ejecuta metodo de la clase hombre");

	}

}
