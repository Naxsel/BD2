package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Set;

/**
 * Created by naxsel on 18/04/16.
 */

@Entity(name = "CAhorro_p4")
public class CAhorro extends Cuenta {

    public CAhorro(String iban, String numCuenta, String creacion, double saldo, Set<Usuario> arrayUsuarios, Set<Operacion> arrayOperaciones,double interes, int dia) {
        super( iban,  numCuenta,  creacion,  saldo,arrayUsuarios,arrayOperaciones);
        this.interes = interes;
        this.dia = dia;
    }

    public CAhorro() {

    }

    @Column(name = "interes")
    private double interes;

    @Column(name = "dia")
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
}
