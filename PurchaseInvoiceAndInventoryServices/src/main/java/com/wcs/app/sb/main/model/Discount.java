package com.wcs.app.sb.main.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Discount {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private float dpercentage;
	private String description;
	private String title;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getDpercentage() {
		return dpercentage;
	}
	public void setDpercentage(float dpercentage) {
		this.dpercentage = dpercentage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
