package com.globallogic.pilaresdeprogramacion_5_1;

public class App {
	public static void main(String[] args) {

		Electrodomestico electrodomestico = new Electrodomestico();
		Heladera heladera = new Heladera();

		electrodomestico.setMarca("Drean");
		electrodomestico.setPeso(10.00);
		electrodomestico.setConsumo('c');
		electrodomestico.setColor("white");

		heladera.setMarca("Whirlpool");
		heladera.setPeso(20.00);
		heladera.setConsumo('d');
		heladera.setColor("Black");
		heladera.setCapacidad(20.00);
		heladera.setTieneFreezer(true);
		heladera.setCapacidadFreezer(5.00);

		System.out.println("El electrodomestico es de marca: " + electrodomestico.getMarca() + ", pesa "
				+ electrodomestico.getPeso() + ", consume " + electrodomestico.getConsumo() + ", su color es "
				+ electrodomestico.getColor());
		electrodomestico.encender();
		electrodomestico.apagar();

		System.out.println("La heladera es de marca: " + heladera.getMarca() + ", pesa " + heladera.getPeso()
				+ ", consume " + heladera.getConsumo() + ", su color es " + heladera.getColor()
				+ ", tiene una capadidad de " + heladera.getCapacidad() + ", tiene freezer "
				+ heladera.getTieneFreezer() + ", con capacidad de " + heladera.getCapacidadFreezer());
		heladera.encender();
		heladera.apagar();
	}
}
