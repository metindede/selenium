package com.syntax.class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	/**
	 * 1. launch the chrome browser
	 * 2. navigate to amazon.com 
	 * 3. print out the title and the url in the console 
	 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}