package com.wcs.app.sb.main.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.UniqueElements;
 

@Entity
public class ProductCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int cid;
	private String category;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
