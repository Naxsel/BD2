package entidades;

import java.io.*;
import javax.persistence.*;

@Embeddable
public class Direccion implements Serializable
{
	private String calle;
	
	@Column(name = "PISO",nullable = false)  
	private String piso;
	
	private String ciudad;
	
	@Column(name = "COD_POSTAL",nullable = false)  
	private String codPostal;

	public String getPiso() 
	{
		return piso;
	}

	public void setPiso(String piso) 
	{
		this.piso = piso;
	}

	public String getCiudad() 
	{
		return ciudad;
	}

	public void setCiudad(String ciudad) 
	{
		this.ciudad = ciudad;
	}

	public String getCalle() 
	{
		return calle;
	}

	public void setCalle(String calle) 
	{
		this.calle = calle;
	}

	public String getCodPostal() 
	{
		return codPostal;
	}

	public void setCodPostal(String codPostal) 
	{
		this.codPostal = codPostal;
	}
}
