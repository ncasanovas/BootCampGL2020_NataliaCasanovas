package com.globallogic.clasesyobjetos_6_1;


public abstract class Persona {

	private int edad;
	private String sexo;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void caminar() {

	}

	public void trabajar() {

	}

	public abstract void mostrarDatos();

}
