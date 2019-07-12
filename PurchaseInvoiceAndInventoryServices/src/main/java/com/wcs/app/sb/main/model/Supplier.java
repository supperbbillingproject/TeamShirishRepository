package com.wcs.app.sb.main.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Supplier {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int sid;
	private String scompanyname;
	private String saddress;
	private String date;
	private String gstn;
	
	@OneToOne(cascade=CascadeType.MERGE)
	private District district;
	
	@OneToOne(cascade=CascadeType.MERGE)
	private State state;
	
	@OneToOne(cascade=CascadeType.MERGE)
	private Country country;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getScompanyname() {
		return scompanyname;
	}
	public void setScompanyname(String scompanyname) {
		this.scompanyname = scompanyname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getGstn() {
		return gstn;
	}
	public void setGstn(String gstn) {
		this.gstn = gstn;
	}
	
	
}
