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

    @Override
    public String toString() {
        return "Operacion{" +
                "contador=" + contador +
                ", tipo='" + tipo + '\'' +
                ", fechaHora=" + fechaHora +
                ", cOrigen='" + cOrigen + '\'' +
                ", cDestino='" + cDestino + '\'' +
                ", sucursal='" + sucursal + '\'' +
                ", concepto='" + concepto + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
