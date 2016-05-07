package parte2;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name="OPERACION_P1")
public class Operacion implements Serializable{

    public Operacion(idOperacion id, String tipo, Timestamp fecha, Cuenta cDestino, Oficina oficinaOperacion, double cantidad, String concepto) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.cDestino = cDestino;
        this.oficinaOperacion = oficinaOperacion;
        this.cantidad = cantidad;
        this.concepto = concepto;
    }

    public Operacion() { }

    @EmbeddedId
    private idOperacion id;

    @ManyToOne
    @JoinColumn(name = "iban",nullable = false)
    @MapsId("iban2")
    private Cuenta iban;

    @Column(name = "TIPO",nullable = false)
    private String tipo;

    @Column(name = "FECHAHORA",nullable = false)
    private Timestamp fecha;

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

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public idOperacion getId() {
        return id;
    }

    public void setId(idOperacion id) {
        this.id = id;
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
                "id=" + id +
                ", iban=" + iban +
                ", tipo='" + tipo + '\'' +
                ", fecha=" + fecha +
                ", cantidad=" + cantidad +
                ", concepto='" + concepto + '\'' +
                ", cDestino=" + cDestino +
                ", oficinaOperacion=" + oficinaOperacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operacion operacion = (Operacion) o;

        if (Double.compare(operacion.cantidad, cantidad) != 0) return false;
        if (id != null ? !id.equals(operacion.id) : operacion.id != null) return false;
        if (iban != null ? !iban.equals(operacion.iban) : operacion.iban != null) return false;
        if (tipo != null ? !tipo.equals(operacion.tipo) : operacion.tipo != null) return false;
        if (fecha != null ? !fecha.equals(operacion.fecha) : operacion.fecha != null) return false;
        if (concepto != null ? !concepto.equals(operacion.concepto) : operacion.concepto != null) return false;
        if (cDestino != null ? !cDestino.equals(operacion.cDestino) : operacion.cDestino != null) return false;
        return oficinaOperacion != null ? oficinaOperacion.equals(operacion.oficinaOperacion) : operacion.oficinaOperacion == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (iban != null ? iban.hashCode() : 0);
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        temp = Double.doubleToLongBits(cantidad);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (concepto != null ? concepto.hashCode() : 0);
        result = 31 * result + (cDestino != null ? cDestino.hashCode() : 0);
        result = 31 * result + (oficinaOperacion != null ? oficinaOperacion.hashCode() : 0);
        return result;
    }
}
