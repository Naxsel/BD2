package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by naxsel on 18/04/16.
 */
public class TestBanco {

    public static void main(String[] args)
    {
        EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("EjemploDeUnidadDePersistencia");

        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction trans = em.getTransaction();

        trans.begin();


        em.close();
        entityManagerFactory.close();
    }
}
