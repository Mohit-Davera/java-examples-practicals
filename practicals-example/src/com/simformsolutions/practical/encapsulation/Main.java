package com.simformsolutions.practical.encapsulation;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Car carOne = new Car();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter color of car: ");
		String color = sc.next();
		System.out.print("Enter fuelType of car: ");
		String fuelType = sc.next();
		System.out.print("Enter gears of car: ");
		int gears = sc.nextInt();
		carOne.setColor(color);
		carOne.setFuelType(fuelType);
		carOne.setGears(gears);
		
		System.out.println("Color of car is : "+carOne.getColor());
		System.out.println("Fueltype of car is : "+carOne.getFuelType());
		System.out.print("Gears of car : "+carOne.getGears());
		
		sc.close();

	}

}
