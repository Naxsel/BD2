package parte2;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="USUARIO_P1")
public class CCorriente extends Cuenta {

    @ManyToOne
    private Oficina oficinaCuenta;


    public CCorriente(String iban, String numCuenta, String creacion, int saldo, Set<Usuario> arrayUsuarios, Set<Operacion> arrayOperaciones, Oficina oficinaCuenta) {
        super( iban,  numCuenta,  creacion,  saldo,  arrayUsuarios,  arrayOperaciones);
        this.oficinaCuenta = oficinaCuenta;
    }
}
