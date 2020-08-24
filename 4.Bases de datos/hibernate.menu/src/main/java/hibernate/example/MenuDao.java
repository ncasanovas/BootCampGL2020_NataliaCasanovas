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

	public List<Menu> getMenu() {
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			return session.createQuery("from Menu", Menu.class).list();
		}
	}
	
	public List<Plato> getPlato(String nombre) {
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			return session.createQuery("from Plato s where s.nombre=:nombre", Plato.class)
					.setParameter("nombre", nombre).list();
		}
	}

	public void updateMenu(Menu menu) {
		Transaction transaction = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.update(menu);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void removePlato(Plato plato) {
		Transaction transaction = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.delete(plato);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
