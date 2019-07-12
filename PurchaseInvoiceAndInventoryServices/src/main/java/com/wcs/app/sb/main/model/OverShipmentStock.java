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
public class OverShipmentStock {
@Id
@GeneratedValue(strategy=GenerationType.TABLE)
private int osid;

@OneToMany(cascade=CascadeType.ALL)
private Map<String, OverShipmentStockQuantity> map=new HashMap<>();

public int getOsid() {
	return osid;
}

public void setOsid(int osid) {
	this.osid = osid;
}

public Map<String, OverShipmentStockQuantity> getMap() {
	return map;
}

public void setMap(Map<String, OverShipmentStockQuantity> map) {
	this.map = map;
}

}
