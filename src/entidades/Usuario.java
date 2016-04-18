package entidades;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity(name = "Usuario")
public class Usuario implements Serializable{

    @Id
    @Column(name = "dni", nullable = false, length = 10)
    private String dni;

    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 80)
    private String apellidos;

    @Column(name = "edad", nullable = false, length = 3)
    private int edad;

    @Column(name = "direccion", nullable = false, length = 80)
    private String direccion;

    @Column(name = "email", nullable = true, length = 80)
    private String email;

    @Column(name = "telefono", nullable = true, length = 15)
    private int telefono;


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
}
