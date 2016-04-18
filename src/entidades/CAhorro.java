package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by naxsel on 18/04/16.
 */

@Entity(name = "CAhorro")
public class CAhorro extends Cuenta {

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
