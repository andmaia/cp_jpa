package Application;

import java.text.SimpleDateFormat;
import java.util.Date;

import Entities.Customer;
import Entities.Purchase;
import Entities.Track;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("a");
		
		EntityManager em=emf.createEntityManager();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Customer customer = new Customer();
		customer.setId(null);
		customer.setEmail("andrewrian@198@gmail.com");
		customer.setIp_address("11122");
		customer.setCard_information("permitido");
		customer.setAge("12");
		customer.setDevice("android");
		customer.setPassword("12345");
		customer.setName("andrew");
		
		
		Track track = new Track();
		track.setTrack_ID(null);
		track.setTrack_language("PT-BR");
		track.setTrack_lenght(2.43);
		track.setTrack_name("Ah lelek");
		track.setTrack_price("3");
		track.setTrack_producer("Paramaker");
		track.setTrack_released("uai");
		track.setTrack_sixe(2.67);
		track.setTrack_songwriters("Mario");
		
		Date data = new Date();

		
	
	
		em.getTransaction().begin();
		em.persist(customer);
		em.persist(track);
		
		
		Track t =em.find(track.getClass(), 1);
		Customer c=em.find(customer.getClass(), 1);
		
		
		Purchase purchase = new Purchase();
		purchase.setId(null);
		purchase.setPayment_method("Crédito");
	    purchase.setTrack(t);
		purchase.setCustomer(c);
		
		em.persist(purchase);
		
		em.getTransaction().commit();
		
		
	}	

}
