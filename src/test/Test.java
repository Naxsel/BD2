package test;

import entidades.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by anicacortes on 28/04/2016.
 */
public class Test {

    public static void main(String[] args)
    {
        EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("EjemploDeUnidadDePersistencia");

        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction trans = em.getTransaction();

        trans.begin();

        //Calendar c = new GregorianCalendar(2016,8,03);
        Cuenta c = new Cuenta("FP33730958577227579078926552917807","ZP918886081013488002618758","2016-08-17",11.58,null,null);
        Cuenta c2 = new Cuenta("JI40453364997466550044235348213144","TL198715503499491378322716","2016-08-17",1412.07,null,null);
        Cuenta c3 = new Cuenta("HL76676038213950241779936041435785","PG652702401877598541560408","2015-03-07",244.81,null,null);
        Cuenta c4 = new Cuenta("BD19607765245983312200917823690887","YE869232102933034067936432","2015-07-25",1833.01,null,null);
        Cuenta c5 = new Cuenta("HR80011754363760623558518621971359","HJ971697288847463286863263","2016-06-01",144.44,null,null);
        Cuenta c6 = new Cuenta("BY10087113578567912692979144432606","DA442510510273806814083072","2015-05-14",1559.90,null,null);
        Cuenta c7 = new Cuenta("ZZ79792401884462158656425214620714","VC054785344569835728805815","2015-07-13",1272.65,null,null);

        CAhorro ca = new CAhorro("FP33730958577227579078926552917807", "ZP918886081013488002618758","2016-08-17",11.58,null,null,2.65, 10);
        CAhorro ca2 = new CAhorro("JI40453364997466550044235348213144","TL198715503499491378322716","2016-08-17",1412.07,null,null,3.0, 1);
        CAhorro ca3 = new CAhorro("HL76676038213950241779936041435785","PG652702401877598541560408","2015-03-07",244.81,null,null,2.5, 31);
        CAhorro ca4 = new CAhorro("BD19607765245983312200917823690887","YE869232102933034067936432","2015-07-25",1833.01,null,null,2.5, 28);
        CAhorro ca5 = new CAhorro("HR80011754363760623558518621971359","HJ971697288847463286863263","2016-06-01",144.44,null,null,1.85, 25);

        CCorriente co = new CCorriente("BY10087113578567912692979144432606","DA442510510273806814083072","2015-05-14",1559.90,null,null,null);
        CCorriente co2 = new CCorriente("ZZ79792401884462158656425214620714","VC054785344569835728805815","2015-07-13",1272.65,null,null,null);


        em.close();
        entityManagerFactory.close();
    }
}
