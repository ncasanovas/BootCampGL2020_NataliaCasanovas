package com.globallogic.excepciones_8_4;

class MiExcepcion extends Exception {

	String mensaje;
	
	public MiExcepcion(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		
		return "Class MiExcepcion " + mensaje;
	}

}
