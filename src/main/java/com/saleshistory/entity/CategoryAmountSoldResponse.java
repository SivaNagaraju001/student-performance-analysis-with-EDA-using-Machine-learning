package com.saleshistory.entity;

public class CategoryAmountSoldResponse {
	 private String category;
	    private double amountSold;

	    public CategoryAmountSoldResponse(String category, double amountSold) {
	        this.category = category;
	        this.amountSold = amountSold;
	    }

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public double getAmountSold() {
			return amountSold;
		}

		public void setAmountSold(double amountSold) {
			this.amountSold = amountSold;
		}


}
