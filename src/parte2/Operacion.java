package parte2;

import oracle.sql.DATE;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="OPERACION_P1")
@IdClass(idOperacion.class)
public class Operacion implements Serializable{

    public Operacion(Cuenta iban, int contador, String tipo, Date fecha, Cuenta cDestino, Oficina oficinaOperacion, double cantidad, String concepto) {
        this.iban = iban;
        this.contador = contador;
        this.tipo = tipo;
        this.fecha = fecha;
        this.cDestino = cDestino;
        this.oficinaOperacion = oficinaOperacion;
        this.cantidad = cantidad;
        this.concepto = concepto;
    }

    @Id
    @ManyToOne
    @JoinColumn(name = "IBAN",nullable = false)
    private Cuenta iban;

    @Id
    @Column(name = "CONTADOR",nullable = false)
    private int contador;

    @Column(name = "TIPO",nullable = false)
    private String tipo;

    @Column(name = "FECHAHORA",nullable = false)
    private Date fecha;

    @Column(name = "CANTIDAD",nullable = false)
    private double cantidad;

    @Column(name = "CONCEPTO",nullable = false, length = 200)
    private String concepto;

    @ManyToOne
    @JoinColumn(name = "CDESTINO",nullable = false)
    private Cuenta cDestino;

    @ManyToOne
    @JoinColumn(name = "SUCURSAL",nullable = false)
    private Oficina oficinaOperacion;

    public Cuenta getIban() {
        return iban;
    }

    public void setIban(Cuenta iban) {
        this.iban = iban;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cuenta getcDestino() {
        return cDestino;
    }

    public void setcDestino(Cuenta cDestino) {
        this.cDestino = cDestino;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Oficina getOficinaOperacion() {
        return oficinaOperacion;
    }

    public void setOficinaOperacion(Oficina oficinaOperacion) {
        this.oficinaOperacion = oficinaOperacion;
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "iban='" + iban + '\'' +
                ", contador='" + contador + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fecha=" + fecha +
                ", cDestino='" + cDestino + '\'' +
                ", cantidad=" + cantidad +
                ", concepto='" + concepto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operacion operacion = (Operacion) o;

        if (contador != operacion.contador) return false;
        if (Double.compare(operacion.cantidad, cantidad) != 0) return false;
        if (!iban.equals(operacion.iban)) return false;
        if (tipo != null ? !tipo.equals(operacion.tipo) : operacion.tipo != null) return false;
        if (fecha != null ? !fecha.equals(operacion.fecha) : operacion.fecha != null) return false;
        if (cDestino != null ? !cDestino.equals(operacion.cDestino) : operacion.cDestino != null) return false;
        if (oficinaOperacion != null ? !oficinaOperacion.equals(operacion.oficinaOperacion) : operacion.oficinaOperacion != null)
            return false;
        return concepto != null ? concepto.equals(operacion.concepto) : operacion.concepto == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = iban.hashCode();
        result = 31 * result + contador;
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (cDestino != null ? cDestino.hashCode() : 0);
        result = 31 * result + (oficinaOperacion != null ? oficinaOperacion.hashCode() : 0);
        temp = Double.doubleToLongBits(cantidad);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (concepto != null ? concepto.hashCode() : 0);
        return result;
    }
}
