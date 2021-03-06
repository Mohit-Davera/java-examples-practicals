package com.simformsolutions.practicals.stream;


// Driver Class To Filter Elements using ID >=5 And Sorted Using ID
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Language> arrayList = new ArrayList<Language>();
		
		arrayList.add(new Language(1,"Java"));
		arrayList.add(new Language(3,"Python"));
		arrayList.add(new Language(5,"Javascript"));
		arrayList.add(new Language(7,"C#"));
		arrayList.add(new Language(4,"Perl"));
		arrayList.add(new Language(2,"R"));
		arrayList.add(new Language(8,"C"));
		arrayList.add(new Language(6,"Java"));
		arrayList.add(new Language(10,"Sql"));
		arrayList.add(new Language(11,"C#"));
		arrayList.add(new Language(9,"PHP"));
		
		List<Language> filteredList =  arrayList.stream()
					.filter( l -> l.id>=5 )
					.sorted(Comparator.comparing(l -> l.id))
					.collect(Collectors.toList());
				
		filteredList.forEach(l -> System.out.println(l.id +" "+l.name));
	}

}
