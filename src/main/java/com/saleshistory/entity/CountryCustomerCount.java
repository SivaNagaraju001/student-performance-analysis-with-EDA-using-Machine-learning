package com.saleshistory.entity;

public class CountryCustomerCount {
	 private String countryName;
	    private long customerCount;

	    public CountryCustomerCount(String countryName, long customerCount) {
	        this.countryName = countryName;
	        this.customerCount = customerCount;
	    }

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		public long getCustomerCount() {
			return customerCount;
		}

		public void setCustomerCount(long customerCount) {
			this.customerCount = customerCount;
		}

}
