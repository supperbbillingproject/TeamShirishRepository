package com.wcs.app.sb.main.model;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class SupplierInvoice {
@Id
@GeneratedValue(strategy=GenerationType.TABLE)
private int id;
private String suppliesInvoiceno;
private String date;
@OneToMany(cascade=CascadeType.ALL)
private Map<String, SupplierInvoiceQuantity> suppliesmap=new HashMap<>();
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public Map<String, SupplierInvoiceQuantity> getSuppliesmap() {
	return suppliesmap;
}
public void setSuppliesmap(Map<String, SupplierInvoiceQuantity> suppliesmap) {
	this.suppliesmap = suppliesmap;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSuppliesInvoiceno() {
	return suppliesInvoiceno;
}
public void setSuppliesInvoiceno(String suppliesInvoiceno) {
	this.suppliesInvoiceno = suppliesInvoiceno;
}
}
