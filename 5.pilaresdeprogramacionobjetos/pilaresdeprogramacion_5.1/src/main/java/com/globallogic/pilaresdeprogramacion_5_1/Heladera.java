package com.globallogic.pilaresdeprogramacion_5_1;

public class Heladera extends Electrodomestico {

	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;
	
	public double getCapacidad() {
		return this.capacidad;
	}
	
	public boolean getTieneFreezer() {
		return this.tieneFreezer;
	}
	
	public double getCapacidadFreezer() {
		return this.capacidadFreezer;
	}
	
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	public void setTieneFreezer(boolean tieneFreezer) {
		this.tieneFreezer = tieneFreezer;
	}
	
	public void setCapacidadFreezer(double capacidadFreezer) {
		this.capacidadFreezer = capacidadFreezer;
	}

	public void guardarElemento(String elemento) {
		System.out.println("Guardando elemento");
	}

	public void extraerElemento(String elemento) {
		System.out.println("Extrayendo elemento");
	}
}
