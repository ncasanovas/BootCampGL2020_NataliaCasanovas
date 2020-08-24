package hibernate.example;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ExampleApplication {

	private static Logger LOGGER= LoggerFactory.getLogger(ExampleApplication.class);
	
	public static void main(String[] args) {
		
		MenuDao menuDao = new MenuDao();

        Menu menu = new Menu();
        menu.setNombre("Menu Almuerzo");
		List<Plato> platoList = new ArrayList<>();
		Plato plato1 = new Plato(0, "Milanesa Clasica", "Una delicada milanesa con crocantes papas fritas finamente seleccionadas", 500.00, menu);
        Plato plato2 = new Plato(0, "Lomo a la piedra", "Un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el\r\n" + 
        		"lomo junto a especias orientales y sudamericanas logrando un elixir entre la textura y el sabor.", 750.00, menu);
		
        platoList.add(plato1);
        platoList.add(plato2);
        menu.setPlatos(platoList);
		menuDao.createMenu(menu);
        
		List<Menu> menuList = menuDao.getMenu();
		LOGGER.info("Todos los Menus: {}", menuList);
  
		
	/*	// Menu 1
		Menu menu = new Menu();
		menu.setNombre("Menu ejecutivo");
		List<Plato> platoList = new ArrayList<>();
		Plato plato = new Plato(0, "Milanesa Clasica",
				"una delicada milanesa con crocantes papas fritas finamente seleccionada", 500.00, menu);
		Plato plato2 = new Plato(0, "Lomo al piedra",
				"un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el lomo junto a especias orientales y sudamericanas logrando un elixir entre la textura y el sabora",
				750.00, menu);
		Plato plato3 = new Plato(0, "Espagueti con verduras", "un plato saludable que combina las pastas con verduras",
				1500.00, menu);
		platoList.add(plato);
		platoList.add(plato2);
		platoList.add(plato3);
		menu.setPlatos(platoList);
		menuDao.createMenu(menu);*/
    }
}
