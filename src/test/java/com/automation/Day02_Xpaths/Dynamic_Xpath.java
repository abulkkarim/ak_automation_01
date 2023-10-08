package com.automation.Day02_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	
	// There are 8 different syntaxes for Dynamic Xpath.
	
	// There are certain functions which can be used in Dynamic Xpath. 
	
	// There are certain keywords which can be used in Dynamic Xpath.
	
	// Dynamic Xpath is also known as "Relative Xpath" or "Customized Xpath" as it is customized by
	// the Automation Tester. 
	
	//What is the Catch in writing Xpath?
	//Make sure the Xpath is 1 of 1 in the Chrome Browser Editor. --> to make sure it is unique. 
	//How will we open the Chrome Browser Editior?
	//Chrome Browser Editor is the space where we write Xpath. To open that, we need to follow below steps:
	
		//Right click on a "WebElement" and click on "Inspect".
		//Simply press "Ctrl+F" on keyboard.
		//Editior will open. It will display "Find by string, selector, or Xpath".
		//Follow any of the below syntax and write the Xpath.
		// After writing the Xpath, it will display "1 of 1" on right-hand side.
	
	
	// Syntax 1: (for some element which has single attributes)
	// example --> //htmltag[@attribute = 'valueoftheattribute'] 
	// explained below:
	
		// First type "//" (two forward slash). 
		// Determine the "html" tag of that particular WebElement.
		// Type "[" (start third bracket).
		// Type "@" sign (at the rate sign).
		// Choose an "attribute" (first choose "id", then "className" and at last "name").
		// Keep an space and type "=" (equal sign). 
		// Type "'" (start single quote). 
		// Type "value of that attribute" (get the value of the attribute from inspect). 
		// Type "'" (end single quote). 
		// Type "]" (end third bracket).
	
	// Syntax 2: (for some element which has multiple attributes)
	// example --> //htmltag[@attribute1 = 'value1' and @attribute2 = 'value2']
	
	// Syntax 3: (for some element which has multiple attributes) --> same like 2
	// example --> //htmltag[@attribute1 = 'value1' or @attribute2 = 'value2']

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tutorialsninjaLogin();

	}
	
	public static void tutorialsninjaLogin (){
		
						
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			
			//using "Dynamic Xpath" here also :)
			driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda1@gmail.com");
			driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
					
			//Now need to on "Login" button. 
			// Login button I can't use "By.className" because it is compounded value and it will not work. 
			// Dynamic Xpath will work here. 
			// When inspect an element, one line will be selected. Right click on that line --> copy -->
			// "Copy full Xpath". Open notepad and paste it there. Then write below code
				
			driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
				
				
		}

}
