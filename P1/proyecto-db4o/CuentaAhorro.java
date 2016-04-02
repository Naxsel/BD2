import java.util.Date;

public class CuentaAhorro extends Cuenta {
    private double interes;
    private int dia;

    public CuentaAhorro(String iban, String numero, Date creacion, double saldo, int[] listaOperaciones, double interes, int dia) {
        super(iban, numero, creacion, saldo, listaOperaciones);
        this.interes = interes;
        this.dia = dia;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "interes=" + interes +
                ", dia=" + dia +
                '}';
    }
}
