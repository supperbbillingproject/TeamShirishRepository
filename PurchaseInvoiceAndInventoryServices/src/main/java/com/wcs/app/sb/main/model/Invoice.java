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
public class Invoice {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Map<String, InvoiceQuantity> getMap() {
		return map;
	}
	public void setMap(Map<String, InvoiceQuantity> map) {
		this.map = map;
	}
	public Map<String, Discount> getMap1() {
		return map1;
	}
	public void setMap1(Map<String, Discount> map1) {
		this.map1 = map1;
	}
	public float getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(float totalamount) {
		this.totalamount = totalamount;
	}
	public float getTotaldiscountamount() {
		return totaldiscountamount;
	}
	public void setTotaldiscountamount(float totaldiscountamount) {
		this.totaldiscountamount = totaldiscountamount;
	}
	public float getPayableamount() {
		return payableamount;
	}
	public void setPayableamount(float payableamount) {
		this.payableamount = payableamount;
	}
	public String getInvoicegenratedBy() {
		return invoicegenratedBy;
	}
	public void setInvoicegenratedBy(String invoicegenratedBy) {
		this.invoicegenratedBy = invoicegenratedBy;
	}
	public float getTotaltaxamount() {
		return totaltaxamount;
	}
	public void setTotaltaxamount(float totaltaxamount) {
		this.totaltaxamount = totaltaxamount;
	}
	public float getServicecharges() {
		return servicecharges;
	}
	public void setServicecharges(float servicecharges) {
		this.servicecharges = servicecharges;
	}
	public float getDeliverycharges() {
		return deliverycharges;
	}
	public void setDeliverycharges(float deliverycharges) {
		this.deliverycharges = deliverycharges;
	}
	@OneToOne(cascade=CascadeType.ALL)
	private Customer customer;
	
	private String invoiceno;
	private String date;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, InvoiceQuantity> map=new HashMap<>();
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, Discount> map1=new HashMap<>();
	
	private float totalamount;
	
	private float totaldiscountamount;
	private float payableamount;
	private String invoicegenratedBy;
	private float totaltaxamount;
	private float servicecharges;
	private float deliverycharges;
	
	
	
}
