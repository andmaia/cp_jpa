package Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_CUSTOMER")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="DS_EMAIL")
	private String email;
	@Column(name="NM_CUSTOMER")
	private String name;
	@Column(name="ds_password")
	private String password;
	@Column(name="nr_age")
	private String age;
	@Column(name="ds_card_information")
	private String card_information;
	@Column(name="nr_ip_address")
	private String ip_address;
	@Column(name="ds_device")
	private String device;
	
	public Customer() {
		
	}

	public Customer(Long id,String email, String name, String password, String age, String card_information, String ip_address,
			String device) {
		
		this.id=id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.age = age;
		this.card_information = card_information;
		this.ip_address = ip_address;
		this.device = device;
	}
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCard_information() {
		return card_information;
	}

	public void setCard_information(String card_information) {
		this.card_information = card_information;
	}

	public String getIp_address() {
		return ip_address;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}
	
	
	
	
}	
