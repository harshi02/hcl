package com.lab3.assigment;

public class HourlyEmployee extends Employee implements IncreaseSalary {
      private int salaryPerHour;
      private int numOfHours;
      
	public HourlyEmployee(int salaryPerHour, int numOfHours) {
		this.salaryPerHour = salaryPerHour;
		this.numOfHours = numOfHours;
	}
      
	@Override
	public int getSalary() {
		System.out.println("Hourly employee ");		
		return salaryPerHour * numOfHours;
	}

	@Override
	public int increaseSalary() {
		
		return 3;
	}

	@Override
	public double getPayment() {
		return salaryPerHour * numOfHours;
	}

      
}
