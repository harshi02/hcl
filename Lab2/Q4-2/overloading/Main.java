package com.lab2.overloading;

import java.util.Scanner;

public class Main {
	private static Scanner scanner=new Scanner(System.in);
	private static Student student;
	public static void main(String[] args) {
		System.out.println("Choose option \n1.create new student details\n2.display the student info");
		int ch=scanner.nextInt();
		switch(ch) {
		case 1:  createObject();
		         displayDetails();
		          break;
			   
		case 2:  displayDetails();
		         break;
		default:System.out.println("given correct option");
			    

	}
	}
	public static void createObject() {
		   String name,Id;
	       double grade;
		   System.out.println("Enter Student details based on choosing the below option \n 1.Name,Id,Grade\n2.Name,Id\n3.Id");
	       String op = scanner.nextLine();
	       System.out.println("Please enter the details");
	       if(op.equals("1")) {
	    	   System.out.println("name");
	    	   name = scanner.nextLine();
	    	   System.out.println("Id");
	    	   Id=scanner.nextLine();
	    	   System.out.println("grade");
	    	   grade=scanner.nextDouble();
	    	   student=new Student(name,Id,grade);
	       }
	       else if(op.equals("2") ){
	    	   System.out.println("name");
	    	   name = scanner.nextLine();
	    	   System.out.println("Id");
	    	   Id=scanner.nextLine();
	    	   student=new Student(name,Id);
	       }else {
	    	   System.out.println("name");
	    	   name = scanner.nextLine();
	    	   student=new Student(name);
	    	   
	       }
	}
	public static void displayDetails() {
		System.out.println("Do you want to enter year Y/N");
		String isYear = scanner.next();
		if (isYear.equals("Y")) {
			System.out.println("Enter year");
			int year = scanner.nextInt();
			student.display(year);
		} else {
			student.display();
		}
	}
}