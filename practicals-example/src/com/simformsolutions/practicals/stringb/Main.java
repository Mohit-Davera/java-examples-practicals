package com.simformsolutions.practicals.stringb;

public class Main {

	public static void main(String[] args) {
		String greet = "Hello world";
		StringBuffer stringBuffer = new StringBuffer("String Buffer");
		StringBuilder stringBuilder = new StringBuilder("String Builder ");
		
		for(int i=0 ; i<5 ; i++) {
			String line = "This is Line "+String.valueOf(i+1);
			stringBuffer.append("\nString Buffer "+line);
			stringBuilder.append("\nString Builder "+line);
		}
		System.out.println("Old String: "+greet+"\nNew String: "+greet.toUpperCase().trim());
		System.out.println("String Buffer: "+stringBuffer.toString().toUpperCase().trim());
		System.out.println("String Builder: "+ stringBuilder.toString().toUpperCase().trim());
	}

}
