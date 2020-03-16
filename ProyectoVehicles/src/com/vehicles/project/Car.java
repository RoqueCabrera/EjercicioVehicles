package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {//Subclase pública que extiende de vehículo.
	
	static final int NUM_WHEELS = 4;

	public Car(String plate, String brand, String color) {//Constructor llamado "Car".
		super(plate, brand, color);//Llamar a los parámetros de "Vehicle".
	}
	
	

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {//Creamos un método Setter "addTwoWheels", el cual tiene dos listas.)
		addTwoWheels(frontWheels);//Función para añadir dos ruedas (delanteras).
		addTwoWheels(backWheels);//Función para añadir dos ruedas (traseras).
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {//Creamos otro método que podamos añadir dos ruedas.
		if (wheels.size() != 2)//Bucle if por si se ingresa un número diferente de dos ruedas.
			throw new Exception("Insert 2 wheels.");//Lanzamos excepción para que vea que hay error.

		Wheel rightWheel = wheels.get(0);//Creamos la variable rightWheel.
		Wheel leftWheel = wheels.get(1);//Creamos la variable leftWheel.

		if (!rightWheel.equals(leftWheel))//Generamos un bucle if por si los datos ingresados de la rueda derecha no son los mismos que los de la izquierda.
			throw new Exception();//Lanzamos una excepción para que vea que hay un error.
		

		this.wheels.add(leftWheel);//Añadir leftWheel.
		this.wheels.add(rightWheel);//Añadir rightWheel.
		
	}
	
	

}
