package com.wcs.app.sb.main.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductStockQuantity {
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
	return Qty;
}
public void setQty(int qty) {
	Qty = qty;
}
private int Qty;
}
