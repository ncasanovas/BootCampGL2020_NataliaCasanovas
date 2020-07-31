package com.globallogic.controldeflujosif_4_3;

import java.util.Scanner;

public class App {
	
    public static void main( String[] args ) {
    	
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.println("Ingrese valor de compra");
    	int valor = entrada.nextInt();
    	
    	if(valor == 300) {
    		int descuento = (valor*20)/100;
    		System.out.println("El descuento es de: " + descuento);
    		System.out.println("El total es de : " +  (valor - descuento));

    	} else if (valor > 350 ) {
    		int descuento = (valor*25)/100;
    		System.out.println("El descuento es de: " + descuento);
    		System.out.println("El total es de : " +  (valor - descuento));

    	} else {
    		System.out.println("Sin descuentos, el total es: " + valor);

    	}
    	
    	
    }
}
