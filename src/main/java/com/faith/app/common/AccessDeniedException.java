package com.faith.app.common;

public class AccessDeniedException extends RuntimeException {


	private static final long serialVersionUID = 1L;//user defined exception

	public AccessDeniedException(String message) {
		super(message);
		
	}

	
}
