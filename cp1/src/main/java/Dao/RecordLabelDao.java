package Dao;

import Entities.RecordLabel;
import jakarta.persistence.EntityManager;

public class RecordLabelDao {
	private EntityManager em;

	public RecordLabelDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void inserir(RecordLabel recordLabel) {
		this.em.persist(recordLabel);
	}
	
	public void atualizar(RecordLabel recordLabel) {
		this.em.merge(recordLabel);
	}
	
	public void excluir(RecordLabel recordLabel) {
		recordLabel = em.merge(recordLabel);
		this.em.remove(recordLabel);
	}
	
	
}
