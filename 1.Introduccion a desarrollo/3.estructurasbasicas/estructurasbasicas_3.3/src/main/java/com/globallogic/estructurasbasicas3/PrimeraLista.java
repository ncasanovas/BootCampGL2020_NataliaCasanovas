package com.globallogic.estructurasbasicas3;

import java.util.ArrayList;

public class PrimeraLista {

	public static void main(String[] args) {
		
		ArrayList<String> letters = new ArrayList<String>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		
		System.out.println(letters);
		System.out.println(letters.size());
		
		letters.add(0, "X");
		
		
		System.out.println(letters);
	}

}
