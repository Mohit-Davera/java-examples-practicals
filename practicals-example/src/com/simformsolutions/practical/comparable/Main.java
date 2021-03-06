package com.simformsolutions.practical.comparable;


//Driver Class Which creates collections of created class and sorts them
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("ABC", 105, 300000);
		Employee e2 = new Employee("XYZ", 106, 250000);
		Employee e3 = new Employee("PQR", 101, 100000);
		Employee e4 = new Employee("JKL", 100, 225000);
		
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		listEmp.add(e1);
		listEmp.add(e2);
		listEmp.add(e3);
		listEmp.add(e4);
		
		Collections.sort(listEmp);
		for(Employee e:listEmp){  
			System.out.println(e.e_id+" "+e.name+" "+e.salary);  
		}  
	}
}
