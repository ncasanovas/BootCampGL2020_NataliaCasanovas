package com.globallogic.excepciones_8_4;

public class PropiaClaseExcepcion {

	public static void main(String[] args) {
		

		try {

			throw new MiExcepcion("Mi propia Excepción");
			

		} catch (MiExcepcion e) {

			System.out.println("Error: " + e.getMensaje());
		}

	}
}