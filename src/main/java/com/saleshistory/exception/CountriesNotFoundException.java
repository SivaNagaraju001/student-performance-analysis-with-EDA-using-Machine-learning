package com.saleshistory.exception;

public class CountriesNotFoundException extends RuntimeException{
/**
	 * 
	 */
	private static final long serialVersionUID = -4989667276785177545L;

		public CountriesNotFoundException() {
		
	}
	public CountriesNotFoundException(String msg) {
		super(msg);
	}

}
