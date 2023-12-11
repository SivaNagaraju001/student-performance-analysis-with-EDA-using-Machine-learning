package com.saleshistory.exception;

public class SalesNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7267366732127356847L;
	public SalesNotFoundException() {
		
	}
	public SalesNotFoundException(String msg) {
		super(msg);
	}

}
