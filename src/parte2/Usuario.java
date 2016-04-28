package parte2;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="USUARIO_P1")
public class Usuario implements Serializable{

    public Usuario(String dni, String nombre, String apellidos, int edad, String direccion, String email, int telefono, Set<Cuenta> arrayCuentas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.arrayCuentas = arrayCuentas;
    }

    @Id
    @Column(name = "DNI", nullable = false, length = 10)
    private String dni;

    @Column(name = "NOMBRE", nullable = false, length = 30)
    private String nombre;

    @Column(name = "APELLIDOS", nullable = false, length = 80)
    private String apellidos;

    @Column(name = "EDAD", nullable = false, length = 3)
    private int edad;

    @Column(name = "DIRECCION", nullable = false, length = 80)
    private String direccion;

    @Column(name = "EMAIL", length = 80)
    private String email;

    @Column(name = "TELEFONO", length = 15)
    private int telefono;

    @ManyToMany
    @JoinTable(name="TIENE_P1", joinColumns = @JoinColumn(name="DNI"), inverseJoinColumns = @JoinColumn(name="IBAN"))
    private Set<Cuenta> arrayCuentas;

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", telefono=" + telefono +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return dni != null ? dni.equals(usuario.dni) : usuario.dni == null;

    }

    @Override
    public int hashCode() {
        return dni != null ? dni.hashCode() : 0;
    }
}
