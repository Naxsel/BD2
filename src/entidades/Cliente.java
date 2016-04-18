package entidades;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Entity(name = "CLIENTE")
public class Cliente implements Serializable
{
    @Id
    @Column(name = "ID_CLIENTE", nullable = false)
    private long idCliente;

    @Column(name = "NOMBRE", nullable = false,length = 50)
    private String nombre;

    @Column(name = "APELLIDOS", length = 50)
    private String apellidos;

    @Embedded
    private Direccion direccion = new Direccion();

    @Column(name = "TIPO_CLIENTE", length = 10)
    private String tipoCliente;

    @Version
    @Column(name = "FECHA_ULTIMA_ACTUALIZACION")
    private Date ultimaActualizacion;

    public long getidCliente()
    {
        return idCliente;
    }

    public void setIdCliente(long idCliente)
    {
        this.idCliente = idCliente;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    public Date getUltimaActualizacion()
    {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(Date ultimaActualizacion)
    {
        this.ultimaActualizacion = ultimaActualizacion;
    }

    public Direccion getDireccion()
    {
        return direccion;
    }

    public void setDireccion(Direccion direccion)
    {
        this.direccion = direccion;
    }

    public String getTipoCliente()
    {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente)
    {
        this.tipoCliente = tipoCliente;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Identificador de cliente: " + idCliente);
        sb.append(", nombre: " + nombre);
        sb.append(", apellidos: " + apellidos);
        sb.append(", tipo de cliente: " + tipoCliente);

        return sb.toString();
    }
}
