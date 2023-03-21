package Entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name="TB_PURCHASE")

public class Purchase {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="track_id")
	private Track track;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@Column(name="tp_payment")
	private String payment_method;
	
	
	
	public Purchase() {
		
	}


	public Purchase(Long id, Track track,Customer customer,String payment_method) {
		super();
		this.track = track;
		this.customer = customer;
		this.payment_method = payment_method;
		//this.date = date;
		//this.time = time;
		this.id=id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}

	public Track getTrack() {
		return track;
	}


	public void setTrack(Track track) {
		this.track = track;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getPayment_method() {
		return payment_method;
	}


	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

/*
	public java.util.Date getDate() {
		return date;
	}


	public void setDate(java.util.Date date) {
		this.date = date;
	}


	public java.util.Date getTime() {
		return time;
	}


	public void setTime(java.util.Date time) {
		this.time = time;
	}
	*/
	
	
	
	
}
