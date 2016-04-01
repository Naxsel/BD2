
public class Usuario {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String direccion;
    private String email;
    private int telefono;
    private String[] cuentas;

    public Usuario(String dni, String nombre, String apellidos, int edad, String direccion, String email, int telefono, String[] cuentas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.cuentas = cuentas;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(String[] cuentas) {
        this.cuentas = cuentas;
    }
}
