package com.globallogic.pilaresdeprogramacion_5_3;

public class App {
	
    public static void main( String[] args ) {
       
    	Gato gato = new Gato();
    	
    	gato.setNombre("Pepito");
    	gato.setPatas(4);
    	
    	System.out.println(gato.getNombre() + " tiene " + gato.getPatas() +" patas");
    }
}
