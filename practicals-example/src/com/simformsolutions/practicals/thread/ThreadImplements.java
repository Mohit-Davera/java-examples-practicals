package com.simformsolutions.practicals.thread;

// Class which implements runnable interface and can also extend some class
public class ThreadImplements implements Runnable {
	@Override
	public void run() {
		try {
			String name = Thread.currentThread().getName();
			long id = Thread.currentThread().getId();
			int priority = Thread.currentThread().getPriority();

			System.out.println(name + " " + id + " " + priority);
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}

	}
}