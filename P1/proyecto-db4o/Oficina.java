import com.db4o.ObjectContainer;

/**
 * Created by anicacortes on 01/04/2016.
 */
public class Oficina {

    private String codigo;
    private String direccion;
    private int telefono;
    private Cuenta[] cuentas;

    public Oficina(String codigo, String direccion, int telefono, Cuenta[] cuentas) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuentas = cuentas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }
    
    public static void creaOficinas(ObjectContainer) {
        Oficina o1 = new Oficina('1986','328-2856 Sit Avda.','414118468',null);
        Oficina o2 = new Oficina('6445','Apartado núm.: 561, 5888 Ut, Avenida','596929870',null);
        Oficina o3 = new Oficina('3434','Apartado núm.: 132, 3014 Mauris Calle','843944968',null);
        Oficina o4 = new Oficina('8934','1080 Mi Carretera','465780993',null);
        Oficina o5 = new Oficina('1199','Apartado núm.: 242, 6187 Quisque Carretera','319512827',null);
        Oficina o6 = new Oficina('5870','6532 Enim. C.','866348790',null);
        Oficina o7 = new Oficina('8848','9311 Proin Carretera','744948262',null);
        Oficina o8 = new Oficina('7778','880-8708 Volutpat Carretera','862869364',null);
        Oficina o9 = new Oficina('5401','Apartado núm.: 517, 4078 Sollicitudin Av.','615365146',null);
        Oficina o10 = new Oficina('4622','Apdo.:587-7511 Pellentesque Avenida','208867799',null);
        Oficina o11 = new Oficina('4870','2608 Mauris Avda.','138327395',null);
        Oficina o12 = new Oficina('4135','726-9715 Aliquet. Avenida','349535106',null);
        Oficina o13 = new Oficina('8312','8300 Pharetra. Av.','167705336',null);
        Oficina o14 = new Oficina('6865','8046 Donec ','429372675',null);
        Oficina o15 = new Oficina('6588','2510 Auctor Ctra.','266394560',null);
        Oficina o16 = new Oficina('9085','9856 Quis C/','172801270',null);
        Oficina o17 = new Oficina('6723','366-6381 Vitae, Avda.','482537700',null);
        Oficina o18 = new Oficina('7815','Apdo.:788-9134 Integer C.','155877285',null);
        Oficina o19 = new Oficina('0053','927-2337 Phasellus Ctra.','374726347',null);
        Oficina o20 = new Oficina('3937','Apartado núm.: 449, 8583 Nam C/','398209460',null);
        Oficina o21 = new Oficina('7381','Apdo.:645-886 Et Calle','900884290',null);
        Oficina o22 = new Oficina('8289','731-3133 Malesuada C/','114425144',null);
        Oficina o23 = new Oficina('0778','Apartado núm.: 131, 166 Turpis. C/','428687262',null);
        Oficina o24 = new Oficina('9839','Apartado núm.: 224, 7943 Sagittis ','960283979');
        Oficina o25 = new Oficina('6731','Apdo.:563-6530 Nisl ','447138342');
        Oficina o26 = new Oficina('1037','Apartado núm.: 900, 8829 Iaculis Avenida','220936534');
        Oficina o27 = new Oficina('9696','Apartado núm.: 849, 2237 Elementum, Avenida','317447810');
        Oficina o28 = new Oficina('2838','2002 Pharetra ','875629548');
        Oficina o29 = new Oficina(\ '2663\',\'242-9757 Ut Avda.\',\'614297443\');
        Oficina o30 = new Oficina('8705','Apdo.:488-2021 Etiam Ctra.','250993504');
        Oficina o31 = new Oficina('2435','Apdo.:433-5271 Vestibulum C/','679395075');
        Oficina o32 = new Oficina('7949','472-6422 Leo. Calle','905960355');
        Oficina o33 = new Oficina('5385','Apdo.:347-7212 Ipsum C/','208129171');
        Oficina o34 = new Oficina('0029','453-6456 Felis. Ctra.','453449524');
        Oficina o35 = new Oficina('1315','6074 Convallis C/','161296236');
        Oficina o36 = new Oficina('3584','765-3599 Fermentum Avda.','392647754');
        Oficina o37 = new Oficina('1740','Apartado núm.: 764, 7446 Fames C/','111980176');
        Oficina o38 = new Oficina('9388','Apdo.:576-8498 Ac Avda.','399868169');
        Oficina o39 = new Oficina('3952','Apdo.:914-1916 Iaculis Avenida','328977634');
        Oficina o40 = new Oficina('4005','Apdo.:382-2888 Iaculis C.','666961518');
        Oficina o41 = new Oficina('6739','9281 Metus. Ctra.','648910244');
        Oficina o42 = new Oficina('1739','Apdo.:992-369 Tincidunt C.','631470413');
        Oficina o43 = new Oficina('9065','Apartado núm.: 662, 6879 Feugiat ','215282357');
        Oficina o44 = new Oficina('4355','Apartado núm.: 626, 5029 Rhoncus Calle','326994565');
        Oficina o45 = new Oficina('6681','Apartado núm.: 757, 9977 Pede. Carretera','566238819');
        Oficina o46 = new Oficina('6718','3248 Vivamus Ctra.','115956700');
        Oficina o47 = new Oficina('0815','Apartado núm.: 454, 7013 Mi ','463984313');
        Oficina o48 = new Oficina('5289','Apdo.:496-5036 Elit, Calle','388772833');
        Oficina o49 = new Oficina('7975','5910 Metus Av.','914169626');
        Oficina o50 = new Oficina('1445','Apartado núm.: 503, 432 Imperdiet, Carretera','395387647');
        Oficina o51 = new Oficina('1605','757-1930 Integer Av.','214503061');
        Oficina o52 = new Oficina('4893','546-6483 Nunc Ctra.','998172273');
        Oficina o53 = new Oficina('3722','Apdo.:877-8260 Sociis Calle','698959634');
        Oficina o54 = new Oficina('4074','Apartado núm.: 832, 1959 Phasellus Calle','577802095');
        Oficina o55 = new Oficina('6289','Apartado núm.: 234, 8627 Cras Avda.','247517139');
        Oficina o56 = new Oficina('3137','Apartado núm.: 845, 4405 Neque. Avenida','757452215');
        Oficina o57 = new Oficina('5695','412-9918 Netus Avda.','273894182');
        Oficina o58 = new Oficina('2988','Apartado núm.: 590, 3003 Nibh. Avda.','209986218');
        Oficina o59 = new Oficina('3756','2356 Vulputate, Avenida','773916054');
        Oficina o60 = new Oficina('6887','Apartado núm.: 324, 7643 Nulla ','734523414');
        Oficina o61 = new Oficina('7734','9618 Non Avda.','619759891');
        Oficina o62 = new Oficina('2001','Apartado núm.: 115, 9415 Pharetra. Avda.','848274845');
        Oficina o63 = new Oficina('6233','Apartado núm.: 215, 1455 Euismod Ctra.','384694338');
        Oficina o64 = new Oficina('3172','Apartado núm.: 580, 4565 Ipsum Avenida','497773220');
        Oficina o65 = new Oficina('6124','Apdo.:412-6395 Phasellus Ctra.','537954812');
        Oficina o66 = new Oficina('5590','Apdo.:362-2291 At, Ctra.','739325659');
        Oficina o67 = new Oficina('8571','Apdo.:461-1976 Vitae Calle','845480695');
        Oficina o68 = new Oficina('1043','Apartado núm.: 359, 7955 Suspendisse Avenida','893948440');
        Oficina o69 = new Oficina('0768','Apdo.:416-5869 Dui Avda.','523196196');
        Oficina o70 = new Oficina('2142','838-148 Nunc Avenida','390273713');
        Oficina o71 = new Oficina('1210','263-7460 Arcu. C.','864490136');
        Oficina o72 = new Oficina('4588','Apartado núm.: 482, 8926 Lorem, Avenida','743415503');
        Oficina o73 = new Oficina('8815','7277 Neque. C.','505608311',NULL);
        Oficina o74 = new Oficina('5228','817-2600 Tincidunt Calle','847388553',NULL);
        Oficina o75 = new Oficina('8178','Apdo.:216-2750 Faucibus Ctra.','772753720',NULL);
        Oficina o76 = new Oficina('3072','Apartado núm.: 411, 9276 Turpis ','331964911',NULL);
        Oficina o77 = new Oficina('7920','Apdo.:168-5059 Mauris ','960695517',NULL);
        Oficina o78 = new Oficina('7343','6786 Enim Avda.','995597553',NULL);
        Oficina o79 = new Oficina('7226','2823 Rutrum. Av.','828908641',NULL);
        Oficina o80 = new Oficina('9321','Apartado núm.: 751, 2088 Metus. Ctra.','317933852',NULL);
        Oficina o81 = new Oficina('7717','4693 Sed Ctra.','762218517',NULL);
        Oficina o82 = new Oficina('4799','Apartado núm.: 786, 6349 Vestibulum Avenida','471558930',NULL);
        Oficina o83 = new Oficina('9683','Apdo.:871-2900 Blandit Calle','211837294',NULL);
        Oficina o84 = new Oficina('2423','677-7485 Habitant Carretera','583234591',NULL);
        Oficina o85 = new Oficina('4378','4792 Faucibus Avenida','922162250',NULL);
        Oficina o86 = new Oficina('1705','744-9497 A, Calle','217957825',NULL);
        Oficina o87 = new Oficina('4207','Apdo.:830-2663 Massa. Carretera','623936459',NULL);
        Oficina o88 = new Oficina('3132','Apartado núm.: 688, 4195 Dui. Carretera','616333723',NULL);
        Oficina o89 = new Oficina('4396','382-1733 Mus. Ctra.','699843784',NULL);
        Oficina o90 = new Oficina('2049','Apartado núm.: 821, 610 Amet, Avda.','142436380',NULL);
        Oficina o91 = new Oficina('2081','Apartado núm.: 927, 1373 Integer Av.','410507916',NULL);
        Oficina o92 = new Oficina('0886','Apdo.:294-9707 Enim. C.','851207640',NULL);
        Oficina o93 = new Oficina('4593','827-6675 Nec Calle','307212069',NULL);
        Oficina o94 = new Oficina('3502','897-4181 Augue. Calle','531689160',NULL);
        Oficina o95 = new Oficina('4142','271-6894 Hendrerit. Carretera','238445637',NULL);
        Oficina o96 = new Oficina('9514','Apdo.:186-3493 Eu Av.','626909784',NULL);
        Oficina o97 = new Oficina('6656','Apdo.:406-7707 Maecenas ','558876002',NULL);
        Oficina o98 = new Oficina('1508','Apartado núm.: 772, 282 Semper C/','536574688',NULL);
        Oficina o99 = new Oficina('5932','Apartado núm.: 225, 6921 Blandit Avenida','630824281',NULL);



        
    }
}
