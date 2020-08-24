package hibernate.menu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hibernate.example.Menu;
import hibernate.example.Plato;


public class MenuTest {


	private Menu menu;
	private static final String NOMBRE = "Milanesa";
	private static final String DESCRIPCION = "Plato milanesa";
	private static final Double PRECIO = 22.2;
	private static final int ID = 0;
	private List<Plato> platos;
	private Plato plato;

	@BeforeEach
	void setUp() {
		this.platos = new ArrayList<>();
		this.plato = new Plato(ID, NOMBRE, DESCRIPCION, PRECIO, null);
		platos.add(plato);
		this.menu = new Menu(ID, NOMBRE, platos);
	}
	
	@Test
	void getterSetterIDTest( ) {
		
		menu.setId(ID);
		assertEquals(ID, menu.getId());
		
	}
	
	@Test
	void getterSetterNombreTest( ) {
		
		menu.setNombre(NOMBRE);
		assertEquals(NOMBRE, menu.getNombre());
		
	}
	
	@Test
	void getterSetterPlatosTest( ) {
		
		menu.setPlatos(platos);;
		assertEquals(platos, menu.getPlatos());
		
	}

	@Test
	public void toStringTest() {
		String expected = "Menu [id=0, nombre=Milanesa, platos=[Plato [id=0, nombre=Milanesa, descripcion=Plato milanesa, precio=22.2]]]";
		String string = menu.toString();
		assertEquals(expected, string);
	}
}
