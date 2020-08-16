package com.globallogic.patrones2;

public class Product {

	private String name;
	private static Product instance = new Product();

	Product() {
		this.name = "Clavos";
	}

	public static Product getInstance() {
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
