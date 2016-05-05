package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by naxsel on 5/05/16.
 */
public class CriteriaAPI {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EjemploDeUnidadDePersistencia");
        EntityManager em = entityManagerFactory.createEntityManager();
    }
}
