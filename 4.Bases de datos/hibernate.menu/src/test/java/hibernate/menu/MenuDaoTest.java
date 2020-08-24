package hibernate.menu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import hibernate.example.Menu;
import hibernate.example.MenuDao;
import hibernate.example.Plato;


@ExtendWith(MockitoExtension.class)
class MenuDaoTest {

	@InjectMocks
	private MenuDao menuDao;
	
	@Mock
	private Session sesion;
	private Menu menu;
	private static final String NOMBRE = "Milenasa";
	private static final String DESCRIPCION = "Plato milanesa";
	private static final Double PRECIO = 22.2;
	private static final int ID = 0;
	private List<Plato> platos;
	private List<Plato> expected;

	private Plato plato;

	@BeforeEach
	void setUp() {
		this.platos = new ArrayList<>();
		this.plato = new Plato(ID, NOMBRE, DESCRIPCION, PRECIO, null);
		platos.add(plato);
		this.menu = new Menu(ID, NOMBRE, platos);
		this.expected = new ArrayList<>();
	}
	@Test
	void createMenuTest() {
		menuDao.createMenu(menu);
		assertEquals(NOMBRE, menu.getNombre());
	}

	@Test
	void removeMenuTest() {

		menuDao.removePlato(plato);
		List<Menu> response = menuDao.getMenu();
		assertEquals(expected, response.get(0).getPlatos());
	}

	@Test
	void updateMenuTest() {
		menuDao.createMenu(menu);
		menuDao.updateMenu(menu);
		assertEquals(NOMBRE, menu.getNombre());
	}

	@Test
	void getMenuTest() {

		final List<Plato> response = menuDao.getPlato(NOMBRE);
		assertEquals(NOMBRE, response.get(0).getNombre());
	}
}
