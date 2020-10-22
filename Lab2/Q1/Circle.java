//Q1: Implement following UML diagram, Write a program to test circle class.

package com.lab2.session;

public class Circle {
 private double radius; 
 private String color;
 
 public Circle() {  
     radius = 1.0;
     color = "red";
  }
public Circle(double radius) {
	this.radius = radius;			
}

//return radius of a circle
public double getRadius() {
    return radius; 
  }
  
//returns area of a  circle
  public double getArea() {
     return radius*radius*Math.PI;
  }
 
}
