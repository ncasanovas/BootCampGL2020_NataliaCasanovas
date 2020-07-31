package com.globallogic.excepciones_8_2;

public class App {

	public static void main(String[] args) {

		Animal animal = null;
		
		try {
			animal.comer("Pepito");

		} catch (Exception e) {

			System.out.println("Se produjo una excepción. null");

		}

	}
}
