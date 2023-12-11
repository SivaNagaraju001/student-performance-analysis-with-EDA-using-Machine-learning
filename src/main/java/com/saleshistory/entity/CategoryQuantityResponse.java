package com.saleshistory.entity;

public class CategoryQuantityResponse {
	private String category;
	private int quantity;
	public CategoryQuantityResponse(String category, Integer quantity) {
		this.category=category;
		this.quantity=quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
