package test;

import parte2.CCorriente;
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
        Join<Cuenta, Operacion> operacion = cuenta.join("arrayOperaciones");
        Join<Cuenta, Usuario> usuario = cuenta.join("arrayUsuarios");
        Path<Object> path = operacion.get("id").get("contador");
        CriteriaQuery select = criteriaQuery.select(cuenta).distinct(true);


        Subquery<Operacion> maximo = criteriaQuery.subquery(Operacion.class);
        Root fromOperacion = maximo.from(Operacion.class);
        maximo.select(criteriaBuilder.max(fromOperacion.get("id").get("contador")));
        maximo.where(criteriaBuilder.equal(fromOperacion.get("iban"), cuenta.get("iban")));
        select.where(criteriaBuilder.in(path).value(maximo));
        select.where(criteriaBuilder.equal(usuario.get("dni"),dni));

        List<Object> c = em.createQuery(criteriaQuery).getResultList();
        for(Object one: c){
            System.out.println(one);
        }

    }

}
