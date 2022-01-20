package com.simformsolutions.practicals.io;

import java.io.FileOutputStream;
import java.io.FileInputStream;

//Driver Class Which Demonstrates Input and Output Stream
public class Main {
	public static void main(String args[]) {
		
		String path = "C:\\Users\\mohit.davera\\Desktop\\file1.txt";
		String inputString = "Java Is Object Oriented Programming Language";
		byte[] byteArrray = inputString.getBytes();

		try {
			//Writing Part
			FileOutputStream fileOutputStream = new FileOutputStream(path);
			fileOutputStream.write(byteArrray);
			fileOutputStream.close();
			System.out.println("Written Successfully");

			//Reading Part
			FileInputStream fileInputStream = new FileInputStream(path);
			int i = 0;
			System.out.print("Read Data: ");
			while ((i = fileInputStream.read()) != -1) {
				System.out.print((char) i);
			}
			fileInputStream.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}