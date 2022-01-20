package com.simformsolutions.practical.comparable;

//Class with some instance variables and overrides compareTo method
public class Employee implements Comparable<Employee> {
	public String name;
	public int e_id;
	public int salary;
	
	
	public Employee(String name, int e_id, int salary) {
		this.name = name;
		this.e_id= e_id;
		this.salary= salary;
	}
	
	@Override
	public int compareTo(Employee other)
	{
		return this.name.compareTo(other.name);
	}
}
