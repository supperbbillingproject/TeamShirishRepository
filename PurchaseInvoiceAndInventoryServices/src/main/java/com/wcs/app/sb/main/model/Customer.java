package com.wcs.app.sb.main.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int cid;
	private String custType;
	private String custName;
	private Long cmobile;
	private String email;
	private String doorno;
	private String laneno;
	private String streetno;
	private String area;
	private int zipcode;
	private String gstn;
	@OneToOne(cascade=CascadeType.ALL)
	private State state;
	@OneToOne(cascade=CascadeType.ALL)
	private City city;
	@OneToOne(cascade=CascadeType.ALL)
	private Country country;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Long getCmobile() {
		return cmobile;
	}
	public void setCmobile(Long cmobile) {
		this.cmobile = cmobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getLaneno() {
		return laneno;
	}
	public void setLaneno(String laneno) {
		this.laneno = laneno;
	}
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getGstn() {
		return gstn;
	}
	public void setGstn(String gstn) {
		this.gstn = gstn;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	private String date;
	
}
