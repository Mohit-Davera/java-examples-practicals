package com.simformsolutions.practicals.thread;

import java.util.Random;

//Driver Class Which Invokes Threads
public class Main {

	public static void main(String[] args) {

		System.out.println("Name     ID Priority");
		Random rd = new Random();

		int n = 4;
		for (int i = 0; i < n; i++) {
			Thread object = new Thread(new ThreadImplements());
			int priority = 1 + rd.nextInt(10);
			object.setPriority(priority);
			object.start();
		}
	}
}
