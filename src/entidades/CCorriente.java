package entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity(name = "CCorriente_p4")
public class CCorriente extends Cuenta {

    public CCorriente(String iban, String numCuenta, String creacion, double saldo, Set<Usuario> arrayUsuarios, Set<Operacion> arrayOperaciones,Oficina oficinaCuenta) {
        super( iban,  numCuenta,  creacion,  saldo,  arrayUsuarios,  arrayOperaciones);
        this.oficinaCuenta = oficinaCuenta;
    }

    public CCorriente() {   }

    @ManyToOne
    private Oficina oficinaCuenta;

    public Oficina getOficinaCuenta() {
        return oficinaCuenta;
    }

    public void setOficinaCuenta(Oficina oficinaCuenta) {
        this.oficinaCuenta = oficinaCuenta;
    }

    @Override
    public String toString() {
        return "CCorriente{" +
                "oficinaCuenta=" + oficinaCuenta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CCorriente that = (CCorriente) o;

        return oficinaCuenta != null ? oficinaCuenta.equals(that.oficinaCuenta) : that.oficinaCuenta == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (oficinaCuenta != null ? oficinaCuenta.hashCode() : 0);
        return result;
    }
}
