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
public class IncorrectReceiving {
@Id
@GeneratedValue(strategy=GenerationType.TABLE)
private int icrid;
public int getIcrid() {
	return icrid;
}
public void setIcrid(int icrid) {
	this.icrid = icrid;
}
public Map<String, IncorrectReceivingQuantity> getMap() {
	return map;
}
public void setMap(Map<String, IncorrectReceivingQuantity> map) {
	this.map = map;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@OneToMany(cascade=CascadeType.ALL)
private Map<String, IncorrectReceivingQuantity> map=new HashMap<>();
private String date;
}
