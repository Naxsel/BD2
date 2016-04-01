import java.util.Date;

public class Cuenta {

    private String iban;
    private String numero;
    private Date creacion;
    private double saldo;
    private int[] listaOperaciones;

    public Cuenta(String iban, String numero, Date creacion, double saldo, int[] listaOperaciones) {
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

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int[] getListaOperaciones() {
        return listaOperaciones;
    }

    public void setListaOperaciones(int[] listaOperaciones) {
        this.listaOperaciones = listaOperaciones;
    }
}
