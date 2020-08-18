package hibernate.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CompetidorDao {

	public void createCompetidor(Competidor competidor) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.save(competidor);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.printStackTrace();

		}

	}

	public List<Competidor> getCompetidores() {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			return session.createQuery("from Competidor", Competidor.class).list();

		}

	}

	public List<Competidor> getCompetidores(int numero, String nombreCompetidor) {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			return session.createQuery(
					"from Competidor s where s.numero=:numero and s.nombreCompetidor=:nombreCompetidor"

					, Competidor.class).setParameter("numero", numero).setParameter("nombreCompetidor", nombreCompetidor).list();

		}

	}

	public void updateCompetidor(Competidor competidor) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.update(competidor);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null)

				transaction.rollback();

			e.printStackTrace();

		}

	}

	public void removeCompetidor(Competidor competidor) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.delete(competidor);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null)

				transaction.rollback();

			e.printStackTrace();

		}

	}
}
