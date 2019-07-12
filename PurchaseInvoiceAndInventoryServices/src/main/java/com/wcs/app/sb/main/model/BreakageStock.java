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
public class BreakageStock {
public int getBsid() {
		return bsid;
	}
	public void setBsid(int bsid) {
		this.bsid = bsid;
	}
	public Map<String, BreakageStockQantity> getMap() {
		return map;
	}
	public void setMap(Map<String, BreakageStockQantity> map) {
		this.map = map;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
@Id
@GeneratedValue(strategy=GenerationType.TABLE)
private int bsid;
@OneToMany(cascade=CascadeType.ALL)
private Map<String, BreakageStockQantity> map=new HashMap<>();
private String date;
}
