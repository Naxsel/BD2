package entidades;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by naxsel on 18/04/16.
 */
@Entity(name = "CUENTA")
public class Cuenta {

    @ManyToMany(mappedBy = "arrayCuentas")
    private Set<Cliente> arrayClientes;

    @OneToMany(mappedBy = "iban")
    private Set<Operacion> arrayOperaciones;

    @Id
    @Column(name = "IBAN", nullable = false, length = 10)
    private String dni;

    @Column(name = "numCuenta", nullable = false, length = 30)
    private String numCuenta;

    @Column(name = "creacion", nullable = false, length = 80)
    private String creacion;

    @Column(name = "saldo", nullable = false, length = 3)
    private int saldo;

    public Set<Cliente> getArrayClientes() {
        return arrayClientes;
    }

    public void setArrayClientes(Set<Cliente> arrayClientes) {
        this.arrayClientes = arrayClientes;
    }

    public Set<Operacion> getArrayOperaciones() {
        return arrayOperaciones;
    }

    public void setArrayOperaciones(Set<Operacion> arrayOperaciones) {
        this.arrayOperaciones = arrayOperaciones;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCreacion() {
        return creacion;
    }

    public void setCreacion(String creacion) {
        this.creacion = creacion;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "arrayClientes=" + arrayClientes +
                ", arrayOperaciones=" + arrayOperaciones +
                ", dni='" + dni + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                ", creacion='" + creacion + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
