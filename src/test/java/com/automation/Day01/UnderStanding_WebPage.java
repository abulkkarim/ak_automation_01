package com.automation.Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderStanding_WebPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		//WebElement signinLink = driver.findElement(By.className("signin"));
		//signinLink.click();
		
		
		
		driver.findElement(By.linkText("Create Account")).click();
		//driver.findElement(By.className("signin")).click();
		
		//WebElement usernameTextBox = driver.findElement(By.id("login1"));
		//usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		//WebElement passwordTextBox = driver.findElement(By.name("passwd"));
		//passwordTextBox.sendKeys("Selenium@123");
		
		driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
		
		//WebElement loginButton = driver.findElement(By.className("signinbtn"));
		//loginButton.click();
		
		driver.findElement(By.className("signinbtn")).click();
		
		//WebElement logoutButton = driver.findElement(By.className("rd_logout"));
		//logoutButton.click();
		
		driver.findElement(By.className("rd_logout")).click();
		
		
		
		
	}

}
