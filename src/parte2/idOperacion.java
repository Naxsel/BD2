package parte2;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class idOperacion implements Serializable {

    public idOperacion(Cuenta iban, int contador) {
        this.iban2 = iban;
        this.contador = contador;
    }

    public idOperacion() { }

    @ManyToOne
    @JoinColumn(name = "iban",nullable = false)
    private Cuenta iban2;

    @Column(name = "contador",nullable = false)
    private int contador;

    @Override
    public String toString() {
        return "idOperacion{" +
                "iban2=" + iban2 +
                ", contador=" + contador +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        idOperacion that = (idOperacion) o;

        if (contador != that.contador) return false;
        return iban2.equals(that.iban2);

    }

    @Override
    public int hashCode() {
        int result = iban2.hashCode();
        result = 31 * result + contador;
        return result;
    }
}
