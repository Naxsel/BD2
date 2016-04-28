package parte2;

import oracle.sql.DATE;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="OPERACION_P1")
@IdClass(idOperacion.class)
public class Operacion implements Serializable{

    public Operacion(Cuenta iban, String contador, String tipo, DATE fecha, String hora, Cuenta cDestino, Oficina oficinaOperacion, double cantidad, String concepto) {
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

    @Id
    @ManyToOne
    @JoinColumn(name = "iban",nullable = false)
    private Cuenta iban;

    @Id
    @Column(name = "contador",nullable = false)
    private String contador;

    @Column(name = "tipo",nullable = false)
    private String tipo;

    @Column(name = "fecha",nullable = false)
    private DATE fecha;

    @Column(name = "hora",nullable = false)
    private String hora;

    @ManyToOne
    @JoinColumn(name = "cDestino",nullable = false)
    private Cuenta cDestino;

    @ManyToOne
    private Oficina oficinaOperacion;

    @Column(name = "cantidad",nullable = false)
    private double cantidad;

    @Column(name = "concepto",nullable = false, length = 200)
    private String concepto;

    public Cuenta getIban() {
        return iban;
    }

    public void setIban(Cuenta iban) {
        this.iban = iban;
    }

    public String getContador() {
        return contador;
    }

    public void setContador(String contador) {
        this.contador = contador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public DATE getFecha() {
        return fecha;
    }

    public void setFecha(DATE fecha) {
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
    public String toString() {
        return "Operacion{" +
                "iban='" + iban + '\'' +
                ", contador='" + contador + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
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

        if (iban != null ? !iban.equals(operacion.iban) : operacion.iban != null) return false;
        return contador != null ? contador.equals(operacion.contador) : operacion.contador == null;

    }

    @Override
    public int hashCode() {
        int result = iban != null ? iban.hashCode() : 0;
        result = 31 * result + (contador != null ? contador.hashCode() : 0);
        return result;
    }
}
