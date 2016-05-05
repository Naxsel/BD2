package entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

/**
 * Created by naxsel on 18/04/16.
 */

@Entity(name = "CCorriente_p4")
public class CCorriente extends Cuenta {

    @ManyToOne
    private Oficina oficinaCuenta;


    public CCorriente(String iban, String numCuenta, String creacion, double saldo, Set<Usuario> arrayUsuarios, Set<Operacion> arrayOperaciones,Oficina oficinaCuenta) {
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
