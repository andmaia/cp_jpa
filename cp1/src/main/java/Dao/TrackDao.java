package Dao;

import Entities.RecordLabel;
import Entities.Track;
import jakarta.persistence.EntityManager;

public class TrackDao {
	
	private EntityManager em;

	public TrackDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void inserir(Track track) {
		this.em.persist(track);
	}
	
	public void atualizar(Track track) {
		this.em.merge(track);
	}
	
	public void excluir(Track track) {
		track = em.merge(track);
		this.em.remove(track);
	}
	
	public Track get(Long id) {
		Track track=em.find(Track.class, id);
		return track;
	}
	
	
}
