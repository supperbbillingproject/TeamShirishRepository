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
public class UserProdouctStock {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int psid;
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, ProductStockQuantity> map=new HashMap<>();
	public int getPsid() {
		return psid;
	}
	public void setPsid(int psid) {
		this.psid = psid;
	}
	public Map<String, ProductStockQuantity> getMap() {
		return map;
	}
	public void setMap(Map<String, ProductStockQuantity> map) {
		this.map = map;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public String getGSTN() {
		return GSTN;
	}
	public void setGSTN(String gSTN) {
		GSTN = gSTN;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@OneToOne(cascade=CascadeType.ALL)
	private Country country;
	private String PAN;
	private String GSTN;
	private String date;
	
}
