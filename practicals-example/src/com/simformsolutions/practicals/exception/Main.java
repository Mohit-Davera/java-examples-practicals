package com.simformsolutions.practicals.exception;

//Driver Class Which Handles Arithmetic Exception
public class Main {

	public static void main(String[] args) {

		try {
			System.out.println("In Try Block");

			System.out.println(4 / 0);

		} catch (ArithmeticException e) {

			System.out.println("In Arithmetic Exception " + e.getLocalizedMessage());
			
		} catch (Exception e) {

			System.out.println("In Generic Exception Block" + e);
			
		} finally {

			System.out.println("Finally block Executed");
			
		}
		System.out.println("Remaining Code Executed");

	}

}
