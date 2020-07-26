package com.globallogic.estructurasbasicas_3_4;

import java.util.Scanner;

public class App {
	
    public static void main( String[] args ) {
        
    	StudentDetails estudiante = new StudentDetails();
    	
    	estudiante.studentAge();    	
    	
    	
    	int numero = 0;
    	    
    	
    	System.out.println("Ingrese su edad");
    	
    	Scanner entrada = new Scanner(System.in);
    	
    	numero = entrada.nextInt();
    	
    	StudentDetails estudiante2 = new StudentDetails();
    	
    	estudiante2.studentAge2(numero);
    	
    	
    	
    }
}
