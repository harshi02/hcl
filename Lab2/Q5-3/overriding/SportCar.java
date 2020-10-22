package com.lab2.overriding;

public class SportCar extends Car{
	public SportCar(){
		
	}

	public SportCar(int model, String make) {
		
		super(model, make);
		setNoOfDoors(2);	
	}
	
	

}
