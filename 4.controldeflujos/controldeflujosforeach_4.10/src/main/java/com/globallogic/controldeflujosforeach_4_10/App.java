package com.globallogic.controldeflujosforeach_4_10;

public class App {
	public static void main(String[] args) {

		String[] stringArray = new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado",
				"Domingo" };

		for (String dia : stringArray) {
			System.out.println("Dia de la semana: " + dia);
		}

	}
}
