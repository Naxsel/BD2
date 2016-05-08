package test;

import parte2.Usuario;

import javax.persistence.*;
import java.util.List;

/**
 * Created by naxsel on 5/05/16.
 */
public class JPQL {

    public static EntityManagerFactory entityManagerFactory;
    public static EntityManager em;

    public static void main(String[] args) {
        entityManagerFactory = Persistence.createEntityManagerFactory("EjemploDeUnidadDePersistencia");
        em = entityManagerFactory.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();

        System.out.println("Consultas JPQL");
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
        Query q = em.createQuery("SELECT C.iban,C, O.id.contador FROM Cuenta C join C.arrayOperaciones O join C.arrayUsuarios U WHERE " +
                "U.dni =:dni AND O.id.contador = (SELECT MAX (id.contador) FROM Operacion Q WHERE Q.iban = C.iban)")
                .setParameter("dni",dni);
        List<Object[]> cuentas = q.getResultList();
        System.out.println("CUENTA,TIPO,CONTADOR");
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
        Query q = em.createQuery("SELECT U FROM Usuario U join U.arrayCuentas C WHERE EXISTS " +
                "(SELECT B FROM CCorriente B join B.oficinaCuenta O WHERE B.iban = C.iban AND O.codigo= :oficina)")
                .setParameter("oficina",oficina);
        List<Usuario> usuarios = q.getResultList();
        for (Usuario c: usuarios) {
            System.out.println(c);
        }
    }


}
