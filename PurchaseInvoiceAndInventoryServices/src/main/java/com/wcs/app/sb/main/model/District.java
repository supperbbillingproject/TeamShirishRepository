package com.wcs.app.sb.main.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class District {
@Id
@GeneratedValue(strategy=GenerationType.TABLE)
    private int did;

   private String districtname;
   @OneToOne(cascade=CascadeType.ALL)
   private State state;


	public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDistrictname() {
	return districtname;
}
public void setDistrictname(String districtname) {
	this.districtname = districtname;
}
public State getState() {
	return state;
}
public void setState(State state) {
	this.state = state;
}
	
}
