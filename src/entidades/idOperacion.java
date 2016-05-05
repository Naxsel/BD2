package entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by anicacortes on 18/04/2016.
 */
@Embeddable
public class idOperacion implements Serializable {

    public idOperacion(Cuenta iban, int contador) {
        this.iban2 = iban;
        this.contador = contador;
    }

    //@Id
    @ManyToOne
    @JoinColumn(name = "iban",nullable = false)
    private Cuenta iban2;

    //@Id
    @Column(name = "contador",nullable = false)
    private int contador;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        idOperacion that = (idOperacion) o;

        if (contador != that.contador) return false;
        return iban2 != null ? iban2.equals(that.iban2) : that.iban2 == null;

    }

    @Override
    public int hashCode() {
        int result = iban2 != null ? iban2.hashCode() : 0;
        result = 31 * result + contador;
        return result;
    }
}
