package com.wcs.app.sb.main.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReturnQuantity {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	private int qty;
	
}
