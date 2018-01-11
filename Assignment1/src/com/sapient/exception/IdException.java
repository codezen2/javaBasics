package com.sapient.exception;

//subclass of exception 
public class IdException extends Exception {

	public IdException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public IdException(String message) {
		super(message);

	}
		
}
