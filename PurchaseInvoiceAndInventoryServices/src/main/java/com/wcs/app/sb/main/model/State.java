package com.wcs.app.sb.main.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {
@Id
@GeneratedValue(strategy=GenerationType.TABLE)
	private int sid;
	private String statename;
	@OneToOne(cascade=CascadeType.ALL)
	private Country country;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
}
