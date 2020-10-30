package com.lab4.exception;

public class BankAccount {

	private String name;
	private String id;
	private double salary;
	
	public BankAccount() {
	}
	public BankAccount(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    public void display() {
    	System.out.println("Name:"+name+" Id:"+id+" Salary:"+salary);
    }
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
