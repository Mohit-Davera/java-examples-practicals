package com.simformsolutions.practicals.keywordstatic;
 class First {
	static String greet = "Java Static";
	static
	{
		System.out.println("Hello World");
	}
	static void greeting() {
		System.out.println("Good Morning");
	}

}
class Main
{
	public static void main(String[] args)
	{
		System.out.println(First.greet);
		First.greeting();
	}
}
