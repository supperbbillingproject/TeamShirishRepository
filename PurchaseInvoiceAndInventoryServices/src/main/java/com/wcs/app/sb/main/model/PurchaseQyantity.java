package com.wcs.app.sb.main.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseQyantity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	
	private int qty;
	
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
}
