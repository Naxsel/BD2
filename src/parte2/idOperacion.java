package parte2;

import java.io.Serializable;

public class idOperacion implements Serializable {

    private Cuenta iban;

    private int contador;

    public idOperacion(Cuenta iban, int contador) {
        this.iban = iban;
        this.contador = contador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        idOperacion that = (idOperacion) o;

        if (contador != that.contador) return false;
        return iban.equals(that.iban);

    }

    @Override
    public int hashCode() {
        int result = iban.hashCode();
        result = 31 * result + contador;
        return result;
    }
}
