package Dao;

import Entities.Artist;
import jakarta.persistence.EntityManager;

public class ArtistDao {
	private EntityManager em;

	public ArtistDao(EntityManager em) {
		this.em = em;
	}
	
	public void inserir(Artist artist) {
		this.em.persist(artist);
	}
	
	public void atualizar(Artist artist) {
		this.em.merge(artist);
	}
	
	public void remover(Artist artist) {
		artist = em.merge(artist);
		this.em.remove(artist);
	}
	
	
}
