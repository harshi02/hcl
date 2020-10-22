package com.lab2.overriding;


public class Car extends Vehicle{
	private int noOfDoors;

	public Car() {
		
	}

	public Car(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoors) {
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoors = noOfDoors;
	}

	public Car(int model, String make) {
		setModel(model);
		setMake(make);
		
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	public void display() {
		System.out.println("Make :" +getMake()+ "model :" +getModel()+"Number of passenger"+getNoOfPassenger()+"Number of wheels"+getNoOfWheel());
	}
	

}
