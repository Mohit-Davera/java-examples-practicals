package com.simformsolutions.practicals.lambda;

interface Greets{  
    void greet(String name);  
}  
  
public class Main{  
    public static void main(String[] args) {  
       
        Greets s = (name)-> {  
        	System.out.println("Hello "+name);
        };  
        s.greet("Mohit");
    }  
}  