package test;

import parte2.Cuenta;
import parte2.Operacion;
import parte2.Usuario;

import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.List;

/**
 * Created by naxsel on 5/05/16.
 */
public class CriteriaAPI {
    public static EntityManagerFactory entityManagerFactory;
    public static EntityManager em;
    public static CriteriaBuilder criteriaBuilder;

    public static void main(String[] args) {
        entityManagerFactory = Persistence.createEntityManagerFactory("EjemploDeUnidadDePersistencia");
        em = entityManagerFactory.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        criteriaBuilder = em.getCriteriaBuilder();
        trans.begin();

        System.out.println("Consultas Criteria API");
        consulta1("31168350Y");
        System.out.println();
        //consulta2(1986);
    }

    /**
     * Para un dni devuelve la cuenta asociada (si existe) que más numero de operaciones tiene
     *
     * @param dni
     */
    private static void consulta1(String dni) {
        System.out.println("Para un dni devuelve la cuenta asociada (si existe) que más numero de operaciones tiene");
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<Cuenta> cuenta = criteriaQuery.from(Cuenta.class);
        Join<Cuenta, Usuario> usuario = cuenta.join("arrayUsuarios");
        Join<Cuenta, Operacion> operacion = cuenta.join("arrayOperaciones");
        CriteriaQuery select = criteriaQuery.select(cuenta);


        Subquery<Operacion> maximo = criteriaQuery.subquery(Operacion.class);
        Root fromOperacion = maximo.from(Operacion.class);
        maximo.select(criteriaBuilder.max(fromOperacion.get("id.contador")));
        maximo.where(criteriaBuilder.equal(fromOperacion.get("iban"), cuenta.get("iban")));
        select.where(criteriaBuilder.in(operacion).value(maximo));

        Object c = em.createQuery(criteriaQuery).getSingleResult();
        System.out.print(c);

    }

    /**
     * Devuelve usarios que pertenecen a la oficina indicada
     *
     * @param oficina
     */
    private static void consulta2(int oficina) {
        System.out.println("Devuelve usarios que pertenecen a la oficina indicada");
        Query q = em.createQuery("SELECT U FROM Usuario U join U.arrayCuentas C WHERE EXISTS " +
                "(SELECT B FROM CCorriente B join B.oficinaCuenta O WHERE B.iban = C.iban AND O.codigo= :oficina)")
                .setParameter("oficina", oficina);
        List<Usuario> usuarios = q.getResultList();
        for (Usuario c : usuarios) {
            System.out.println(c);
        }
    }
}
