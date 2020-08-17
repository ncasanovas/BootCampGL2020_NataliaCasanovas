package hibernate.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MenuDao {

	public void createMenu(Menu menu) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.save(menu);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.printStackTrace();

		}

	}

	public List<Menu> getMenus() {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			return session.createQuery("from Menu", Menu.class).list();

		}

	}

	public List<Menu> getMenus(String nombre, String descripcion, double precio) {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			return session.createQuery("from Menu s where s.nombre=:nombre and s.descripcion=:descripcion and s.precio=:precio"

					, Menu.class).setParameter("nombre", nombre).setParameter("descripcion", descripcion).setParameter("precio", precio).list();

		}

	}

	public void updateMenu(Menu menu) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.update(menu);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null)

				transaction.rollback();

			e.printStackTrace();

		}

	}

	public void removeMenu(Menu menu) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.delete(menu);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null)

				transaction.rollback();

			e.printStackTrace();

		}

	}
}
