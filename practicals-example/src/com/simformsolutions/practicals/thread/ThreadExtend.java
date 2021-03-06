package com.simformsolutions.practicals.thread;

//Class which extends thread class and cannot extend another class
public class ThreadExtend extends Thread {
	@Override
	public void run() {
		try {
			System.out.println(getName() + " " + getId() + " " + getPriority());
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}
