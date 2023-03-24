package Dao;

import Entities.Genre;
import jakarta.persistence.EntityManager;

public class GenreDao {
	private EntityManager em;
	
	
	
	public GenreDao(EntityManager em) {
		super();
		this.em = em;
	}



	public void inserir(Genre genre) {
		this.em.persist(genre);
	}
	
	public void atualizar(Genre genre) {
		this.em.merge(genre);
	}
	public void excluir(Genre genre) {
		genre=em.merge(genre);
		this.em.remove(genre);
	}
}
