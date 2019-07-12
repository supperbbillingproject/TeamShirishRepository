package com.wcs.app.sb.main.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class City {
@Id
@GeneratedValue(strategy=GenerationType.TABLE)
	private int ctid;
	private String cityname;
	@OneToOne(cascade=CascadeType.ALL)
	private District district;
	
	public int getCtid() {
		return ctid;
	}
	public void setCtid(int ctid) {
		this.ctid = ctid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
}
