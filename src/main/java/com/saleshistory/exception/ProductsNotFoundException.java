package com.saleshistory.exception;

public class ProductsNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7287687213683319320L;
	public ProductsNotFoundException() {
		
	}
	public ProductsNotFoundException(String msg) {
		super(msg);
	}

}
