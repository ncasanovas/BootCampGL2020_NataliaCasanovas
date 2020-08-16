package com.globallogic.patrones2;

public class Currency {
	
	 private String name;
	 private static Currency instance = new Currency();
	 
	 private Currency() {
		  this.name = "ARS";
	 }
	 
	 public static Currency getInstance() {
		 return instance;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
}
