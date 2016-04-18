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

    @Id
    @Column(name = "IBAN", nullable = false, length = 10)
    private String dni;

    @Column(name = "ncuenta", nullable = false, length = 30)
    private String nombre;

    @Column(name = "creacion", nullable = false, length = 80)
    private String apellidos;

    @Column(name = "saldo", nullable = false, length = 3)
    private int edad;

    @ManyToMany(mappedBy = "clientes")
    private Set<Cliente> arrayClientes;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Set<Cliente> getArrayClientes() {
        return arrayClientes;
    }

    public void setArrayClientes(Set<Cliente> arrayClientes) {
        this.arrayClientes = arrayClientes;
    }

}
