package com.lab2.bankapp;

class SavingsAccount extends Account {
	private double interest;
	private double max;
	private double minlit= 1000.0;
	
	public SavingsAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
	}
	
	public SavingsAccount(String memberName, double accountBalance, double max) {
    	super(memberName, accountBalance);
		this.interest =5;
		this.max = max;
	}
	public double getBalance() {
		return interest += getAccountBalance();
		
	}
	public void withdraw(double amt) {
		if ((amt<max) &&((getAccountBalance() - amt)>minlit)) {
			setAccountBalance(getAccountBalance() - amt);
		}else {
			System.out.println("amount given is not accepted");
		}
	}
	
	
	
     
   
}
