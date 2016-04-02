import com.db4o.ObjectContainer;

public class InsertarDatos {

    public static void almacenarUsuario(ObjectContainer obj, Usuario u) {
        try {
            obj.store(u);
            System.out.print("Se ha almacenado correctamente el usuario");
        }
        catch(Exception e) {
            System.out.print("Error al almacenar usuario");
        }
    }

    public static void almacenarCuenta(ObjectContainer obj, Cuenta c) {
        try {
            obj.store(c);
            System.out.print("Se ha almacenado correctamente la cuenta");
        }
        catch(Exception e) {
            System.out.print("Error al almacenar cuenta");
        }
    }

    public static void almacenarOperacion(ObjectContainer obj, Operacion op) {
        try {
            obj.store(op);
            System.out.print("Se ha almacenado correctamente la operacion");
        }
        catch(Exception e) {
            System.out.print("Error al almacenar operacion");
        }
    }

    public static void almacenarOficina(ObjectContainer obj, Oficina o) {
        try {
            obj.store(o);
            System.out.print("Se ha almacenado correctamente la oficina");
        }
        catch(Exception e) {
            System.out.print("Error al almacenar oficina");
        }
    }

    public static void crearInsertarDatos(){

        Operacion op1 = new Operacion(1,"transferencia","2014-10-20 08:13:00","FP33730958577227579078926552917807","JI40453364997466550044235348213144","","",100.00);
        Operacion op2 = new Operacion(2,"transferencia","2009-03-19 02:59:00","FP33730958577227579078926552917807","JI40453364997466550044235348213144","","",100.00);
        Operacion op3 = new Operacion(3,"transferencia","2008-10-04 17:28:00","FP33730958577227579078926552917807","JI40453364997466550044235348213144","","",100.00);
        Operacion op4 = new Operacion(4,"transferencia","2008-12-29 02:24:00","FP33730958577227579078926552917807","JI40453364997466550044235348213144","","",100.00);
        Operacion op5 = new Operacion(5,"transferencia","2012-08-20 15:50:00","FP33730958577227579078926552917807","JI40453364997466550044235348213144","","",100.00);
        Operacion op6 = new Operacion(6,"transferencia","2012-10-13 09:28:00","FP33730958577227579078926552917807","JI40453364997466550044235348213144","","",100.00);
        Operacion op7 = new Operacion(7,"transferencia","2008-07-22 03:32:00","FP33730958577227579078926552917807","JI40453364997466550044235348213144","","",100.00);
        Operacion op8 = new Operacion(8,"transferencia","2013-08-16 05:15:00","FP33730958577227579078926552917807","JI40453364997466550044235348213144","","",100.00);
        Operacion op9 = new Operacion(9,"transferencia","2013-05-31 13:26:00","FP33730958577227579078926552917807","JI40453364997466550044235348213144","","",100.00);
        Operacion op10 = new Operacion(10,"transferencia","2014-06-06 20:20:00","FP33730958577227579078926552917807","JI40453364997466550044235348213144","","",100.00);
        Operacion op11 = new Operacion(11,"transferencia","2006-05-05 14:01:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op12 = new Operacion(12,"transferencia","2011-05-29 22:12:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op13 = new Operacion(13,"transferencia","2011-07-04 11:43:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op14 = new Operacion(14,"transferencia","2010-05-08 15:14:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op15 = new Operacion(15,"transferencia","2014-06-23 08:27:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op16 = new Operacion(16,"transferencia","2014-01-15 11:21:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op17 = new Operacion(17,"transferencia","2007-12-13 16:22:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op18 = new Operacion(18,"transferencia","2009-03-03 14:48:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op19 = new Operacion(19,"transferencia","2006-05-31 13:07:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op20 = new Operacion(20,"transferencia","2011-01-05 23:14:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op21 = new Operacion(21,"transferencia","2012-02-19 07:28:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op22 = new Operacion(22,"transferencia","2009-06-21 20:52:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op23 = new Operacion(23,"transferencia","2012-05-08 23:33:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op24 = new Operacion(24,"transferencia","2011-12-18 16:10:00","VX49974070678271238458117005418174","WL20881903893391450526693915360220","","",25.00);
        Operacion op25 = new Operacion(25,"transferencia","2014-08-19 03:59:00","VX49974070678271238458117005418174","VX49974070678271238458117005418174","","",25.00);
        Operacion op26 = new Operacion(26,"transferencia","2008-06-17 19:43:00","VX49974070678271238458117005418174","VX49974070678271238458117005418174","","",25.00);
        Operacion op27 = new Operacion(27,"ingreso","2009-05-09 08:34:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op28 = new Operacion(28,"ingreso","2011-10-15 11:49:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op29 = new Operacion(29,"ingreso","2013-10-07 10:11:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op30 = new Operacion(30,"ingreso","2008-09-26 12:10:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op31 = new Operacion(31,"ingreso","2016-01-04 19:48:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op32 = new Operacion(32,"ingreso","2007-12-01 13:38:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op33 = new Operacion(33,"ingreso","2014-10-25 15:07:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op34 = new Operacion(34,"ingreso","2008-03-25 08:14:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op35 = new Operacion(35,"ingreso","2012-08-12 08:27:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op36 = new Operacion(36,"ingreso","2015-05-24 17:20:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op37 = new Operacion(37,"ingreso","2005-06-06 00:40:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op38 = new Operacion(38,"ingreso","2014-03-08 01:31:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op39 = new Operacion(39,"ingreso","2011-07-06 19:05:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op40 = new Operacion(40,"ingreso","2013-05-18 21:45:00","BY10087113578567912692979144432606","BY10087113578567912692979144432606","cajero 25","",50.00);
        Operacion op41 = new Operacion(41,"retirada","2012-12-14 14:05:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op42 = new Operacion(42,"retirada","2014-04-18 12:33:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op43 = new Operacion(43,"retirada","2014-11-04 18:03:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op44 = new Operacion(44,"retirada","2014-08-21 22:40:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op45 = new Operacion(45,"retirada","2011-11-29 02:40:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op46 = new Operacion(46,"retirada","2007-09-21 00:43:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op47 = new Operacion(47,"retirada","2009-12-03 04:00:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op48 = new Operacion(48,"retirada","2009-04-01 04:47:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op49 = new Operacion(49,"retirada","2006-11-30 19:54:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op50 = new Operacion(50,"retirada","2012-05-13 21:12:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op51 = new Operacion(51,"retirada","2015-09-18 23:49:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op52 = new Operacion(52,"retirada","2010-03-27 22:16:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op53 = new Operacion(53,"retirada","2007-07-16 09:25:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op54 = new Operacion(54,"retirada","2015-03-04 04:12:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);
        Operacion op55 = new Operacion(55,"retirada","2007-04-30 20:31:00","AR32595816696735123283490230286479","AR32595816696735123283490230286479","cajero 51","",25.00);

        Cuenta c1 = new Cuenta("WL20881903893391450526693915360220","VX531536933708406882147414","2015-09-02",912.00,null);
        Operacion[] t = {op11,op12,op13,op14,op15,op16,op17,op18,op19,op20,op21,op22,op23,op24};
        c1.setListaOperaciones(t);
        Cuenta c2 = new Cuenta("NY32322508338458522212255405176655","RR826595373156207313455541","2015-08-31",177.00,null);
        Cuenta c3 = new Cuenta("PF95812037075358869290733997999561","PK846216889247910450214543","2015-05-08",628.00,null);
        Cuenta c4 = new Cuenta("NA82264457381598741989494683817690","GM079750915370909510351058","2016-10-02",1013.00,null);
        Cuenta c5 = new Cuenta("BY10087113578567912692979144432606","DA442510510273806814083072","2015-05-14",1559.00,null);
        Operacion[] t2 = {op27,op28,op29,op30,op31,op32,op33,op34,op35,op36,op37,op38,op39,op40};
        c5.setListaOperaciones(t2);

        CuentaAhorro c21 = new CuentaAhorro("FP33730958577227579078926552917807","ZP918886081013488002618758","2016-03-03",11.58,null,2.00,10);
        CuentaAhorro c22 = new CuentaAhorro("JI40453364997466550044235348213144","TL198715503499491378322716","2016-08-17",1412.00,null,3.00,1);
        Operacion[] t3 = {op1,op2,op3,op4,op5,op6,op7,op8,op9,op10};
        c21.setListaOperaciones(t3);
        c22.setListaOperaciones(t3);
        CuentaAhorro c23 = new CuentaAhorro("BI93137422139573451319199350680286","EE299356485493716017660928","2016-05-26",755.00,null,3.00,22);
        CuentaAhorro c24 = new CuentaAhorro("HL76676038213950241779936041435785","PG652702401877598541560408","2015-03-07",244.00,null,2.00,31);
        CuentaAhorro c25 = new CuentaAhorro("OR88691482977841194690319235692353","QT312136665216734233119162","2016-11-07",1749.00,null,2.00,22);
        CuentaAhorro c6 = new CuentaAhorro("BD19607765245983312200917823690887","YE869232102933034067936432","2015-07-25",1833.00,null,2.00,28);
        CuentaAhorro c7 = new CuentaAhorro("TC21975092033903028935377885821921","HR037014073555255719289233","2015-04-06",106.00,null,3.00,22);
        CuentaAhorro c8 = new CuentaAhorro("HR80011754363760623558518621971359","HJ971697288847463286863263","2016-06-01",144.00,null,1.00,25);
        CuentaAhorro c9 = new CuentaAhorro("RJ82870931752843605801348664024434","SB526752601132090401954533","2017-01-07",48.804,null,2.00,12);
        CuentaAhorro c10 = new CuentaAhorro("OA95633548864133819790922760765435","FJ286614168064820794516468","2016-06-11",1051.00,null,1.00,14);
        CuentaAhorro c11 = new CuentaAhorro("VX49974070678271238458117005418174","GZ432666518927849895424020","2015-12-03",1201.00,null,3.00,15);
        Operacion[] t4 = {op11,op12,op13,op14,op15,op16,op17,op18,op19,op20,op21,op22,op23,op24,op24,op26};
        c11.setListaOperaciones(t4);
        CuentaAhorro c12 = new CuentaAhorro("EO98500155929072427788207743122255","VL496402362803874524565269","2016-04-28",1571.00,null,2.00,16);
        CuentaAhorro c13 = new CuentaAhorro("PE02267316774640124817561016121571","ZD453142449199799701677112","2016-11-29",1306.00,null,2.00,22);
        CuentaAhorro c14 = new CuentaAhorro("MC34720153034518480223567180403259","GG922143906581198355966864","2015-04-09",105.00,null,3.00,24);
        CuentaAhorro c15 = new CuentaAhorro("II19860669879734995631145967201418","PJ756750701024185226709392","2016-04-28",1190.00,null,3.00,22);
        CuentaAhorro c16 = new CuentaAhorro("WR03493457992206687764115095160218","IC118308343326727962867448","2015-03-22",1815.00,null,1.00,29);
        CuentaAhorro c17 = new CuentaAhorro("CZ11209217849850715441903620157354","SS239129970185176003543174","2016-11-07",1556.00,null,3.00,30);
        CuentaAhorro c18 = new CuentaAhorro("AR32595816696735123283490230286479","WK064201260459574786685201","2015-12-31",832.00,null,3.00,5);
        Operacion[] t5 = {op41,op42,op43,op44,op45,op46,op47,op48,op49,op50,op51,op52,op53,op54,op55};
        c18.setListaOperaciones(t5);
        CuentaAhorro c19 = new CuentaAhorro("PA57877801854929214196122747132446","RD552668092213034380759678","2016-03-15",1067.00,null,2.00,3);
        CuentaAhorro c20 = new CuentaAhorro("AG22068521770637896137627734009238","ZI551737991879785552530525","2015-07-26",937.00,null,1.00,2);

        Oficina o1 = new Oficina("1986","328-2856 Sit Avda.",414118468,null);
        Cuenta[] t6 = {c21, c22, c10, c9, c8, c7, c6, c25, c24};
        o1.setCuentas(t6);
        Oficina o2 = new Oficina("6445","Apartado núm.: 561, 5888 Ut, Avenida",596929870,null);
        Cuenta[] t7 = {c11, c23, c12, c13, c14, c15, c16, c17, c18, c19};
        o2.setCuentas(t7);
        Oficina o3 = new Oficina("3434","Apartado núm.: 132, 3014 Mauris Calle",843944968,null);
        Cuenta[] t8 = {c20};
        o3.setCuentas(t8);
        Oficina o4 = new Oficina("8934","1080 Mi Carretera",465780993,null);
        Cuenta[] t9 = {c1, c2};
        o4.setCuentas(t9);
        Oficina o5 = new Oficina("1199","Apartado núm.: 242, 6187 Quisque Carretera",319512827,null);
        Cuenta[] t10 = {c2, c3};
        o5.setCuentas(t10);
        Oficina o6 = new Oficina("5870","6532 Enim. C.",866348790,null;
        Cuenta[] t11 = {c4};
        o6.setCuentas(t11);
        Oficina o7 = new Oficina("8848","9311 Proin Carretera",744948262,null);
        Cuenta[] t12 = {c5};
        o7.setCuentas(t12);
        Oficina o8 = new Oficina("7778","880-8708 Volutpat Carretera",862869364,null);
        Oficina o9 = new Oficina("5401","Apartado núm.: 517, 4078 Sollicitudin Av.",615365146,null);
        Oficina o10 = new Oficina("4622","Apdo.:587-7511 Pellentesque Avenida",208867799,null);
        Oficina o11 = new Oficina("4870","2608 Mauris Avda.",138327395,null);
        Oficina o12 = new Oficina("4135","726-9715 Aliquet. Avenida",349535106,null);
        Oficina o13 = new Oficina("8312","8300 Pharetra. Av.",167705336,null);
        Oficina o14 = new Oficina("6865","8046 Donec ",429372675,null);
        Oficina o15 = new Oficina("6588","2510 Auctor Ctra.",266394560,null);
        Oficina o16 = new Oficina("9085","9856 Quis C/",172801270,null);
        Oficina o17 = new Oficina("6723","366-6381 Vitae, Avda.",482537700,null);
        Oficina o18 = new Oficina("7815","Apdo.:788-9134 Integer C.",155877285,null);
        Oficina o19 = new Oficina("0053","927-2337 Phasellus Ctra.",374726347,null);
        Oficina o20 = new Oficina("3937","Apartado núm.: 449, 8583 Nam C/",398209460,null);
        Oficina o21 = new Oficina("7381","Apdo.:645-886 Et Calle",900884290,null);
        Oficina o22 = new Oficina("8289","731-3133 Malesuada C/",114425144,null);
        Oficina o23 = new Oficina("0778","Apartado núm.: 131, 166 Turpis. C/",428687262,null);
        Oficina o24 = new Oficina("9839","Apartado núm.: 224, 7943 Sagittis ",960283979,null);
        Oficina o25 = new Oficina("6731","Apdo.:563-6530 Nisl ",447138342,null);
        Oficina o26 = new Oficina("1037","Apartado núm.: 900, 8829 Iaculis Avenida",220936534,null);
        Oficina o27 = new Oficina("9696","Apartado núm.: 849, 2237 Elementum, Avenida",317447810,null);
        Oficina o28 = new Oficina("2838","2002 Pharetra ",875629548,null);
        Oficina o29 = new Oficina("2663","242-9757 Ut Avda.",614297443,null);
        Oficina o30 = new Oficina("8705","Apdo.:488-2021 Etiam Ctra.",250993504,null);
        Oficina o31 = new Oficina("2435","Apdo.:433-5271 Vestibulum C/",679395075,null);
        Oficina o32 = new Oficina("7949","472-6422 Leo. Calle",905960355,null);
        Oficina o33 = new Oficina("5385","Apdo.:347-7212 Ipsum C/",208129171,null);
        Oficina o34 = new Oficina("0029","453-6456 Felis. Ctra.",453449524,null);
        Oficina o35 = new Oficina("1315","6074 Convallis C/",161296236,null);
        Oficina o36 = new Oficina("3584","765-3599 Fermentum Avda.",392647754,null);
        Oficina o37 = new Oficina("1740","Apartado núm.: 764, 7446 Fames C/",111980176,null);
        Oficina o38 = new Oficina("9388","Apdo.:576-8498 Ac Avda.",399868169,null);
        Oficina o39 = new Oficina("3952","Apdo.:914-1916 Iaculis Avenida",328977634,null);
        Oficina o40 = new Oficina("4005","Apdo.:382-2888 Iaculis C.",666961518,null);
        Oficina o41 = new Oficina("6739","9281 Metus. Ctra.",648910244,null);
        Oficina o42 = new Oficina("1739","Apdo.:992-369 Tincidunt C.",631470413,null);
        Oficina o43 = new Oficina("9065","Apartado núm.: 662, 6879 Feugiat ",215282357,null);
        Oficina o44 = new Oficina("4355","Apartado núm.: 626, 5029 Rhoncus Calle",326994565,null);
        Oficina o45 = new Oficina("6681","Apartado núm.: 757, 9977 Pede. Carretera",566238819,null);
        Oficina o46 = new Oficina("6718","3248 Vivamus Ctra.",115956700,null);
        Oficina o47 = new Oficina("0815","Apartado núm.: 454, 7013 Mi ",463984313,null);
        Oficina o48 = new Oficina("5289","Apdo.:496-5036 Elit, Calle",388772833,null);
        Oficina o49 = new Oficina("7975","5910 Metus Av.",914169626,null);
        Oficina o50 = new Oficina("1445","Apartado núm.: 503, 432 Imperdiet, Carretera",395387647,null);
        Oficina o51 = new Oficina("1605","757-1930 Integer Av.",214503061,null);
        Oficina o52 = new Oficina("4893","546-6483 Nunc Ctra.",998172273,null);
        Oficina o53 = new Oficina("3722","Apdo.:877-8260 Sociis Calle",698959634,null);
        Oficina o54 = new Oficina("4074","Apartado núm.: 832, 1959 Phasellus Calle",577802095,null);
        Oficina o55 = new Oficina("6289","Apartado núm.: 234, 8627 Cras Avda.",247517139,null);
        Oficina o56 = new Oficina("3137","Apartado núm.: 845, 4405 Neque. Avenida",757452215,null);
        Oficina o57 = new Oficina("5695","412-9918 Netus Avda.",273894182,null);
        Oficina o58 = new Oficina("2988","Apartado núm.: 590, 3003 Nibh. Avda.",209986218,null);
        Oficina o59 = new Oficina("3756","2356 Vulputate, Avenida",773916054,null);
        Oficina o60 = new Oficina("6887","Apartado núm.: 324, 7643 Nulla ",734523414,null);
        Oficina o61 = new Oficina("7734","9618 Non Avda.",619759891,null);
        Oficina o62 = new Oficina("2001","Apartado núm.: 115, 9415 Pharetra. Avda.",848274845,null);
        Oficina o63 = new Oficina("6233","Apartado núm.: 215, 1455 Euismod Ctra.",384694338,null);
        Oficina o64 = new Oficina("3172","Apartado núm.: 580, 4565 Ipsum Avenida",497773220,null);
        Oficina o65 = new Oficina("6124","Apdo.:412-6395 Phasellus Ctra.",537954812,null);
        Oficina o66 = new Oficina("5590","Apdo.:362-2291 At, Ctra.",739325659,null);
        Oficina o67 = new Oficina("8571","Apdo.:461-1976 Vitae Calle",845480695,null);
        Oficina o68 = new Oficina("1043","Apartado núm.: 359, 7955 Suspendisse Avenida",893948440,null);
        Oficina o69 = new Oficina("0768","Apdo.:416-5869 Dui Avda.",523196196,null);
        Oficina o70 = new Oficina("2142","838-148 Nunc Avenida",390273713,null);
        Oficina o71 = new Oficina("1210","263-7460 Arcu. C.",864490136,null);
        Oficina o72 = new Oficina("4588","Apartado núm.: 482, 8926 Lorem, Avenida",743415503,null);
        Oficina o73 = new Oficina("8815","7277 Neque. C.",505608311,null);
        Oficina o74 = new Oficina("5228","817-2600 Tincidunt Calle",847388553,null);
        Oficina o75 = new Oficina("8178","Apdo.:216-2750 Faucibus Ctra.",772753720,null);
        Oficina o76 = new Oficina("3072","Apartado núm.: 411, 9276 Turpis ",331964911,null);
        Oficina o77 = new Oficina("7920","Apdo.:168-5059 Mauris ",960695517,null);
        Oficina o78 = new Oficina("7343","6786 Enim Avda.",995597553,null);
        Oficina o79 = new Oficina("7226","2823 Rutrum. Av.",828908641,null);
        Oficina o80 = new Oficina("9321","Apartado núm.: 751, 2088 Metus. Ctra.",317933852,null);
        Oficina o81 = new Oficina("7717","4693 Sed Ctra.",762218517,null);
        Oficina o82 = new Oficina("4799","Apartado núm.: 786, 6349 Vestibulum Avenida",471558930,null);
        Oficina o83 = new Oficina("9683","Apdo.:871-2900 Blandit Calle",211837294,null);
        Oficina o84 = new Oficina("2423","677-7485 Habitant Carretera",583234591,null);
        Oficina o85 = new Oficina("4378","4792 Faucibus Avenida",922162250,null);
        Oficina o86 = new Oficina("1705","744-9497 A, Calle",217957825,null);
        Oficina o87 = new Oficina("4207","Apdo.:830-2663 Massa. Carretera",623936459,null);
        Oficina o88 = new Oficina("3132","Apartado núm.: 688, 4195 Dui. Carretera",616333723,null);
        Oficina o89 = new Oficina("4396","382-1733 Mus. Ctra.",699843784,null);
        Oficina o90 = new Oficina("2049","Apartado núm.: 821, 610 Amet, Avda.",142436380,null);
        Oficina o91 = new Oficina("2081","Apartado núm.: 927, 1373 Integer Av.",410507916,null);
        Oficina o92 = new Oficina("0886","Apdo.:294-9707 Enim. C.",851207640,null);
        Oficina o93 = new Oficina("4593","827-6675 Nec Calle",307212069,null);
        Oficina o94 = new Oficina("3502","897-4181 Augue. Calle",531689160,null);
        Oficina o95 = new Oficina("4142","271-6894 Hendrerit. Carretera",238445637,null);
        Oficina o96 = new Oficina("9514","Apdo.:186-3493 Eu Av.",626909784,null);
        Oficina o97 = new Oficina("6656","Apdo.:406-7707 Maecenas ",558876002,null);
        Oficina o98 = new Oficina("1508","Apartado núm.: 772, 282 Semper C/",536574688,null);
        Oficina o99 = new Oficina("5932","Apartado núm.: 225, 6921 Blandit Avenida",630824281,null);

        Usuario u1 = new Usuario("31168350Y","Naida","Ayala",81,"2817 Dictum. C.","et.netus@dolorDonecfringilla.edu",23980911,[c21,c23]);
        Usuario u2 = new Usuario("92141555M","Bruno","Stewart",89,"Apartado núm.: 183, 7005 Praesent Ctra.","libero.Integer.in@Cumsociisnatoque.org",89316763,[c22,c1]);
        Usuario u100 = new Usuario("38331046C","Otto","Frederick",97,"Apdo.:822-776 Sed, Avenida","senectus@velit.co.uk",17481518,[c24,c25]);
        Usuario u3 = new Usuario("77927535U","Cara","Sanford",38,"828-2547 Lorem Calle","facilisis.non@sagittis.org",82656233,[c6,c2]);
        Usuario u4 = new Usuario("75814109T","Caleb","Acosta",20,"Apdo.:579-3498 Dictum. Carretera","vulputate.ullamcorper.magna@tinciduntvehicula.co.uk",29678740,[c8,c7]);
        Usuario u5 = new Usuario("88709936O","Megan","Fulton",21,"Apdo.:152-9606 Nec, C/","pede@ultriciesornare.co.uk",90782401,[c7,c8,c3]);
        Usuario u6 = new Usuario("43117428J","Hannah","Ford",65,"Apartado núm.: 937, 445 Semper C.","Phasellus.elit.pede@lectusCum.org",28939847,[c9,c4]);
        Usuario u7 = new Usuario("35117554Q","Carl","Fowler",36,"321-5349 Vulputate C.","Proin@arcuimperdiet.net",41419586,[c25,c24]);
        Usuario u8 = new Usuario("54136748M","Harding","Franks",71,"935-8589 A Avenida","mi.Aliquam.gravida@lacusUt.net",12146367,[c10]);
        Usuario u9 = new Usuario("83145806D","Shoshana","Joyce",90,"880-3394 In Carretera","Mauris.eu.turpis@augueacipsum.org",21548203,[c23]);
        Usuario u10 = new Usuario("35500342P","Hamilton","Mcgowan",99,"Apartado núm.: 647, 190 Velit ","ipsum.ac@Vivamus.org",42160395,[c11]);
        Usuario u11 = new Usuario("47171447R","Briar","Franks",83,"Apdo.:952-8344 Malesuada Carretera","et.rutrum@commodoatlibero.net",26983897,[c12]);
        Usuario u12 = new Usuario("39897410T","Xenos","Calderon",20,"603 In C.","gravida@egetipsumDonec.org",10614294,[c13]);
        Usuario u13 = new Usuario("82545668W","Julian","Clements",33,"455-4836 Ante. C.","Fusce.dolor@sedfacilisis.edu",72347342,[c14]);
        Usuario u14 = new Usuario("77863158P","Leilani","Barnett",75,"888-9110 Urna. Avda.","eleifend.nec@sociis.co.uk",30916976,[c15]);
        Usuario u15 = new Usuario("18093847G","Jenette","Sims",61,"Apdo.:436-8148 Euismod Calle","turpis@Donec.ca",92648598,[c16]);
        Usuario u16 = new Usuario("17791361N","Dieter","Knapp",62,"Apdo.:789-6964 Vestibulum Ctra.","Cras.convallis.convallis@pedemalesuadavel.edu",53376837,[c17]);
        Usuario u17 = new Usuario("68163525V","Garrison","Vaughn",59,"Apdo.:335-159 Metus Calle","sed@quamdignissimpharetra.org",82503747,[c18]);
        Usuario u18 = new Usuario("93953253G","Barry","Vincent",51,"Apdo.:762-8794 Sodales C/","Cras@velturpisAliquam.ca",16829915,[c19]);
        Usuario u19 = new Usuario("30135317S","Christine","Howell",85,"Apartado núm.: 537, 7494 Eros Avda.","at@auctorodio.com",29147595,[c5,c20]);
        Usuario u20 = new Usuario("76450987Y","Stacey","Leblanc",90,"Apartado núm.: 549, 1019 Massa. Avda.","nec.mollis@nonquamPellentesque.co.uk",53205353,null);
        Usuario u21 = new Usuario("11085222F","Lamar","Rhodes",36,"Apdo.:843-2217 Adipiscing, Ctra.","Phasellus@eratnonummy.net",77637474,null);
        Usuario u22 = new Usuario("35673839Q","Lana","William",24,"Apdo.:842-5300 Auctor, Avenida","pede.Nunc@gravidasitamet.com",96596554,null);
        Usuario u23 = new Usuario("21790751U","Petra","Webster",40,"Apdo.:566-715 Tincidunt Av.","felis.Donec.tempor@dapibusligulaAliquam.org",51775546,null);
        Usuario u24 = new Usuario("87378151M","Naomi","Burks",94,"Apartado núm.: 849, 3933 A C.","Nam@magnaSuspendisse.com",70599279,null);
        Usuario u25 = new Usuario("76523395B","Quincy","Hendricks",63,"883-8999 Iaculis Avenida","mollis.vitae@insodaleselit.com",94709042,null);
        Usuario u26 = new Usuario("95188725O","Simone","Guerrero",85,"Apartado núm.: 883, 3352 Molestie Avda.","massa.rutrum@venenatis.co.uk",49155939,null);
        Usuario u27 = new Usuario("26498008U","Constance","Doyle",43,"258-460 In C/","ut.pellentesque@tristiquesenectus.com",27455365,null);
        Usuario u28 = new Usuario("26993236Q","Tanner","Carrillo",41,"6097 Magna Avenida","dui.lectus.rutrum@ametorci.org",44650355,null);
        Usuario u29 = new Usuario("98404251Y","Chastity","Sharp",30,"Apdo.:414-8312 Dapibus Avda.","Aenean@mauris.com",36387926,null);
        Usuario u30 = new Usuario("91785939B","Piper","Luna",54,"Apartado núm.: 141, 5522 Pellentesque Carretera","amet.nulla@Integer.edu",80953836,null);
        Usuario u31 = new Usuario("69071614T","Nathaniel","Duran",38,"Apartado núm.: 566, 3377 Sociis Avenida","arcu@bibendum.org",87252450,null);
        Usuario u32 = new Usuario("05385947Q","Montana","Bright",62,"7595 Tortor. C.","arcu.Vivamus.sit@pedeultricesa.org",58343383,null);
        Usuario u33 = new Usuario("40751123U","Damian","Cantrell",57,"Apartado núm.: 307, 1791 Non Avenida","mus@laoreet.edu",94129717,null);
        Usuario u34 = new Usuario("66219921M","Anjolie","Downs",44,"Apdo.:477-3224 Sed, C/","aliquam.eu.accumsan@amet.ca",29859260,null);
        Usuario u35 = new Usuario("84601348H","Hadassah","Collins",20,"Apartado núm.: 693, 326 Pede Avenida","amet.ultricies.sem@augue.edu",47336559,null);
        Usuario u36 = new Usuario("80650823K","Madaline","Medina",48,"8175 Risus. Carretera","enim.non@Sed.ca",35903450,null);
        Usuario u37 = new Usuario("34496433N","Lavinia","Chapman",47,"8294 Lorem C/","nibh@elitelitfermentum.com",71688238,null);
        Usuario u38 = new Usuario("60894540Y","Olivia","Daniels",46,"Apartado núm.: 875, 5346 Ipsum C.","Cras@doloregestas.edu",53392680,null);
        Usuario u39 = new Usuario("16492490D","Harriet","Church",89,"Apartado núm.: 904, 736 Duis C.","est@sagittis.co.uk",52506152,null);
        Usuario u40 = new Usuario("46149528F","Morgan","Oconnor",91,"594-2598 Justo C/","ipsum@id.ca",20838279,null);
        Usuario u41 = new Usuario("24659272D","Velma","Rasmussen",96,"362-797 Montes, Av.","Sed.et.libero@etmagna.edu",64628848,null);
        Usuario u42 = new Usuario("25377304E","Audrey","Love",73,"Apartado núm.: 444, 3933 Lectus Avenida","nec.mauris.blandit@nasceturridiculusmus.ca",14676774,null);
        Usuario u43 = new Usuario("65291361T","Wade","Wilder",50,"Apartado núm.: 755, 7066 Dictum C/","nec.leo@iaculis.com",68318364,null);
        Usuario u44 = new Usuario("32803411Q","Dahlia","Benson",80,"184-1331 Ac C.","elit@eu.com",17798794,null);
        Usuario u45 = new Usuario("11914045X","Morgan","Ferrell",47,"9925 Dapibus C/","diam@justosit.ca",81465617,null);
        Usuario u46 = new Usuario("49672036I","Dale","Carlson",49,"Apartado núm.: 445, 5753 Mi Carretera","convallis.in@egestasSed.com",31517681,null);
        Usuario u47 = new Usuario("28555428B","Bree","Dejesus",38,"Apartado núm.: 571, 8624 Diam ","ultricies@sagittis.org",40611643,null);
        Usuario u48 = new Usuario("51547731E","Benedict","Cohen",54,"Apdo.:927-1883 Elit. Calle","porta.elit.a@nec.ca",78691654,null);
        Usuario u49 = new Usuario("45968289Q","Patrick","Donaldson",34,"665-5600 Luctus Ctra.","odio@egetipsum.co.uk",86205108,null);
        Usuario u50 = new Usuario("18060706W","Aristotle","Pope",50,"Apartado núm.: 169, 8459 Non Avda.","tortor.at@afeugiat.edu",47919735,null);
        Usuario u51 = new Usuario("93031250Z","Yvette","Perez",26,"Apdo.:422-5255 Nec Avenida","vitae@temporest.net",91966150,null);
        Usuario u52 = new Usuario("18709711B","Claire","Ware",90,"Apdo.:899-7152 Sed Ctra.","Sed@neccursus.com",40401352,null);
        Usuario u53 = new Usuario("51121598S","Mariko","Higgins",43,"967-3426 Cras C/","vitae.sodales.nisi@Suspendissetristique.co.uk",96348918,null);
        Usuario u54 = new Usuario("26922526H","Jarrod","Hendrix",85,"Apdo.:827-8738 Magna. Calle","Pellentesque@idlibero.net",61181978,null);
        Usuario u55 = new Usuario("33714027T","Herman","Alvarado",92,"Apdo.:612-5570 In Avenida","ut.nulla.Cras@litoratorquent.ca",35892017,null);
        Usuario u56 = new Usuario("81206460R","Elmo","Bradshaw",86,"Apartado núm.: 471, 6862 Vulputate, Avda.","diam.eu.dolor@Nam.co.uk",98755881,null);
        Usuario u57 = new Usuario("72576823K","Louis","Houston",59,"Apdo.:803-6635 Donec C/","accumsan.neque.et@semvitaealiquam.co.uk",80199550,null);
        Usuario u58 = new Usuario("12144469Z","Lacota","Drake",68,"977-9667 Sed Avda.","dignissim.magna@elitpretium.org",68318364,null);
        Usuario u59 = new Usuario("23437337B","Zeus","Bell",32,"8086 Sit Calle","porttitor@mattis.org",23894777,null);
        Usuario u60 = new Usuario("03797706D","Alexis","Suarez",84,"6601 Mollis. Avda.","auctor.velit.eget@blanditNam.net",12371319,null);
        Usuario u61 = new Usuario("49725874Z","Thane","Randolph",19,"918-4559 Sit Avda.","magna@liberoProinmi.ca",87844028,null);
        Usuario u62 = new Usuario("98134017D","Stewart","Collins",76,"Apartado núm.: 520, 291 Lorem Av.","dolor.Quisque@nislarcuiaculis.org",10869113,null);
        Usuario u63 = new Usuario("10981441V","Rana","Pittman",60,"4926 Dolor, Ctra.","in.dolor@Quisquevarius.co.uk",74881211,null);
        Usuario u64 = new Usuario("47386336M","Elijah","Little",88,"746-1651 Ac Ctra.","gravida@adipiscingelitAliquam.ca",68760648,null);
        Usuario u65 = new Usuario("63031612B","Aubrey","Villarreal",76,"Apdo.:155-4141 Cursus Av.","vehicula.et@primisin.co.uk",14199793,null);
        Usuario u66 = new Usuario("75528204X","Hunter","Wise",46,"639-3275 Dui Carretera","nibh@nonmagna.ca",12309898,null);
        Usuario u67 = new Usuario("97303900N","Martin","Herrera",83,"Apdo.:584-4475 Ridiculus Avda.","odio.Nam.interdum@leoCras.net",69641263,null);
        Usuario u68 = new Usuario("93447059L","Erin","Hebert",68,"881-1247 Et Carretera","Aenean.eget@mifringilla.edu",46403076,null);
        Usuario u69 = new Usuario("12100825A","Isaiah","Britt",24,"373-1392 Posuere, Av.","lorem@adlitoratorquent.edu",94145503,null);
        Usuario u70 = new Usuario("39405336I","Stacey","Wiley",77,"Apartado núm.: 708, 4596 Montes, Ctra.","lorem.vitae.odio@odio.edu",88937008,null);
        Usuario u71 = new Usuario("27833423Z","Sharon","Whitney",78,"Apartado núm.: 488, 6733 Donec C/","eget.volutpat@tellus.co.uk",26309864,null);
        Usuario u72 = new Usuario("14303253H","Adrian","Barry",61,"414-3231 Varius Calle","nec.eleifend.non@Proinnon.ca",17985255,null);
        Usuario u73 = new Usuario("76143929F","Virginia","Bailey",60,"Apartado núm.: 530, 2383 Cubilia Avda.","Nulla.eu@rutrumnon.org",77727615,null);
        Usuario u74 = new Usuario("50891847J","Noah","Cooke",30,"868 Nibh. C/","enim.Curabitur.massa@scelerisque.net",92680671,null);
        Usuario u75 = new Usuario("25409886I","Kyle","Whitehead",29,"1040 Sit ","neque@facilisis.edu",51932384,null);
        Usuario u76 = new Usuario("63909981H","Carla","Stevens",53,"Apdo.:446-2015 Vestibulum. Avenida","diam@dictumultriciesligula.co.uk",93254675,null);
        Usuario u77 = new Usuario("76471511J","Kylan","Hodge",85,"245-8199 At Carretera","amet@nislQuisquefringilla.ca",38863315,null);
        Usuario u78 = new Usuario("32988101Y","Sade","William",35,"236-6144 Imperdiet Avda.","hendrerit.neque.In@maurisipsumporta.edu",80475381,null);
        Usuario u79 = new Usuario("68673043Z","Jennifer","Newton",66,"8899 Lorem, Av.","iaculis@Aliquam.net",42229825,null);
        Usuario u80 = new Usuario("49295372N","Dante","Watson",49,"423-1913 Eu Ctra.","Mauris@utdolordapibus.edu",79458273,null);
        Usuario u81 = new Usuario("90979900B","Casey","Fisher",75,"Apdo.:585-8624 Est. ","nulla.at@amet.net",38182395,null);
        Usuario u82 = new Usuario("79564421E","Barry","Higgins",30,"Apdo.:870-7766 Urna C.","risus@ametconsectetuer.ca",87945347,null);
        Usuario u83 = new Usuario("31221494M","Reuben","Ellison",69,"273-842 Cras Avda.","dui.lectus@pedeCumsociis.net",17698360,null);
        Usuario u84 = new Usuario("65614951X","Charlotte","Moody",30,"2123 Orci ","diam.vel@MaurismagnaDuis.edu",65534045,null);
        Usuario u85 = new Usuario("20222669G","Indigo","Burris",66,"Apdo.:972-1845 Risus, Carretera","nec.urna@felisegetvarius.ca",85778201,null);
        Usuario u86 = new Usuario("21577440Q","Inga","Mathews",77,"5530 Lacus. Calle","enim.condimentum@aliquamiaculis.net",18395395,null);
        Usuario u87 = new Usuario("77891270X","Savannah","Jarvis",36,"Apartado núm.: 338, 9073 Eget Av.","egestas.hendrerit.neque@Pellentesque.net",63607447,null);
        Usuario u88 = new Usuario("23872604V","Hedwig","Day",41,"286-5159 Mauris. Av.","sed.orci.lobortis@Suspendisseacmetus.edu",18496414,null);
        Usuario u89 = new Usuario("75253819W","Ursa","Whitaker",91,"3138 Lobortis Carretera","pede.nec@etrutrumeu.ca",50330336,null);
        Usuario u90 = new Usuario("70043533H","Jerry","Carney",36,"Apartado núm.: 839, 1782 Magna C/","et.nunc@sitametmassa.org",14473027,null);
        Usuario u91 = new Usuario("23626725D","Kirestin","Lawrence",75,"715-9276 Eu Avenida","diam.Duis@sempereratin.edu",14501979,null);
        Usuario u92 = new Usuario("61382122I","Winifred","Ortega",33,"1321 Quis C/","lectus@aceleifend.org",44969650,null);
        Usuario u93 = new Usuario("25126298D","Burke","Bass",73,"Apartado núm.: 639, 5913 Quam ","pellentesque.massa.lobortis@Quisquepurussapien.edu",25424883,null);
        Usuario u94 = new Usuario("22194908N","Jasmine","Delacruz",30,"Apartado núm.: 416, 6347 Tempus C.","diam@Morbi.edu",34966081,null);
        Usuario u95 = new Usuario("87501370K","Briar","Sweet",18,"270-8870 Velit ","Suspendisse.aliquet.sem@orciluctuset.edu",31535747,null);
        Usuario u96 = new Usuario("57670909V","Dennis","Avila",40,"Apdo.:430-3864 Quis Ctra.","Aliquam.ornare.libero@seddui.ca",61228584,null);
        Usuario u97 = new Usuario("59266254I","Urielle","Reyes",24,"6709 Facilisi. C/","viverra.Maecenas@mollisneccursus.org",86456180,null);
        Usuario u98 = new Usuario("71056385F","Ella","Chen",99,"Apartado núm.: 520, 6796 Eu Carretera","et@eu.net",46737107,null);
        Usuario u99 = new Usuario("94059211M","Jenette","Monroe",90,"7352 Laoreet, Avda.","urna.suscipit.nonummy@facilisisfacilisismagna.ca",61406530,null);

    }




}
