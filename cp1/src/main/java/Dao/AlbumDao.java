package Dao;

import Entities.Album;
import jakarta.persistence.EntityManager;

public class AlbumDao {
	
	private EntityManager em;

	public AlbumDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	
	public void inserir(Album album) {
		em.persist(album);
	}
	
	public void atualizar(Album album) {
		em.merge(album);
	}
	
	public void delete(Album album) {
		album=em.merge(album);
		em.remove(album);
	}
	
	public Album get(Long id) {
		Album album=em.find(Album.class, id);
		return album;
	}
	
	
}
