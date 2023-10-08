package com.qa.java.Sep25_Day2_BasicOfJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opening_Multiple_Tabs_In_Same_Browser {

	public static void main(String[] args) {
	
		// open different website in different tab
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://amazon.com");
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://google.com");
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://flipkart.com");
				
				// open website in different window
				driver.switchTo().newWindow(WindowType.WINDOW);
				driver.get("https://costco.com");


	}

}
