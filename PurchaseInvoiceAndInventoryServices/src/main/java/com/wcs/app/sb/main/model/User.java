package com.wcs.app.sb.main.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy=GenerationType.TABLE)
private int id;
private String username;
private String password;
private String name;
private String address;
private Long mobileno;
private String date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Long getMobileno() {
	return mobileno;
}
public void setMobileno(Long mobileno) {
	this.mobileno = mobileno;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}


}
