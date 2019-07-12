package com.wcs.app.sb.main.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Expenses {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	@OneToOne(cascade=CascadeType.ALL)
	private Ledger ledger;
	private String paymentTo;
	private String date;
	private float amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Ledger getLedger() {
		return ledger;
	}
	public void setLedger(Ledger ledger) {
		this.ledger = ledger;
	}
	public String getPaymentTo() {
		return paymentTo;
	}
	public void setPaymentTo(String paymentTo) {
		this.paymentTo = paymentTo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public byte[] getDocument() {
		return document;
	}
	public void setDocument(byte[] document) {
		this.document = document;
	}
	private byte[] document;
	
}
