//package test;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
///**
// * Created by naxsel on 5/05/16.
// */
//public class JPQL {
//
//    public static void main(String[] args) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EjemploDeUnidadDePersistencia");
//        EntityManager em = entityManagerFactory.createEntityManager();
//
//        Query query = em.createQuery("consulta");
//        List<tipo> list = query.getResultList();
//
//        for (tipo e : list) {
//            System.out.println(e);
//        }
//    }
//
//
//}
