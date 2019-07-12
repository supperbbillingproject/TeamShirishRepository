package com.wcs.app.sb.main.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String pname;
private String phsncode;
private String  ptype;


@OneToOne(cascade=CascadeType.MERGE)
private ProductCategory pcat;
private String pbrand;

	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPhsncode() {
	return phsncode;
}
public void setPhsncode(String phsncode) {
	this.phsncode = phsncode;
}
public String getPtype() {
	return ptype;
}
public void setPtype(String ptype) {
	this.ptype = ptype;
}
public ProductCategory getPcat() {
	return pcat;
}
public void setPcat(ProductCategory pcat) {
	this.pcat = pcat;
}
public String getPbrand() {
	return pbrand;
}
public void setPbrand(String pbrand) {
	this.pbrand = pbrand;
}
	
	
}
