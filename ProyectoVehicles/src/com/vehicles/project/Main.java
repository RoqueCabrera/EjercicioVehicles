package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		boolean isPlateOk = false;
		
		String vehicleSelection;
		String color;
		String brand;
		String plate;
		
		Car car;	
		Bike bike;
		
		List <Wheel> frontWheels;
		List <Wheel> backWheels;
		
		System.out.println("Do you want to build a car or a bike, my friend?");
		vehicleSelection =sc.next();
		
//FASE1
		
		//1) Demanar a l’usuari la matrícula del cotxe, la marca i el seu color.
		
		
		System.out.println("Insert brand.");//Imprimimos la solicitud de ingreso de la marca.
		 brand=sc.next();//Ingresamos el valor dado en marca por medio de la clase Scanner.
		
		System.out.println("Insert color.");//Imprimimos la solicitud de ingreso del color.
		 color=sc.next().toUpperCase();//Ingresamos el valor dado en color por medio de la clase Scanner.
		
		
		do {
			System.out.println("Insert license plate number:");//Imprimimos la solicitud de ingreso de la matrícula.
		 plate=sc.next().toUpperCase();//Ingresamos el valor dado en matrícula por medio de la clase Scanner.
		Matcher m = Pattern.compile("\\d\\d\\d\\d[A-Z][A-Z][A-Z]").matcher(plate);
		isPlateOk = m.find();
		
		if (isPlateOk == true) {
			System.out.println("plate" + " is a valid number.");
		}
		
		} while (isPlateOk == false);
		
		
		switch (vehicleSelection) {
		case "car":
			car=new Car(plate,brand,color);
			frontWheels = new ArrayList <Wheel>();
			backWheels = new ArrayList <Wheel> ();
			for (int i = 0; i < Car.NUM_WHEELS; i++) {
				if (i<2){
					System.out.println("Insert back wheel");
					backWheels.add(CreateWheel(sc));
				}else{
					System.out.println("Insert front wheel");
					frontWheels.add(CreateWheel(sc));
				}
			}
			try {
				car.addWheels(frontWheels, backWheels);
			} catch (Exception e) {
				e.printStackTrace();
			}
			  	
			System.out.println(car.toString());
			break;
			
		case "bike":
			bike=new Bike(plate,brand,color);
			for (int i = 0; i < Bike.NUM_WHEELS; i++) {
				if (i<1){
					System.out.println("Insert back wheel");
					bike.wheels.add(CreateWheel(sc));
				}else{
					System.out.println("Insert front wheel");
					bike.wheels.add(CreateWheel(sc));
				}
			}
			System.out.println(bike.toString());
			break;

		default:
			break;
		}		
		
	}

	private static Wheel CreateWheel(Scanner sc) {
		System.out.println("Insert Brand: ");
		String brandW = sc.next();
		System.out.println("Insert Diameter: ");
		double diameterW = sc.nextDouble();
		Wheel wheel = new Wheel (brandW, diameterW);
		return wheel ;
	}

}
