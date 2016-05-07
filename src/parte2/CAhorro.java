package parte2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Calendar;
import java.util.Set;

@Entity
@Table(name="CAHORRO_P1")
@PrimaryKeyJoinColumn(name="IBAN")
public class CAhorro extends Cuenta {

    public CAhorro(String iban, String numCuenta, Calendar creacion, double saldo, Set<Usuario> arrayUsuarios, Set<Operacion> arrayOperaciones, double interes, int dia) {
        super( iban,  numCuenta,  creacion,  saldo,arrayUsuarios,arrayOperaciones);
        this.interes = interes;
        this.dia = dia;
    }

    public CAhorro() {    }

    @Column(name = "INTERES")
    private double interes;

    @Column(name = "DIA")
    private int dia;

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
        return "CAhorro{" +
                "interes=" + interes +
                ", dia=" + dia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CAhorro cAhorro = (CAhorro) o;

        if (Double.compare(cAhorro.interes, interes) != 0) return false;
        return dia == cAhorro.dia;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(interes);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + dia;
        return result;
    }
}
