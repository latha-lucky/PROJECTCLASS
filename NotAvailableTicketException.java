package jspiders;

public class NotAvailableTicketException extends RuntimeException {
	private String message;
	NotAvailableTicketException(String message){
		this.message=message;
	}
	public String getString() {
		return message;
	}
	

}
