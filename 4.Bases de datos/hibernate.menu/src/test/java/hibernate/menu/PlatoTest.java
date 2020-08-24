package hibernate.menu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hibernate.example.Plato;

public class PlatoTest {

	private static final String NOMBRE = "Milanesa";
	private static final String DESCRIPCION = "Plato milanesa";
	private static final Double PRECIO = 22.2;
	private static final int ID = 0;

	private Plato plato;

	@BeforeEach
	void setUp() {
		plato = new Plato(ID, NOMBRE, DESCRIPCION, PRECIO, null);

	}
	
	@Test
	void getterSetterIDTest( ) {
		
		plato.setId(ID);
		assertEquals(ID, plato.getId());
		
	}
	
	@Test
	void getterSetterNombreTest( ) {
		
		plato.setNombre(NOMBRE);
		assertEquals(NOMBRE, plato.getNombre());
		
	}
	
	@Test
	void getterSetterDescripcionTest( ) {
		
		plato.setDescripcion(DESCRIPCION);
		assertEquals(DESCRIPCION, plato.getDescripcion());
		
	}
	
	@Test
	void getterSetterPrecioTest( ) {
		
		plato.setPrecio(PRECIO);
		assertEquals(PRECIO, plato.getPrecio());
		
	}
	
	@Test
	void getterSetterIdMenuTest( ) {
		
		plato.setId(ID);
		assertEquals(ID, plato.getId());
		
	}

	@Test
	public void toStringTest() {
		String expected = "Plato [id=0, nombre=Milanesa, descripcion=Plato milanesa, precio=22.2]";
		String string = plato.toString();
		assertEquals(expected, string);
	}

}
