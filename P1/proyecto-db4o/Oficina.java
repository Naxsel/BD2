/**
 * Created by anicacortes on 01/04/2016.
 */
public class Oficina {

    private String codigo;
    private String direccion;
    private int telefono;
    private Cuenta[] cuentas;

    public Oficina(String codigo, String direccion, int telefono, Cuenta[] cuentas) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuentas = cuentas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }
}
