package com.globallogic.patrones5;


public class App {
	
	public static void main(String[] args) {
		
		Playstation playstation = new Playstation(new Game("Resident Evil"));
		
		System.out.println(playstation.askMyName());
		
		playstation.setVideogame(new Game("Brawlhalla"));
		
		System.out.println(playstation.askMyName());
		
		playstation.setVideogame(new Game(null));

		System.out.println(playstation.askMyName());

		
	}
}
