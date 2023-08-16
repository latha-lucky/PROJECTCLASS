package jspiders;

public class InvalidChioceException extends RuntimeException{
	
	private String message;
	InvalidChioceException(String message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	

}
