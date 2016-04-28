package parte2;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="CUENTA_P1")
public class Cuenta {

    public Cuenta(String iban, String numCuenta, Date creacion, Double saldo, Set<Usuario> arrayUsuarios, Set<Operacion> arrayOperaciones) {
        this.iban = iban;
        this.numCuenta = numCuenta;
        this.creacion = creacion;
        this.saldo = saldo;
        this.arrayUsuarios = arrayUsuarios;
        this.arrayOperaciones = arrayOperaciones;
    }

    @Id
    @Column(name = "IBAN", nullable = false, length = 34)
    private String iban;

    @Column(name = "NUMERO", nullable = false, length = 34)
    private String numCuenta;

    @Column(name = "CREACION", nullable = false, length = 80)
    private Date creacion;

    @Column(name = "SALDO", nullable = false, length = 3)
    private Double saldo;

    @ManyToMany(mappedBy = "arrayCuentas")
    private Set<Usuario> arrayUsuarios;



    @OneToMany(mappedBy = "iban")
    private Set<Operacion> arrayOperaciones;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Set<Usuario> getArrayUsuarios() {
        return arrayUsuarios;
    }

    public void setArrayUsuarios(Set<Usuario> arrayUsuarios) {
        this.arrayUsuarios = arrayUsuarios;
    }

    public Set<Operacion> getArrayOperaciones() {
        return arrayOperaciones;
    }

    public void setArrayOperaciones(Set<Operacion> arrayOperaciones) {
        this.arrayOperaciones = arrayOperaciones;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + iban + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                ", creacion='" + creacion + '\'' +
                ", saldo=" + saldo +
                ", arrayUsuarios=" + arrayUsuarios +
                ", arrayOperaciones=" + arrayOperaciones +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cuenta cuenta = (Cuenta) o;

        return iban != null ? iban.equals(cuenta.iban) : cuenta.iban == null;

    }

    @Override
    public int hashCode() {
        return iban != null ? iban.hashCode() : 0;
    }
}
