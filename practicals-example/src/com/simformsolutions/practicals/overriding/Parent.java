package com.simformsolutions.practicals.overriding;

public class Parent {
	void display() {
		System.out.println("Parent Method Called");
	}
}

class Child extends Parent{
	@Override
	void display() {
		System.out.println("Child Method Called");
	}
}