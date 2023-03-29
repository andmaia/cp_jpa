package Dao;

import Entities.Purchase;
import jakarta.persistence.EntityManager;

public class PurchaseDao {
	
	private EntityManager em;

	public PurchaseDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void inserir(Purchase purchase) {
		em.persist(purchase);
	}
	
	public void atualizar(Purchase purchase) {
		em.merge(purchase);
	}
	
	public void deletar(Purchase purchase) {
		purchase=em.merge(purchase);
		em.remove(purchase);
	}
	
	public Purchase get(Long id) {
		Purchase purchase= em.find(Purchase.class, id);
		return purchase;
	}
}
