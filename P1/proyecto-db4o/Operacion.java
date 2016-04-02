import com.db4o.ObjectContainer;

import java.util.Date;

public class Operacion {
    private int contador;
    private String tipo;
    private Date fechaHora;
    private String cOrigen;
    private String cDestino;
    private String sucursal;
    private String concepto;
    private int cantidad;

    public Operacion(int contador, String tipo, Date fechaHora, String cOrigen, String cDestino, String sucursal, String concepto, int cantidad) {
        this.contador = contador;
        this.tipo = tipo;
        this.fechaHora = fechaHora;
        this.cOrigen = cOrigen;
        this.cDestino = cDestino;
        this.sucursal = sucursal;
        this.concepto = concepto;
        this.cantidad = cantidad;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getcOrigen() {
        return cOrigen;
    }

    public void setcOrigen(String cOrigen) {
        this.cOrigen = cOrigen;
    }

    public String getcDestino() {
        return cDestino;
    }

    public void setcDestino(String cDestino) {
        this.cDestino = cDestino;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public void crearOperacion(ObjectContainer obj) {
        Operacion op1 = new Operacion(1,'transferencia',TO_DATE('2014-10-20 08:13:00', 'yyyy-mm-dd HH24:MI:SS'),'FP33730958577227579078926552917807','JI40453364997466550044235348213144','','','100.00');
        Operacion op2 = new Operacion(2,'transferencia',TO_DATE('2009-03-19 02:59:00', 'yyyy-mm-dd HH24:MI:SS'),'FP33730958577227579078926552917807','JI40453364997466550044235348213144','','','100.00');
        Operacion op3 = new Operacion(3,'transferencia',TO_DATE('2008-10-04 17:28:00', 'yyyy-mm-dd HH24:MI:SS'),'FP33730958577227579078926552917807','JI40453364997466550044235348213144','','','100.00');
        Operacion op4 = new Operacion(4,'transferencia',TO_DATE('2008-12-29 02:24:00', 'yyyy-mm-dd HH24:MI:SS'),'FP33730958577227579078926552917807','JI40453364997466550044235348213144','','','100.00');
        Operacion op5 = new Operacion(5,'transferencia',TO_DATE('2012-08-20 15:50:00', 'yyyy-mm-dd HH24:MI:SS'),'FP33730958577227579078926552917807','JI40453364997466550044235348213144','','','100.00');
        Operacion op6 = new Operacion(6,'transferencia',TO_DATE('2012-10-13 09:28:00', 'yyyy-mm-dd HH24:MI:SS'),'FP33730958577227579078926552917807','JI40453364997466550044235348213144','','','100.00');
        Operacion op7 = new Operacion(7,'transferencia',TO_DATE('2008-07-22 03:32:00', 'yyyy-mm-dd HH24:MI:SS'),'FP33730958577227579078926552917807','JI40453364997466550044235348213144','','','100.00');
        Operacion op8 = new Operacion(8,'transferencia',TO_DATE('2013-08-16 05:15:00', 'yyyy-mm-dd HH24:MI:SS'),'FP33730958577227579078926552917807','JI40453364997466550044235348213144','','','100.00');
        Operacion op9 = new Operacion(9,'transferencia',TO_DATE('2013-05-31 13:26:00', 'yyyy-mm-dd HH24:MI:SS'),'FP33730958577227579078926552917807','JI40453364997466550044235348213144','','','100.00');
        Operacion op10 = new Operacion(10,'transferencia',TO_DATE('2014-06-06 20:20:00', 'yyyy-mm-dd HH24:MI:SS'),'FP33730958577227579078926552917807','JI40453364997466550044235348213144','','','100.00');
        Operacion op11 = new Operacion(11,'transferencia',TO_DATE('2006-05-05 14:01:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op12 = new Operacion(12,'transferencia',TO_DATE('2011-05-29 22:12:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op13 = new Operacion(13,'transferencia',TO_DATE('2011-07-04 11:43:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op14 = new Operacion(14,'transferencia',TO_DATE('2010-05-08 15:14:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op15 = new Operacion(15,'transferencia',TO_DATE('2014-06-23 08:27:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op16 = new Operacion(16,'transferencia',TO_DATE('2014-01-15 11:21:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op17 = new Operacion(17,'transferencia',TO_DATE('2007-12-13 16:22:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op18 = new Operacion(18,'transferencia',TO_DATE('2009-03-03 14:48:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op19 = new Operacion(19,'transferencia',TO_DATE('2006-05-31 13:07:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op20 = new Operacion(20,'transferencia',TO_DATE('2011-01-05 23:14:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op21 = new Operacion(21,'transferencia',TO_DATE('2012-02-19 07:28:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op22 = new Operacion(22,'transferencia',TO_DATE('2009-06-21 20:52:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op23 = new Operacion(23,'transferencia',TO_DATE('2012-05-08 23:33:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op24 = new Operacion(24,'transferencia',TO_DATE('2011-12-18 16:10:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','WL20881903893391450526693915360220','','','25.00');
        Operacion op25 = new Operacion(25,'transferencia',TO_DATE('2014-08-19 03:59:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','VX49974070678271238458117005418174','','','25.00');
        Operacion op26 = new Operacion(26,'transferencia',TO_DATE('2008-06-17 19:43:00', 'yyyy-mm-dd HH24:MI:SS'),'VX49974070678271238458117005418174','VX49974070678271238458117005418174','','','25.00');
        Operacion op27 = new Operacion(27,'ingreso',TO_DATE('2009-05-09 08:34:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op28 = new Operacion(28,'ingreso',TO_DATE('2011-10-15 11:49:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op29 = new Operacion(29,'ingreso',TO_DATE('2013-10-07 10:11:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op30 = new Operacion(30,'ingreso',TO_DATE('2008-09-26 12:10:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op31 = new Operacion(31,'ingreso',TO_DATE('2016-01-04 19:48:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op32 = new Operacion(32,'ingreso',TO_DATE('2007-12-01 13:38:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op33 = new Operacion(33,'ingreso',TO_DATE('2014-10-25 15:07:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op34 = new Operacion(34,'ingreso',TO_DATE('2008-03-25 08:14:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op35 = new Operacion(35,'ingreso',TO_DATE('2012-08-12 08:27:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op36 = new Operacion(36,'ingreso',TO_DATE('2015-05-24 17:20:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op37 = new Operacion(37,'ingreso',TO_DATE('2005-06-06 00:40:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op38 = new Operacion(38,'ingreso',TO_DATE('2014-03-08 01:31:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op39 = new Operacion(39,'ingreso',TO_DATE('2011-07-06 19:05:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op40 = new Operacion(40,'ingreso',TO_DATE('2013-05-18 21:45:00', 'yyyy-mm-dd HH24:MI:SS'),'BY10087113578567912692979144432606','BY10087113578567912692979144432606','cajero 25','','50.00');
        Operacion op41 = new Operacion(41,'retirada',TO_DATE('2012-12-14 14:05:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op42 = new Operacion(42,'retirada',TO_DATE('2014-04-18 12:33:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op43 = new Operacion(43,'retirada',TO_DATE('2014-11-04 18:03:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op44 = new Operacion(44,'retirada',TO_DATE('2014-08-21 22:40:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op45 = new Operacion(45,'retirada',TO_DATE('2011-11-29 02:40:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op46 = new Operacion(46,'retirada',TO_DATE('2007-09-21 00:43:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op47 = new Operacion(47,'retirada',TO_DATE('2009-12-03 04:00:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op48 = new Operacion(48,'retirada',TO_DATE('2009-04-01 04:47:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op49 = new Operacion(49,'retirada',TO_DATE('2006-11-30 19:54:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op50 = new Operacion(50,'retirada',TO_DATE('2012-05-13 21:12:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op51 = new Operacion(51,'retirada',TO_DATE('2015-09-18 23:49:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op52 = new Operacion(52,'retirada',TO_DATE('2010-03-27 22:16:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op53 = new Operacion(53,'retirada',TO_DATE('2007-07-16 09:25:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op54 = new Operacion(54,'retirada',TO_DATE('2015-03-04 04:12:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');
        Operacion op55 = new Operacion(55,'retirada',TO_DATE('2007-04-30 20:31:00', 'yyyy-mm-dd HH24:MI:SS'),'AR32595816696735123283490230286479','AR32595816696735123283490230286479','cajero 51','','25.00');

    }
}
