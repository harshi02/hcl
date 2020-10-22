package com.lab2.overriding;

public class Convertible extends Car {
 private boolean isHoodOpen;

 public Convertible () {
	 
 }
public Convertible(boolean isHoodOpen) {
	super();
	this.setHoodOpen(isHoodOpen);
}

public void display() {
	System.out.println("Make :" +getMake()+ "model :" +getModel()+"Number of passenger"+getNoOfPassenger()+"Number of wheels"+getNoOfWheel());
}

public boolean getIsHoodOpen() {
	return isHoodOpen;
}



public void setHoodOpen(boolean isHoodOpen) {
	this.isHoodOpen = isHoodOpen;
}
}
