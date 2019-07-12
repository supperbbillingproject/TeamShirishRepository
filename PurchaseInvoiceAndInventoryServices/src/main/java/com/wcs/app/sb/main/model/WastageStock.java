package com.wcs.app.sb.main.model;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class WastageStock {
@Id
@GeneratedValue(strategy=GenerationType.TABLE)
private int wsid;
public int getWsid() {
	return wsid;
}
public void setWsid(int wsid) {
	this.wsid = wsid;
}
public Map<String, WastageStockQuantity> getMap() {
	return map;
}
public void setMap(Map<String, WastageStockQuantity> map) {
	this.map = map;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@OneToMany(cascade=CascadeType.ALL)
private Map<String, WastageStockQuantity> map=new HashMap<>();
private String date;
}