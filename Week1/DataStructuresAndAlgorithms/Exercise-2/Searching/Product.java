package com.Searching;

public class Product {
	public int productId;
	public String productName, category;
	
	public Product(int id, String name, String category) {
		this.productId = id;
		this.productName = name;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Product " + this.productId + " " + this.productName + " " + this.category;
	}
}
