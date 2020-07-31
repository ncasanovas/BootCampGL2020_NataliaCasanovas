package com.globallogic.pilaresdeprogramacion_5_2;

import java.util.ArrayList;

public class App {
    public static void main( String[] args ) {
    	
        Heladera heladera = new Heladera();
        Cafetera cafetera = new Cafetera();
        Televisor televisor = new Televisor();
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
        electrodomesticos.add(heladera);
        electrodomesticos.add(cafetera);
        electrodomesticos.add(televisor);

        for (Electrodomestico e : electrodomesticos) {
             e.encender();
          }
        
        
    	
    }
}
