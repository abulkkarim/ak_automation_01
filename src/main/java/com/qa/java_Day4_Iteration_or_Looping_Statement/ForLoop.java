package com.qa.java_Day4_Iteration_or_Looping_Statement;

public class ForLoop {
	
	// in one go, write --> the initialization ; condition ; increment/decrement {
	//logic}
	
	public static void main(String[] args) {
		
		//print1to4();
		//print1to100();
		//print100to1();
		//print5to500InMultiplesof10AndAddTheMultiples();
		printFirst20multiplesOf9andAddThoseMultiples();
	}
	
	public static void print1to4 (){
	//   seq 1 -> seq 2  seq 4
			for (int a=1; a<=10; a++) {
				System.out.println("Hello World"); //logic inside the body is seq 3
			}
	}
	
	public static void print1to100 (){
		
				for (int b=1; b<=100; b++) {
					System.out.println(b);
					//System.out.print(b + " "); 
				}
		}
	
	public static void print100to1 (){
		int sum=0;
		for (int c=100; c>=1; c--) {
			System.out.println(c);
			sum=sum+c;
		}
		System.out.println("total of print100to1 is: "+sum);
}

	public static void print5to500InMultiplesof10AndAddTheMultiples (){
		//5, 15, 25....495
		int sum=0;
		for (int d=5; d<=500; d=d+10) {
			System.out.println(d);
			sum=sum+d;
		}
		System.out.println("total of print100to1 is: "+sum);
}
	
	public static void printFirst20multiplesOf9andAddThoseMultiples (){
		//9, 18, 27....180
		int sum=0;
		for (int e=9; e<=180; e=e+9) {
			System.out.println(e);
			sum=sum+e;
		}
		System.out.println("total of print100to1 is: "+sum);
}
	
}
