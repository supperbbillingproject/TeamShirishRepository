package com.wcs.app.sb.main.model;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int purchaseid;
	
	@OneToMany(cascade=CascadeType.MERGE)
	private Set<Product> productset=new HashSet<>();
	
	private String purchaseorderno;
	private String date;
	
	@OneToOne(cascade=CascadeType.MERGE)
	private Supplier supplier;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	private Map<String, PurchaseQyantity> map=new HashMap<>();
	
	@OneToOne(cascade=CascadeType.MERGE)
	private Status orderstatus;
	
	
	public Set<Product> getProductset() {
		return productset;
	}
	public void setProductset(Set<Product> productset) {
		this.productset = productset;
	}
	public String getPurchaseorderno() {
		return purchaseorderno;
	}
	public int getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(int purchaseid) {
		this.purchaseid = purchaseid;
	}
	public void setPurchaseorderno(String purchaseorderno) {
		this.purchaseorderno = purchaseorderno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Map<String, PurchaseQyantity> getMap() {
		return map;
	}
	public void setMap(Map<String, PurchaseQyantity> map) {
		this.map = map;
	}
	public Status getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(Status orderstatus) {
		this.orderstatus = orderstatus;
	}
	
}
