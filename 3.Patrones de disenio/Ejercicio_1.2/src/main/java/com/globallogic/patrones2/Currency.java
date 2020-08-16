package com.globallogic.patrones2;

public class Currency {
	
	 private String name;
	 Currency instance = new Currency();
	 
	 private Currency() {
		  this.name = "ARS";
	 }
	 
	 public Currency getInstance() {
		 return instance;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
}
