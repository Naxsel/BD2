package entidades;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by naxsel on 18/04/16.
 */
public class Cuenta {

    @Id
    @Column(name = "IBAN", nullable = false, length = 10)
    private String dni;

    @Column(name = "ncuenta", nullable = false, length = 30)
    private String nombre;

    @Column(name = "creacion", nullable = false, length = 80)
    private String apellidos;

    @Column(name = "saldo", nullable = false, length = 3)
    private int edad;

}
