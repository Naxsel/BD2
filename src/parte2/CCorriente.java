package parte2;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Set;

@Entity
@Table(name="CCORRIENTE_P1")
@PrimaryKeyJoinColumn(name="IBAN")
public class CCorriente extends Cuenta {

    @ManyToOne
    @JoinTable(name="PERTENECE_P1", joinColumns = @JoinColumn(name="IBAN"), inverseJoinColumns = @JoinColumn(name="CODIGO"))
    private Oficina oficinaCuenta;


    public CCorriente(String iban, String numCuenta, Calendar creacion, double saldo, Set<Usuario> arrayUsuarios, Set<Operacion> arrayOperaciones, Oficina oficinaCuenta) {
        super( iban,  numCuenta,  creacion,  saldo,  arrayUsuarios,  arrayOperaciones);
        this.oficinaCuenta = oficinaCuenta;
    }

    public Oficina getOficinaCuenta() {
        return oficinaCuenta;
    }

    public void setOficinaCuenta(Oficina oficinaCuenta) {
        this.oficinaCuenta = oficinaCuenta;
    }
}
