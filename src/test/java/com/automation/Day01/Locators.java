package com.automation.Day01;

public class Locators {

	public static void main(String[] args) {
		
		//To understand location of a WebElement, first we need to understand DOM
		
		// What is DOM?
		// Document Object Model
		
		//Total Locators in Selenium are 16.
		//We will learn 8 and just observe 5 --> So we will know about 13. 
		
		//8 most important locators in Selenium
		
		// 01. id
		// 02. className **(If the value is compound 'two value with a space', then By.ClassName will not work)
		// 03. name
		// 04. xpath
		// 05. cssSelector
		// 06. linkText
		// 07. partial linkText
		// 08. tagName
		
// <a href="https://mail.rediff.com/cgi-bin/login.cgi" title="Already a user? Sign in" class="signin">Sign in</a>

		// 'a' is the html tag
		
		// attributes are:
		
			// 'href' --> only present for "link". The value is the url of that link.
			// 'title'
			// 'class'
		
		// Values of attributes are:
		
		// for 'href'	--> https://mail.rediff.com/cgi-bin/login.cgi
		// for 'title'	--> Already a user? Sign in
		// for 'class'	--> signin
	}

}
