package com.automation.Day02_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

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
				driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
				driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
				
				//Now need to on "Login" button. 
				// Login button I can't use "By.className" because it is compounded value and it will not work. 
				// Absolute Xpath will work here. 
				// When inspect an element, one line will be selected. Right click on that line --> copy -->
				// "Copy full Xpath". Open notepad and paste it there. Then write below code
				
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
				
				
			}

}
