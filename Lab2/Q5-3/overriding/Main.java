package com.lab2.overriding;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("choose option\n1 – to create a Vehicle object.\n2 – to create a Car object.\n3– to create a Convertible object.\n4– to create a SportCar object.");
		Scanner sc = new Scanner(System.in);
		int ch=sc.nextInt();
		if(ch==1) {
			Vehicle vehicle = new Vehicle();
			vehicle.display();
		}
		else if(ch==2) {
			Car car = new Car();
			car.display();
		}else if(ch==3) {
			Convertible  convertible= new Convertible();
			convertible.display();
		}else if(ch==4) {
			SportCar sportcar = new SportCar();
			sportcar.display();
		}else {
			System.out.println("choose correct option");
		}
		sc.close();
	}

}
