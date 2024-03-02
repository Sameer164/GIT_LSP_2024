package org.howard.edu.lsp.assignment4;


/**
 * Implements a IntegerSetException Exception that extends the standard Exception
 * Class and serves as a custom Exception that should be thrown with 
 * appropriate message in any IntegerSet Errors.
 */
public class IntegerSetException extends Exception{
	public IntegerSetException() {
		
	}
	
	public IntegerSetException(String message) {
		super(message);
	}
}
