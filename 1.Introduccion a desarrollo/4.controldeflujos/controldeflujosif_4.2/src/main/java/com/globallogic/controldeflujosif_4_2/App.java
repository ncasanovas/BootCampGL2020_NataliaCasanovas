package com.globallogic.controldeflujosif_4_2;

import java.util.Scanner;

public class App {
	
    public static void main( String[] args ) {
    	
       
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.println("Ingrese la letra A");
    	char letraUno = entrada.next().charAt(0);
    	

    	if(Character.isUpperCase(letraUno)) {
    		System.out.println("Es una letra mayuscula");
    	} else {
    		System.out.println("No es una letra mayuscula");

    	}
    	
    	System.out.println("Ingrese la letra b");
    	char letraDos = entrada.next().charAt(0);
    	
    	
    	if(Character.isUpperCase(letraDos)) {
    		System.out.println("Es una letra mayuscula");
    	} else {
    		System.out.println("No es una letra mayuscula");

    	}
    	
    	
        
    }
}
