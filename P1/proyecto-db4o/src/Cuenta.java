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
}
