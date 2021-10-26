package com.oct12.batch3.day5.excep;

//user-defined exception / custom exception  

public class CanNotVoteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	CanNotVoteException() {
		super("Age is Problem");
	}

	CanNotVoteException(String message) {
		super(message);
	} 
   
}
