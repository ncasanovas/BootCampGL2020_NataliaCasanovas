package com.globallogic.patrones5;

public class Playstation {

	private Game videogame;

	public Playstation(Game videogame) {

		this.videogame = videogame;
	}

	public void setVideogame(Game videogame) {
		this.videogame = videogame;
	}

	public String askMyName() {
		if (videogame != null) {

			return "El videojuego que estoy corriendo es: " + videogame.getTitle();

		} else {

			return "¡Estoy vacío!";
		}

	}
}
