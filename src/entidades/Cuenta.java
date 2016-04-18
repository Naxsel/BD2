package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

/**
 * Created by naxsel on 18/04/16.
 */
@Entity(name = "CUENTA")
public class Cuenta {


    private Set<Cliente> arrayClientes;

    @ManyToMany(mappedBy = "clientes")
    public Set<Cliente> getArrayClientes() {
        return arrayClientes;
    }

    public void setArrayClientes(Set<Cliente> arrayClientes) {
        this.arrayClientes = arrayClientes;
    }

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
