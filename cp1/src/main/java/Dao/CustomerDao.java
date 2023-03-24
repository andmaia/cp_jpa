package Dao;

import Entities.Customer;
import jakarta.persistence.EntityManager;

public class CustomerDao {
	private EntityManager em;

	public CustomerDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void inserir(Customer customer) {
		this.em.persist(customer);
	}
	
	public void atualizar(Customer customer) {
		this.em.merge(customer);
	}
	
	public void deletar(Customer customer) {
		customer=em.merge(customer);
		this.em.remove(customer);
	}
	
}
