package com.automation.Day02_MoreOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLogin {

	public static void main(String[] args) {
		
		rediffLogin();
		
	}
		
		public static void rediffLogin (){
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rediff.com");
			driver.findElement(By.className("signin")).click();
			driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.id("password")).sendKeys("Selenium@123");
			driver.findElement(By.className("signinbtn")).click();
			driver.findElement(By.className("rd_logout")).click();
			driver.quit();
			
		}
		
public static void tutorialsninjaLogin (){
	
	//seleniumpanda1@gmail.com		Selenium@123
	//seleniumpanda2@gmail.com		Selenium@123
	//seleniumpanda3@gmail.com		Selenium@123
	//seleniumpanda4@gmail.com		Selenium@123
	//seleniumpanda5@gmail.com		Selenium@123
	//......
	//seleniumpanda25@gmail.com		Selenium@123
	
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
			
			//Now need to on "Login" button. 
			//Login button I can't use "By.className" because it is compounded value and it will not work. 
			// Xpath & cssSelector will work here. 
			
			
		}
		
		
	}

