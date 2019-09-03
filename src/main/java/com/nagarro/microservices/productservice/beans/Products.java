package com.nagarro.microservices.productservice.beans;

public class Products {

	int productId;
	String productName;
	Double unitCost;
	String category;
	int port;

	public Products() {
		super();
	}

	public Products(int productId, String productName, Double unitCost, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.unitCost = unitCost;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(Double unitCost) {
		this.unitCost = unitCost;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}
