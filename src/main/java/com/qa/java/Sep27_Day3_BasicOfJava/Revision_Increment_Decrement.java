package com.qa.java.Sep27_Day3_BasicOfJava;

public class Revision_Increment_Decrement {

	public static void main(String[] args) {
		int i=1;
		int j=i++;
		
		System.out.println("Value of 'i' is: "+i);
		System.out.println("Value of 'j' is: "+j);
		
		
		int k=1;
		int l=++k;
		
		System.out.println("Value of 'k' is: "+k);
		System.out.println("Value of 'l' is: "+l);
		
		
		int m=1;
		int n=--m;
		
		System.out.println("Value of 'm' is: "+m);
		System.out.println("Value of 'n' is: "+n);
		
		int o=1;
		int p=--o + o++;
		
		System.out.println("Value of 'o' is: "+o);
		System.out.println("Value of 'p' is: "+p);

	}

}
