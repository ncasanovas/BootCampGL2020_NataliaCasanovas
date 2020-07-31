package com.globallogic.excepciones_8_1;

public class App {

	public static void main(String[] args) throws Exception {
		
		try{
			throw new Exception("Se produjo una excepcion: Esto es una Excepción");
		} catch (Exception e ) {
			System.out.println(e);
		} finally {
			System.out.println("Esto se ejecuta sin importar si se presentan errores");
		}
	}
}
