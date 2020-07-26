package com.globallogic.controldeflujosfor_4_5;

public class App 
{
    public static void main( String[] args ) {
        
    	int contador = 0;
    	for(int i = 0; i<=10000; i++) {
    		if(i % 20 == 0) {
    			 contador++;
    		}
    	} 
    	
    	System.out.println("El valor del contador es: " + contador);
    }
}
