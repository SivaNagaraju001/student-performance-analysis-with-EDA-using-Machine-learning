package com.saleshistory.exception;

public class TypeMisMatchException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TypeMisMatchException() {
		
	}
	public TypeMisMatchException(String msg) {
		super(msg);
	}
}
