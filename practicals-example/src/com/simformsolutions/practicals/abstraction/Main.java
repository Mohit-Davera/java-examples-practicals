package com.simformsolutions.practicals.abstraction;


/**
Driver Class Which Creates An Object Of HomeLoan Class And Calls Methods
**/
public class Main {

	public static void main(String[] args) {
		Loan loanOne = new HomeLoan();
		loanOne.showInterest();
		loanOne.changeInterest(8);
		loanOne.showInterest();
		
	}
}
