package com.qa.java.Sep27_Day3_ControlStatements;

public class Concepts_Of_Control_Statements {

	public static void main(String[] args) {
			
			//Control Statements in Java
			
			// 01. Selection or Conditional Statements
			
				// if, if-else, if-else-if, nested if, switch
			
			
			// 02. Iteration or Looping Statements
			
				// while, for loop, do while loop, advanced for loop, nested for loop, for loop in while loop
			
			// 03. Jump Statements
			
				// break, continue, return

			//ifControlStatement();
			//ifelseControlStatement ();
			//ifelseifControlStatement();
			determineWhetherThisNumberIsEvenOrOdd();
		}
		
		public static void ifControlStatement() {
			if(200>100) {
				System.out.println("my logic is correct");
			}
		}
		
			public static void ifelseControlStatement() {
				if(2 == 4) {
					System.out.println("my logic is correct");
							}
				else {
					System.out.println("The above condition is dead code");
				}
			}
			
			
			public static void ifelseifControlStatement() {
					int i=1;
					int j=2;
					int k=3;
					//I want to determine the largest number from there 3 numbers 
					
					if (i<k && i>j) {
						System.out.println("i is the largest");
					}
					else if (j>i && j>k) {
						System.out.println("j is the largest");
					}
					else {
						System.out.println("k is the largest");
					}
			}
					
					 
			public static void determineWhetherThisNumberIsEvenOrOdd() {
					int l=102;
					int m=307;
					int n=88;
					//I want to determine which number is odd and even	
						
					if (l%2 == 0) {
							System.out.println("l is even number");
						}
						else {
							System.out.println("l is odd number");
						}
					if (m%2 == 0) {
						System.out.println("m is even number");
					}
					else {
						System.out.println("m is odd number");
					}
					if (n%2 == 0) {
						System.out.println("n is even number");
					}
					else {
						System.out.println("n is odd number");
					}

	}

}
