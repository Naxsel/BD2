import java.util.Arrays;

public class Cuenta {

    private String iban;
    private String numero;
    private String creacion;
    private double saldo;
    private Operacion[] listaOperaciones;

    public Cuenta(String iban, String numero, String creacion, double saldo, Operacion[] listaOperaciones) {
        this.iban = iban;
        this.numero = numero;
        this.creacion = creacion;
        this.saldo = saldo;
        this.listaOperaciones = listaOperaciones;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCreacion() {
        return creacion;
    }

    public void setCreacion(String creacion) {
        this.creacion = creacion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Operacion[] getListaOperaciones() {
        return listaOperaciones;
    }

    public void setListaOperaciones(Operacion[] listaOperaciones) {
        this.listaOperaciones = listaOperaciones;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + iban + '\'' +
                ", numero='" + numero + '\'' +
                ", creacion=" + creacion +
                ", saldo=" + saldo +
                ", listaOperaciones=" + Arrays.toString(listaOperaciones) +
                '}';
    }

    public static void crearCuentas() {

        Cuenta c1 = new Cuenta("WL20881903893391450526693915360220","VX531536933708406882147414","2015-09-02",912.00,[op11,op12,op13,op14,op15,op16,op17,op18,op19,op20,op21,op22,op23,op24]);
        Cuenta c2 = new Cuenta("NY32322508338458522212255405176655","RR826595373156207313455541","2015-08-31",177.00,null);
        Cuenta c3 = new Cuenta("PF95812037075358869290733997999561","PK846216889247910450214543","2015-05-08",628.00,null);
        Cuenta c4 = new Cuenta("NA82264457381598741989494683817690","GM079750915370909510351058","2016-10-02",1013.00,null);
        Cuenta c5 = new Cuenta("BY10087113578567912692979144432606","DA442510510273806814083072","2015-05-14",1559.00,[o27,op28,op29,op30,op31,op32,op33,op34,op35,op36,op37,op38,op39,op40]);

        CuentaAhorro c21 = new CuentaAhorro("FP33730958577227579078926552917807","ZP918886081013488002618758","2016-03-03",11.58,[op1,op2,op3,op4,op5,op6,op7,op8,op9,op10],2.00,10);
        CuentaAhorro c22 = new CuentaAhorro("JI40453364997466550044235348213144","TL198715503499491378322716","2016-08-17",1412.00,[op1,op2,op3,op4,op5,op6,op7,op8,op9,op10],3.00,1);
        CuentaAhorro c23 = new CuentaAhorro("BI93137422139573451319199350680286","EE299356485493716017660928","2016-05-26",755.00,null,3.00,22);
        CuentaAhorro c24 = new CuentaAhorro("HL76676038213950241779936041435785","PG652702401877598541560408","2015-03-07",244.00,null,2.00,31);
        CuentaAhorro c25 = new CuentaAhorro("OR88691482977841194690319235692353","QT312136665216734233119162","2016-11-07",1749.00,null,2.00,22);
        CuentaAhorro c6 = new CuentaAhorro("BD19607765245983312200917823690887","YE869232102933034067936432","2015-07-25",1833.00,null,2.00,28);
        CuentaAhorro c7 = new CuentaAhorro("TC21975092033903028935377885821921","HR037014073555255719289233","2015-04-06",106.00,null,3.00,22);
        CuentaAhorro c8 = new CuentaAhorro("HR80011754363760623558518621971359","HJ971697288847463286863263","2016-06-01",144.00,null,1.00,25);
        CuentaAhorro c9 = new CuentaAhorro("RJ82870931752843605801348664024434","SB526752601132090401954533","2017-01-07",48.804,null,2.00,12);
        CuentaAhorro c10 = new CuentaAhorro("OA95633548864133819790922760765435","FJ286614168064820794516468","2016-06-11",1051.00,null,1.00,14);
        CuentaAhorro c11 = new CuentaAhorro("VX49974070678271238458117005418174","GZ432666518927849895424020","2015-12-03",1201.00,[op11,op12,op13,op14,op15,op16,op17,op18,op19,op20,op21,op22,op23,op24,op24,op26],3.00,15);
        CuentaAhorro c12 = new CuentaAhorro("EO98500155929072427788207743122255","VL496402362803874524565269","2016-04-28",1571.00,null,2.00,16);
        CuentaAhorro c13 = new CuentaAhorro("PE02267316774640124817561016121571","ZD453142449199799701677112","2016-11-29",1306.00,null,2.00,22);
        CuentaAhorro c14 = new CuentaAhorro("MC34720153034518480223567180403259","GG922143906581198355966864","2015-04-09",105.00,null,3.00,24);
        CuentaAhorro c15 = new CuentaAhorro("II19860669879734995631145967201418","PJ756750701024185226709392","2016-04-28",1190.00,null,3.00,22);
        CuentaAhorro c16 = new CuentaAhorro("WR03493457992206687764115095160218","IC118308343326727962867448","2015-03-22",1815.00,null,1.00,29);
        CuentaAhorro c17 = new CuentaAhorro("CZ11209217849850715441903620157354","SS239129970185176003543174","2016-11-07",1556.00,null,3.00,30);
        CuentaAhorro c18 = new CuentaAhorro("AR32595816696735123283490230286479","WK064201260459574786685201","2015-12-31",832.00,[op41,op42,op43,op44,op45,op46,op47,op48,op49,op50,op51,op52,op53,op54,op55],3.00,5);
        CuentaAhorro c19 = new CuentaAhorro("PA57877801854929214196122747132446","RD552668092213034380759678","2016-03-15",1067.00,null,2.00,3);
        CuentaAhorro c20 = new CuentaAhorro("AG22068521770637896137627734009238","ZI551737991879785552530525","2015-07-26",937.00,null,1.00,2);
    }
}
