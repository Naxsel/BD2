package test;

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
        trans.begin();

        System.out.println("Consultas SQL nativo");
        consulta1("31168350Y");
        System.out.println();
        consulta2(1986);
    }

    /**
     * Para un dni devuelve la cuenta asociada (si existe) que más numero de operaciones tiene
     * @param dni
     */
    private static void consulta1(String dni) {
        System.out.println("Para un dni devuelve la cuenta asociada (si existe) que más numero de operaciones tiene");
        Query q = em.createNativeQuery("SELECT C.*, O.contador FROM Cuenta_P1 C INNER JOIN Operacion_P1 O ON C.iban = O.iban " +
                "WHERE EXISTS (SELECT * FROM Tiene_P1 T WHERE T.iban=C.iban and T.dni='"+dni+"') AND " +
                "O.contador = (SELECT MAX(contador) FROM Operacion_P1 Q WHERE Q.iban = C.iban)");
        List<Object[]> cuentas = q.getResultList();
        System.out.println("IBAN,CREACION,Nº CUENTA, SALDO, CONTADOR");
        for (Object [] c: cuentas) {
            for(Object one: c){
                System.out.print(one + ",");
            }
            System.out.println();
        }
    }

    /**
     * Devuelve usarios que pertenecen a la oficina indicada
     * @param oficina
     */
    private static void consulta2(int oficina) {
        System.out.println("Devuelve usarios que pertenecen a la oficina indicada");
        Query q = em.createNativeQuery("SELECT U.nombre,U.apellidos,U.dni FROM Usuario_P1 U WHERE EXISTS " +
                "(SELECT * FROM Tiene_P1 T LEFT JOIN CCorriente_P1 C ON C.iban=T.iban " +
                "WHERE T.dni = U.dni AND EXISTS (SELECT * FROM Pertenece_P1 P WHERE P.iban = C.iban AND P.codigo="+oficina+"))");
        List<Object[]> cuentas = q.getResultList();
        System.out.println("nombre,apellidos,dni");
        for (Object [] c: cuentas) {
            for(Object one: c){
                System.out.print(one + ",");
            }
            System.out.println();
        }
    }



}
