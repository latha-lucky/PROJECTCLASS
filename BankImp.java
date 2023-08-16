package jspiders;

public class BankImp implements Bank {
	 private int balance;
	 BankImp(int balance){
		 this.balance=balance;
	 }
	

	@Override
	public void deposit(int amount) {
		if(amount<=balance) {
		System.out.println("Depositing Rs."+amount);
		balance=balance+amount;//balance+=amount;
		System.out.println("Amount Deposited Successfully");	
	}
	else {
		//invoke an exception and handle it
		try {
		throw new InsufficentBalanceException("Insufficient Balance");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
	}
	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawing Rs."+amount);
		balance=balance-amount;
		System.out.println("Amount Withdrawn Successfully");
		
	}

	@Override
	public int checkBalance() {
		
		return balance;
	}

	@Override
	public String displayErrorMessage() {
		
		return "Invalid chioce,Please enter valid choice!";
	}

}
