package Application;

import Entities.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("a");
		
		EntityManager em=emf.createEntityManager();
		
		Customer customer = new Customer();
		customer.setId(null);
		customer.setEmail("andrewrian@198@gmail.com");
		customer.setIp_address("11122");
		customer.setCard_information("permitido");
		customer.setAge("12");
		customer.setDevice("android");
		customer.setPassword("12345");
		customer.setName("andrew");
		
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
	}	

}
