package com.simformsolutions.practicals.abstraction;


/**
Class Which Implements Loan Interface And Gives Defination
**/
public class HomeLoan implements Loan{

	double interest=7;
	
	@Override
	public void showInterest() {
		System.out.println("Rate Of Interest Is: "+interest+"%");
	}
	
	@Override
	public void changeInterest(double newInterest) {
		interest = newInterest;
	}
}