package com.lab2.bankapp;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		String userName;
		int accountType;
		double initialBalance;
		System.out.println("To create an account please fill following details");
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter username");
		userName=scanner.nextLine();
		System.out.println("enter Initial Balance");
		initialBalance=scanner.nextDouble();
		System.out.println("enter Account Type\n1.Deposit\n2.withdraw\n3.Display\n0.Exit");
		accountType=scanner.nextInt();
		Account savingAccount = new SavingsAccount(userName,initialBalance);
		Account currentAccount= new CurrentAccount();
	    switch(accountType) {
	    case 0:System.exit(0);
	    case 1: System.out.println("Amount of money he want to deposit");
	            double amt=scanner.nextDouble();
	            System.out.println("Balance need to be displayed?Y/N");
	            String ch= scanner.next();
	            if (ch == "Y" || ch=="y")
	            {
	            	System.out.println("Before deposit " + savingAccount.getAccountBalance());
	                savingAccount.deposit(amt);
	                System.out.println("After deposit " + savingAccount.getAccountBalance());
	            }else
	            	savingAccount.deposit(amt);
	    case 2: 
	    	    System.out.println("Amount to withdraw ");
                double withamt=scanner.nextDouble();
		        System.out.println("Balance need to be displayed?Y/N");
		        String ch1= scanner.next();
		        if (ch1 == "Y" || ch1=="y")
		        {
		        	System.out.println("Before withdraw " + savingAccount.getAccountBalance());
		            ((SavingsAccount) savingAccount).withdraw(withamt);
		            System.out.println("After withdraw " + savingAccount.getAccountBalance());
		        }else
		        	savingAccount.deposit(withamt);
	    case 3: System.out.println("Balance amount " + currentAccount.getAccountBalance());
	    }
		
     scanner.close();
	}

}
