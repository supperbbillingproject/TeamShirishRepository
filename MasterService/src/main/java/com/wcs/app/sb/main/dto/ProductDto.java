package com.wcs.app.sb.main.dto;

public class ProductDto {
	private String productname;

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public ProductDto(String productname) {
		super();
		this.productname = productname;
	}
	

}
