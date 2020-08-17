package hibernate.menu;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hibernate.example.ExampleApplication;
import hibernate.example.Menu;
import hibernate.example.MenuDao;

public class MenuTest {

	Logger LOGGER = LoggerFactory.getLogger(ExampleApplication.class);
	MenuDao menuDao = new MenuDao();

	@Test
	void MenuCreateTest() {

		menuDao.createMenu(new Menu(0, "Sorrentinos", "Deliciosos sorrentinos a los cuatro quesos", 450.00));
		menuDao.createMenu(new Menu(0, "Hamburguesa completa",
				"Hamburguesa con queso cheddar, lechuga, cebollas caramelizadas y barbacoa.", 650.00));

		List<Menu> menus = menuDao.getMenus();
		LOGGER.info("Todos los : {}", menus);
	}

	@Test
	void MenuGetMenuTest() {

		menuDao.getMenus("Sorrentinos", "Deliciosos sorrentinos a los cuatro quesos", 450.00);

		List<Menu> menus = menuDao.getMenus();
		LOGGER.info("Todos los : {}", menus);
	}

	@Test
	void MenUpdateTest() {

		menuDao.createMenu(new Menu(0, "Sorrentinos", "Deliciosos sorrentinos a los cuatro quesos", 450.00));
			
		List<Menu> menus = menuDao.getMenus();

		Menu menuCorregido = menus.get(0);
		menuCorregido.setPrecio(650.00);
		menuDao.updateMenu(menuCorregido);
		
		LOGGER.info("Menu corregidos: {}", menuDao.getMenus());
	}

	@Test
	void MenuRemoveMenuTest() {

		menuDao.createMenu(new Menu(0, "Hamburguesa completa",
				"Hamburguesa con queso cheddar, lechuga, cebollas caramelizadas y barbacoa.", 650.00));
		
        menuDao.removeMenu(menuDao.getMenus("Hamburguesa completa","Hamburguesa con queso cheddar, lechuga, cebollas caramelizadas y barbacoa.", 650.00).get(1));
        LOGGER.info("Todos los: {}",menuDao.getMenus());
      
	}
}
