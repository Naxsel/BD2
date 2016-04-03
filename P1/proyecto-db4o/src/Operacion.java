import com.db4o.ObjectContainer;

import java.util.Date;

public class Operacion {
    private int contador;
    private String tipo;
    private String fechaHora;
    private String cOrigen;
    private String cDestino;
    private String sucursal;
    private String concepto;
    private double cantidad;

    public Operacion(int contador, String tipo, String fechaHora, String cOrigen, String cDestino, String sucursal, String concepto, double cantidad) {
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

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
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

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "contador=" + contador +
                ", tipo='" + tipo + '\'' +
                ", fechaHora='" + fechaHora + '\'' +
                ", cOrigen='" + cOrigen + '\'' +
                ", cDestino='" + cDestino + '\'' +
                ", sucursal='" + sucursal + '\'' +
                ", concepto='" + concepto + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
