package com.globallogic.pilaresdeprogramacion_5_1;

public class Electrodomestico {

	private String marca;
	private double peso;
	private char consumo;
	private String color;
	
	public String getMarca() {
		return this.marca;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public char getConsumo() {
		return this.consumo;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void encender() {
		System.out.println("Encendiendo electrodoméstico");
	}
	
	public void apagar() {
		System.out.println("Apagando electrodoméstico");
	}
}
