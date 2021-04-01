package es.upm.dit.isst.COMMBIKE.tests;

import javax.persistence.Persistence;


import es.upm.dit.isst.COMMBIKE.model.Usuarios;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class UsuariosDAOTests {

	private static EntityManager manager;
	private static EntityManagerFactory emf; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		emf = Persistence.createEntityManagerFactory("Persistencia");
		manager = emf.createEntityManager();
		
		Usuarios e = new Usuarios("correo", 1, "XXXX", "1234567QWER");
		manager.getTransaction().begin();
		manager.persist(e);
		manager.getTransaction().commit();
		
		imprimirTodo();
	}
	
	@SuppressWarnings("unchecked")
	private static void imprimirTodo() {
		List<Usuarios> users = (List<Usuarios>) manager.createQuery("FROM USUARIOS").getResultList();
		System.out.println("Hay " + users.size() +" empleados en el sistema.");
		for(Usuarios emp : users) {
			System.out.println(emp.toString());
		}
	}

}
