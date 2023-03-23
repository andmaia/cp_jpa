package Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_record_label")
public class RecordLabel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="nmm_record_label")
	private String recordLabelName;
	@Column(name="ds_website")
	private String website;
	
	public RecordLabel() {
		
	}
	
	
	
	public RecordLabel(Long id, String recordLabelName, String website) {
		super();
		this.id = id;
		this.recordLabelName = recordLabelName;
		this.website = website;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRecordLabelName() {
		return recordLabelName;
	}
	public void setRecordLabelName(String recordLabelName) {
		this.recordLabelName = recordLabelName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	
}
