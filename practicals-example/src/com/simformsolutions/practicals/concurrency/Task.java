package com.simformsolutions.practicals.concurrency;

import java.time.*;

//Class Which Overrides run method and prints name and time at execution of threads
public class Task implements Runnable {
	
	@Override
	public void run() {
		
		LocalTime time = LocalTime.now();
		String name = Thread.currentThread().getName();
		
		System.out.println("Thread Name: "+name + " Time: "+time);
		
	}
}
