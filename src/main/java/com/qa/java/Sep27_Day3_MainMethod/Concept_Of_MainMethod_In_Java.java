package com.qa.java.Sep27_Day3_MainMethod;

public class Concept_Of_MainMethod_In_Java {

	public static void main(String[] args) {
			
			// main method will be the center of execution
			// main method will be always be static because it is related at a Class level
			// main method can be overloaded
			// main method will be have the public access modifier
			//main method's nomenclature cannot be changed 
			
			System.out.println("This is the main method");
			logic1();
			
			// logic2(); --> To call this method we will need to create an object for this class
			// 'Concept_Of_MainMethod_In_Java'. Like as below way
			// Concept_Of_MainMethod_In_Java ref = new Concept_Of_MainMethod_In_Java;
			// now using the object ('ref') we can call the non-static method (like below way). This it will work
			// ref.logic2();
			

		}
		
		public static void logic1() {
			//I have a very good logic here
			
			System.out.println("We are learing java");
			
		//public void logic2() {
		//		System.out.println("Hola");
		//	}

	}

}
