package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {
	
	static final int NUM_WHEELS = 2;


	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void addWheels(List<Wheel> frontWheel, List<Wheel> backWheel) throws Exception {//Creamos un método Setter "addTwoWheels", el cual tiene dos listas.)
		addOneWheel(frontWheel);//Función para añadir dos ruedas (delanteras).
		addOneWheel(backWheel);//Función para añadir dos ruedas (traseras).
	}
	
	public void addOneWheel(List <Wheel>wheel) throws Exception{
		if (wheel.size() !=1)
			throw new Exception();
		
		Wheel frontWheel = wheel.get(0);
		Wheel backWheel = wheel.get(0);
		
		if (backWheel.equals(frontWheel)){
			throw new Exception();
		}
		
		this.wheels.add(frontWheel);
		this.wheels.add(backWheel);
	}

}
