package com.automation.Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderStanding_HowSeleniumWorks {

	public static void main(String[] args) {
		// every laptop is a Client
		// we write the Selenium code with OOP language of our choice in the Client
		// this code interact with the Server of the Application we want to use.
		// The Application is in the form of a website
		// So to interact with that application we need a browser
		// Selenium+OOP language code interacts with the drivers of that browser which in turn interacts 
		// with the Browser
		// finally we see the outcome in the browser as a UI (User Interface). 
		
		// Selenium is an API library
		
		WebDriver driver = new ChromeDriver ();
		// row number 20 opens a blank Chrome Browser
		// 'WebDriver' interface asking it's reference 'driver' to point to the object of ('ChromeDriver') class
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://makemytrip.com");
		driver.quit();

	}

}
