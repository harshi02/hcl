package com.lab3.assigment;

import java.util.Scanner;

public class EmpTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();

		switch (choice) {
			case 1:
				
				Employee employee;
				employee = new SalariedEmployee(10000);
				System.out.println(employee.getSalary());	
				break;
			case 2:
				Employee employee1;
				employee1 = new SalariedEmployee(1000);
				employee1.setRate((2)*employee1.getSalary());
				System.out.println(employee1.getRate());
				
				employee1 = new HourlyEmployee(1000, 12);
				employee1.setRate((2*employee1.getSalary()));
				System.out.println(employee1.getRate());

				employee1 = new CommissionEmployees(1000, 50);
				employee1.setRate((2)*employee1.getSalary());
				System.out.println(employee1.getRate());
				break;
			default:
				break;

		}
      scanner.close();
	}

	}

