package entidades;

import javax.persistence.*;
import java.io.Serializable;

public class idOperacion implements Serializable {

    public idOperacion(Cuenta iban, int contador) {
        this.iban = iban;
        this.contador = contador;
    }
    public idOperacion() {

    }

    @ManyToOne
    @JoinColumn(name = "iban",nullable = false)
    private Cuenta iban;

    @Column(name = "contador",nullable = false)
    private int contador;

    public Cuenta getIban() {
        return iban;
    }


    public int getContador() {
        return contador;
    }


    @Override
    public String toString() {
        return "idOperacion{" +
                "iban2=" + iban +
                ", contador=" + contador +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        idOperacion that = (idOperacion) o;

        if (contador != that.contador) return false;
        return iban != null ? iban.equals(that.iban) : that.iban == null;

    }

    @Override
    public int hashCode() {
        int result = iban != null ? iban.hashCode() : 0;
        result = 31 * result + contador;
        return result;
    }
}
