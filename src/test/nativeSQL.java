package test;

import parte2.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by naxsel on 5/05/16.
 */
public class nativeSQL {

    public static EntityManagerFactory entityManagerFactory;
    public static EntityManager em;

    public static void main(String[] args) {
        entityManagerFactory = Persistence.createEntityManagerFactory("EjemploDeUnidadDePersistencia");
        em = entityManagerFactory.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        em.
        trans.begin();
        consulta1("31168350Y");

        Query q = em.createNativeQuery("Consulta");
        List<Object[]> cosa = q.getResultList();

        for (Object[] a : cosa) {
            System.out.println();
        }
    }

    /**
     * Para un dni devuelve la cuenta asociada (si existe) que más numero de operaciones tiene
     * @param dni
     */
    private static void consulta1(String dni) {
        Query q = em.createNativeQuery("SELECT * FROM Cuenta_P1 C INNER JOIN Tiene_P1 T ON C.iban = T.iban ");
        List<Cuenta> cuentas = q.getResultList();

        for (Cuenta c: cuentas) {
            c.toString();
        }

    }

}
