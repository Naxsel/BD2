package entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity(name = "Operacion_p4")
@IdClass(idOperacion.class)
public class Operacion implements Serializable{

    public Operacion(Cuenta iban, int contador, String tipo, Calendar fecha, String hora, Cuenta cDestino, Oficina oficinaOperacion, double cantidad, String concepto) {
        this.iban = iban;
        this.contador = contador;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.cDestino = cDestino;
        this.oficinaOperacion = oficinaOperacion;
        this.cantidad = cantidad;
        this.concepto = concepto;
    }

    public Operacion() {

    }

    @Id
    @ManyToOne
    @JoinColumn(name = "iban",nullable = false)
    private Cuenta iban;

    @Id
    @Column(name = "contador",nullable = false)
    private int contador;


    @Column(name = "tipo",nullable = false)
    private String tipo;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha",nullable = false)
    private Calendar fecha;

    @Column(name = "hora",nullable = false)
    private String hora;

    @ManyToOne
    private Oficina oficinaOperacion;

    @Column(name = "cantidad",nullable = false)
    private double cantidad;

    @Column(name = "concepto",nullable = false, length = 200)
    private String concepto;

    @ManyToOne
    @JoinColumn(name = "cDestino",nullable = false)
    private Cuenta cDestino;

    public Cuenta getIban() {
        return iban;
    }

    public void setIban(Cuenta iban) {
        this.iban = iban;
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

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operacion operacion = (Operacion) o;

        if (contador != operacion.contador) return false;
        if (Double.compare(operacion.cantidad, cantidad) != 0) return false;
        if (iban != null ? !iban.equals(operacion.iban) : operacion.iban != null) return false;
        if (tipo != null ? !tipo.equals(operacion.tipo) : operacion.tipo != null) return false;
        if (fecha != null ? !fecha.equals(operacion.fecha) : operacion.fecha != null) return false;
        if (hora != null ? !hora.equals(operacion.hora) : operacion.hora != null) return false;
        if (oficinaOperacion != null ? !oficinaOperacion.equals(operacion.oficinaOperacion) : operacion.oficinaOperacion != null)
            return false;
        if (concepto != null ? !concepto.equals(operacion.concepto) : operacion.concepto != null) return false;
        return cDestino != null ? cDestino.equals(operacion.cDestino) : operacion.cDestino == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = iban != null ? iban.hashCode() : 0;
        result = 31 * result + contador;
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (hora != null ? hora.hashCode() : 0);
        result = 31 * result + (oficinaOperacion != null ? oficinaOperacion.hashCode() : 0);
        temp = Double.doubleToLongBits(cantidad);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (concepto != null ? concepto.hashCode() : 0);
        result = 31 * result + (cDestino != null ? cDestino.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "iban=" + iban +
                ", contador=" + contador +
                ", tipo='" + tipo + '\'' +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", oficinaOperacion=" + oficinaOperacion +
                ", cantidad=" + cantidad +
                ", concepto='" + concepto + '\'' +
                ", cDestino=" + cDestino +
                '}';
    }
}
