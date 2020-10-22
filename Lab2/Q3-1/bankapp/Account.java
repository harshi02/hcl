package com.lab2.bankapp;

import java.util.Random;

public class Account {
  private int accountNumber;
  private String memberName;
  private double accountBalance;
  
  public Account(){
	  
  }
  
  //private static int accountIdCounter=0;
  Random rand = new Random();
  int acco_Number =rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+rand.nextInt(10)+ rand.nextInt(10);
  
  public Account(String memberName, double accountBalance) {
	this.accountNumber= acco_Number;
	this.setMemberName(memberName);
	this.accountBalance = accountBalance;
}

public int getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

public double getAccountBalance() {
	return accountBalance;
}

public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}

public int getAcco_Number() {
	return acco_Number;
}
public void deposit(double amt) {
	accountBalance+= amt;
}
public void setAcco_Number(int acco_Number) {
	this.acco_Number = acco_Number;
}

public String getMemberName() {
	return memberName;
}

public void setMemberName(String memberName) {
	this.memberName = memberName;
}
  
  
}
