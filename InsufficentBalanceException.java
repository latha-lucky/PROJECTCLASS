package jspiders;

public class InsufficentBalanceException extends RuntimeException {
	private String message;
	
	InsufficentBalanceException(String message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	

}
