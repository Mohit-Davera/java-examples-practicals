package com.simformsolutions.practicals.collections;

//Driver Class Which Iterates Over Collections
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		
		//ARRAY LIST
		System.out.println("Array List");
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		listInt.add(10);
		listInt.add(20);
		listInt.add(30);
		listInt.add(40);
		listInt.add(50);
		
		Iterator<Integer> arrayListIter = listInt.iterator();
		while(arrayListIter.hasNext())
			System.out.print(arrayListIter.next()+" ");
		
		//HASH SET
		System.out.println("\n\nHash Set");
		HashSet<Character> charSet = new HashSet<Character>();
		charSet.add('A');
		charSet.add('B');
		charSet.add('D');
		charSet.add('E');
		charSet.add('C');
		
		Iterator<Character> hashSetIter = charSet.iterator();
		while(hashSetIter.hasNext())
			System.out.print(hashSetIter.next()+" ");
		
		//HASH MAP
		System.out.println("\n\nHash Map");
		HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1,"Java");
		hashMap.put(2,"JavaScript");
		hashMap.put(3,"Python");
		hashMap.put(4,"C");
		
	    for (Integer key : hashMap.keySet()) {
	        System.out.print("("+key + ":" + hashMap.get(key)+"), ");
	    } 
	    
	    
		//TREE SET
		System.out.println("\n\nTree Set");
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("C#");
		treeSet.add("Java");
		treeSet.add("Python");
		treeSet.add("Scala");
		treeSet.add("JavaScript");
		
		Iterator<String> itr=treeSet.iterator();  
		  while(itr.hasNext()){  
		   System.out.print(itr.next()+",");  
		}  
		  
		//TREE SET
		System.out.println("\n\nTree Map");
		TreeMap<String, String> treeMap = new TreeMap<String,String>();
		treeMap.put("First", "Gold");
		treeMap.put("Second", "Silver");
		treeMap.put("Third", "Bronze");
		
	    for (String key : treeMap.keySet()) {
	        System.out.print("("+key + ":" + treeMap.get(key)+"), ");
	    } 
	}

}
