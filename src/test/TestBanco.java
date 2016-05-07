package test;

import entidades.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.*;

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

        //Insertar en la parte uno

        em.createNativeQuery("DELETE FROM Usuario_p4_Cuenta_p4").executeUpdate();
        em.createNativeQuery("DELETE FROM Usuario_p4").executeUpdate();
        em.createNativeQuery("DELETE FROM Operacion_p4").executeUpdate();
        em.createNativeQuery("DELETE FROM Cuenta_p4").executeUpdate();
        em.createNativeQuery("DELETE FROM Oficina_p4").executeUpdate();



        CAhorro ca = new CAhorro("FP33730958577227579078926552917807", "ZP918886081013488002618758","2016-08-17",11.58,null,null,2.65, 10);
        CAhorro ca2 = new CAhorro("JI40453364997466550044235348213144","TL198715503499491378322716","2016-08-17",1412.07,null,null,3.0, 1);
        CAhorro ca3 = new CAhorro("HL76676038213950241779936041435785","PG652702401877598541560408","2015-03-07",244.81,null,null,2.5, 31);
        CAhorro ca4 = new CAhorro("BD19607765245983312200917823690887","YE869232102933034067936432","2015-07-25",1833.01,null,null,2.5, 28);
        CAhorro ca5 = new CAhorro("HR80011754363760623558518621971359","HJ971697288847463286863263","2016-06-01",144.44,null,null,1.85, 25);
        CCorriente co = new CCorriente("BY10087113578567912692979144432606","DA442510510273806814083072","2015-05-14",1559.90,null,null,null);
        CCorriente co2 = new CCorriente("ZZ79792401884462158656425214620714","VC054785344569835728805815","2015-07-13",1272.65,null,null,null);

        Set<Cuenta> s = new HashSet<>();
        s.add(ca);
        Usuario u = new Usuario("31168350Y","Naida","Ayala",81,"2817 Dictum. C.","et.netus@dolorDonecfringilla.edu",23980911, s);
        Set<Cuenta> s1 = new HashSet<>(); s1.add(ca2);
        Usuario u1 = new Usuario("92141555M","Bruno","Stewart",89,"Apartado núm.: 183, 7005 Praesent Ctra.","libero.Integer.in@Cumsociisnatoque.org",89316763, s1);
        Set<Cuenta> s2 = new HashSet<>(); s2.add(ca3);
        Usuario u2 = new Usuario("38331046C","Otto","Frederick",97,"Apdo.:822-776 Sed, Avenida","senectus@velit.co.uk",17481518, s2);
        Set<Cuenta> s3 = new HashSet<>(); s3.add(ca5);
        Usuario u3 = new Usuario("75814109T","Caleb","Acosta",20,"Apdo.:579-3498 Dictum. Carretera","vulputate.ullamcorper.magna@tinciduntvehicula.co.uk",29678740, s3);
        Set<Cuenta> s4 = new HashSet<>(); s4.add(co);
        Usuario u4 = new Usuario("65291361T","Wade","Wilder",50,"Apartado núm.: 755, 7066 Dictum C/","nec.leo@iaculis.com",68318364, s4);
        Set<Cuenta> s5 = new HashSet<>(); s5.add(ca4);
        Usuario u5 = new Usuario("77927535U","Cara","Sanford",38,"828-2547 Lorem Calle","facilisis.non@sagittis.org",82656233, s5);

        Oficina o = new Oficina(null,null,7778,"880-8708 Volutpat Carretera",862869364);
        Oficina o1 = new Oficina(null,null,5401,"Apartado núm.: 517, 4078 Sollicitudin Av.",615365146);
        Oficina o2 = new Oficina(null,null,4622,"Apdo.:587-7511 Pellentesque Avenida",208867799);
        Oficina o3 = new Oficina(null,null,4870,"2608 Mauris Avda.",138327395);
        Oficina o4 = new Oficina(null,null,4135,"726-9715 Aliquet. Avenida",349535106);
        Oficina o5 = new Oficina(null,null,1986,"328-2856 Sit Avda.",414118468);
        Oficina o6 = new Oficina(null,null,8848,"9311 Proin Carretera",744948262);

        co.setOficinaCuenta(o5);
        co2.setOficinaCuenta(o6);

        Operacion op = new Operacion(ca,1,"t",new GregorianCalendar(2104,10,20),"08:13:00",ca2,o,10.25,"Primera op");
        Operacion op1 = new Operacion(ca,2,"t",new GregorianCalendar(2009,3,19),"08:13:00",ca2,o1,10.25,"Segun");
        Operacion op2 = new Operacion(ca,3,"t",new GregorianCalendar(2008,10,4),"08:13:00",ca2,o2,10.25,"Tercer");
        Operacion op3 = new Operacion(ca,4,"t",new GregorianCalendar(2008,12,29),"08:13:00",ca2,o3,10.25,"Cuart");
        Operacion op4 = new Operacion(ca,5,"t",new GregorianCalendar(2012,8,20),"08:13:00",ca2,o4,10.25,"Qi");
        Operacion op5 = new Operacion(co,27,"i",new GregorianCalendar(2009,5,9),"08:13:00",co,o1,50.60,"Sex");
        Operacion op6 = new Operacion(co2,41,"r",new GregorianCalendar(2012,12,14),"08:13:00",co2,o3,25.80,"Sept");

        em.persist(co);
        em.persist(co2);
        em.persist(ca);
        em.persist(ca2);
        em.persist(ca3);
        em.persist(ca4);
        em.persist(ca5);
        em.persist(u);
        em.persist(u1);
        em.persist(u2);
        em.persist(u3);
        em.persist(u4);
        em.persist(u5);
        em.persist(o);
        em.persist(o1);
        em.persist(o2);
        em.persist(o3);
        em.persist(o4);
        em.persist(o5);
        em.persist(o6);
        em.persist(op);
        em.persist(op1);
        em.persist(op2);
        em.persist(op3);
        em.persist(op4);
        em.persist(op5);
        em.persist(op6);

        em.getTransaction().commit();
        em.close();
        entityManagerFactory.close();
    }
}
