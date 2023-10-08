package com.qa.java.Sep23_Day1_BasicOfJava;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class MyFirstSeleniumCode_01 {

		public static void main(String[] args) throws InterruptedException {
			

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//textarea[@name='q']")).click();
			driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("cricket");
			for (int i=1; i<=6; i++) {
				driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys (Keys.DOWN);
				Thread.sleep(3000);
			}
			
			driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys (Keys.ENTER);
			driver.quit();
			
			WebDriver driver1 = new FirefoxDriver();
			driver1.manage().window().maximize();
			driver1.get("https://rediff.com");


		}

	}


