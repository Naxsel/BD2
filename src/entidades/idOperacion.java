package entidades;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * Created by anicacortes on 18/04/2016.
 */
public class idOperacion implements Serializable {

    private Cuenta iban;

    private int contador;

    public idOperacion(Cuenta iban, int contador) {
        this.iban = iban;
        this.contador = contador;
    }
}
