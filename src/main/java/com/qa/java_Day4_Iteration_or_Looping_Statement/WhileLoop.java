package com.qa.java_Day4_Iteration_or_Looping_Statement;

public class WhileLoop {

	public static void main(String[] args) {
		
		//initialize something
		//then give an expression/condition in the While body
		//write the logic
		//increment or decrement as per logic
		
		// While loop is repeated 'if loop'
		// when the number of iteration is infinite it is advised to use 'while loop'
		
		/*int i =1; // Initialization
		
		while(i<6) { // test expression or condition
			System.out.println("Hello World");
			i++; //iteration statement*/
		//print1to10();
		//print10to1();
		//print1to10AndAdd1to10();
		//print5to100InTheMultiplesOf5AndAddThoseMultiples();
		//print100to5InTheDecresingMultiplesOf5AndAddThoseMultiples();
		//print1to4andAdd();
		print4to1andAdd();
		}
		
		public static void print1to10(){
			
			int i=1;
			while(i<=10) {
				System.out.println("Value of i is: "+i);
				i++;
			}
		}
		
		public static void print10to1(){
			
			int j=10;
			while(j>=1) {
				System.out.println("Value of j is: "+j);
				j--;
							}
			}
		
		public static void print1to10AndAdd1to10(){
			int k=1;
			int sum = 0;
			while(k<=10) {
				System.out.println("Value of k is: "+k);
				sum=sum+k;
				k++;
			}
			
			System.out.println("The total sum of 1to10AndAdd1to10 is: "+sum );
			
		}
			
		public static void print5to100InTheMultiplesOf5AndAddThoseMultiples(){
				//5,10,15,20,...100
				//5+10+15+20...+100 = sum
			
			int l = 5;
			int sum = 0;
			while (l<=100) {
				System.out.println(l);
				sum = sum+l;
				l=l+5;
				
			}
			
			System.out.println("The total sum of 5to100InTheMultiplesOf5AndAddThoseMultiples: "+sum );
				
				}
		
		public static void print100to5InTheDecresingMultiplesOf5AndAddThoseMultiples(){
				//100,95,90,85,....5
				//100+95+90+85....+5 = sum
			
			int m = 100;
			int sum = 0;
			while (m>=5) {
				System.out.println(m);
				sum = sum+m;
				m=m-5;
				
			}
			
			System.out.println("The total sum of 5to100InTheMultiplesOf5AndAddThoseMultiples: "+sum );
			
			
			
		}
			
		public static void print1to4andAdd(){
			//1,2,3,4
			
		
		int o = 1;
		int sum = 0;
		while (o<=4) {
			System.out.println(o);
			sum=sum+o;
			o++;
								
		}
		
		System.out.println("1+2+3+4 = "+sum );
	
		
		
	}
		
		public static void print4to1andAdd(){
			//1,2,3,4
			
		
		int p = 4;
		int sum = 0;
		while (p>=1) {
			System.out.println(p);
			sum=sum+p;
			p--;
								
		}
		
		System.out.println("1+2+3+4 = "+sum );
	
		
		
	}
			
		}
			
		
			
		
	


