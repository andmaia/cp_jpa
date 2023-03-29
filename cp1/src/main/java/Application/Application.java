package Application;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.dialect.temptable.TemporaryTableHelper.TemporaryTableDropWork;

import Dao.ArtistDao;
import Dao.GenreDao;
import Dao.TrackDao;
import Entities.Artist;
import Entities.Customer;
import Entities.Genre;
import Entities.Purchase;
import Entities.Track;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import oracle.jdbc.oracore.TDSPatch;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("a");
		
		EntityManager em=emf.createEntityManager();
	//	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
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
		
		Artist artist= new Artist();
		artist.setId(null);
		artist.setArtistName("Andrew");
		artist.setArtistType("Canta pagode");
		
		Genre genre = new Genre();
		genre.setId(null);
		genre.setGenreName("Nighmare");
		
		ArtistDao ad= new ArtistDao(em);
		GenreDao gd=new GenreDao(em);
		TrackDao td= new TrackDao(em);
		
		em.getTransaction().begin();
			Track t=td.get(1l);
			Genre g=gd.get(21l);
			
			
			t.adicionarTrackGenre(g);
		em.getTransaction().commit();
		em.clear();
		emf.close();
		
	}	

}
