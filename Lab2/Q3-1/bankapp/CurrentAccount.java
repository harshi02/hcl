package com.lab2.bankapp;

public class CurrentAccount extends Account {
        private double tradeLicenseNumber;

		public CurrentAccount() {
		}
		public CurrentAccount(String memberName, double accountBalance, double tradeLicenseNumber) {
			super(memberName, accountBalance);
			this.setTradeLicenseNumber(tradeLicenseNumber);
		}
       public double getBalance() {
    	   return getAccountBalance();
       }
        
       public void withdraw(double amt) {
   		if (amt<getAccountBalance()) {
   			setAccountBalance(getAccountBalance()-amt);
   		}
   		}
	public double getTradeLicenseNumber() {
		return tradeLicenseNumber;
	}
	public void setTradeLicenseNumber(double tradeLicenseNumber) {
		this.tradeLicenseNumber = tradeLicenseNumber;
	}
}
