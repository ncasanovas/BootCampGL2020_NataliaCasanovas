package com.globallogic.interfaces_7_2;

public interface Animal {

	public void dormir();
	
	public void sonidoAnimal();

	default void Come(String s) {
		System.out.println("El " + s + " se alimenta");
	}
	
	static void camina(String s) {
		System.out.println("El " + s + " camina");

	}
}

