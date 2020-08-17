package hibernate.example;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleApplication {

	private static Logger LOGGER= LoggerFactory.getLogger(ExampleApplication.class);
	
	public static void main(String[] args) {
		
        MenuDao menuDao = new MenuDao();
        menuDao.createMenu(new Menu(0, "Milanesa Clasica", "Una delicada milanesa con crocantes papas fritas finamente seleccionadas", 500.00));
        menuDao.createMenu(new Menu(0, "Lomo a la piedra", "Un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el\r\n" + 
        		"lomo junto a especias orientales y sudamericanas logrando un elixir entre la textura y el sabor.", 750.00));
 
        List <Menu> menus = menuDao.getMenus();
        LOGGER.info("Todos los : {}",menus);
  
    }
}
