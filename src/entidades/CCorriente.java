package entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

/**
 * Created by naxsel on 18/04/16.
 */

@Entity(name = "CAhorro")
public class CCorriente extends Cuenta {

    @ManyToOne
    private Oficina oficina;
}
