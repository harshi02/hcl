package com.lab2.overloading;

public class Student {
      private String name;
      private String id;
      private double grade;
	public Student(String name, String id, double grade) {
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public Student(String id) {
		this.id = id;
	}
      
      public void display() {
    	  System.out.print("name :"+name+"ID: "+id+"grade : "+grade);
      }
      public void display(int year) {
    	  this.display();
  		System.out.println("year: " + year);
      }
}
