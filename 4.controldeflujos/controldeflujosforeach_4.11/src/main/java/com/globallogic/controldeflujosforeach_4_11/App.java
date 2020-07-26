package com.globallogic.controldeflujosforeach_4_11;

public class App {
    public static void main( String[] args ) {
        
    	String bootcamp = "BootCamp 2020";
    	
    	char[] chars = bootcamp.toCharArray();
    	
    	for(char ch : chars) {
    		System.out.println("Letra: " + ch);
    	}
    }
}
