package com.simformsolutions.practicals.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

//Driver Class Used time package classes to demonstrate various methods
public class Main {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime  = LocalDateTime.now();
		
		DateTimeFormatter formatPatten = DateTimeFormatter.ofPattern("dd-MM HH:mm");
		String formattedDateTime = dateTime.format(formatPatten);

		System.out.println("Today : " + date + " Time: " + time);
		System.out.println("Formated Date And Time: "+formattedDateTime);
		
		System.out.println("Is Leap Year: "+date.isLeapYear());
		
		System.out.println("Tommorow : " + date.plusDays(1));
		System.out.println("Yesterday : " + date.minusDays(1));
	}

}
