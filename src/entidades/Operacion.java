package entidades;

import oracle.sql.DATE;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by anicacortes on 18/04/2016.
 */
@Entity
@IdClass(idOperacion.class)
public class Operacion implements Serializable{

    @Id
    @ManyToOne
    @Column(name = "iban",nullable = false, length = 34)
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
    @Column(name = "cDestino",nullable = false, length = 34)
    private Cuenta cDestino;

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


}
