package com.lab3.assigment;

public class SalariedEmployee extends Employee implements IncreaseSalary{
	
	private int salary;

	public SalariedEmployee(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int increaseSalary() {
		return 5;
	}
	
	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + "]";
	}

	@Override
	public double getPayment() {
		System.out.println(this.toString());
		return salary;
	}

}
