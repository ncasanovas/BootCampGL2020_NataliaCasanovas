package com.globallogic.excepciones_8_3;

public class App {

	public static void main(String[] args) {

		int intArray[] = new int[5];

		try {
			
			intArray[5] = 10;

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Excepci�n: �ndice de array fuera de l�mites");

		}

	}
}
