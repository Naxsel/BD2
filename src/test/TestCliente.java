package test;

import javax.persistence.*;
import entidades.*;

public class TestCliente 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("EjemploDeUnidadDePersistencia");
		
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		trans.begin();

		Cliente cliente = new Cliente();
		cliente.setNombre("Juan");
		cliente.setApellidos("Lolo Lulo");
		cliente.setTipoCliente("BUENO");
		cliente.getDireccion().setCalle("Perico de los Palotes, 12");
		cliente.getDireccion().setPiso("5D");
		cliente.getDireccion().setCiudad("Zaragoza");
		cliente.getDireccion().setCodPostal("50018");
		em.persist(cliente);
		trans.commit();
		
		em.close();
		entityManagerFactory.close();		
	}
}
