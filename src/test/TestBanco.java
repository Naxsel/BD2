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

//        Cliente cliente = new Cliente();
//        cliente.setNombre("Juan");
//        cliente.setApellidos("Lolo Lulo");
//        cliente.setTipoCliente("BUENO");
//        cliente.getDireccion().setCalle("Perico de los Palotes, 12");
//        cliente.getDireccion().setPiso("5D");
//        cliente.getDireccion().setCiudad("Zaragoza");
//        cliente.getDireccion().setCodPostal("50018");
//        System.out.println("Funciona");
//        em.persist(cliente);
//        trans.commit();

        em.close();
        entityManagerFactory.close();
    }
}
