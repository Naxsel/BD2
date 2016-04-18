package entidades;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity(name = "oficina")
public class Oficina implements Serializable {

    @Id
    @Column(name = "codigo", nullable = false)
    private int codigo;

    @Column(name = "dir", length = 80)
    private String dir;

    @Column(name = "telefono")
    private int telefono;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "codigo=" + codigo +
                ", dir='" + dir + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
