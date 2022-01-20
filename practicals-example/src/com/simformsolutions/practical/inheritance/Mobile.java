package com.simformsolutions.practical.inheritance;

public class Mobile {
	private String displayRes;
	
	public void show() {
		System.out.println("I am Mobile");
	}
	
	public void display(){
		System.out.println(displayRes);
	}
}

class Android extends Mobile{
	private int androidVer;
	public void version() {
		System.out.println(androidVer);
	}
}
