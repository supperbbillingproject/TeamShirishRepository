package com.wcs.app.sb.main.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TheftStockQuantity {
@Id

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