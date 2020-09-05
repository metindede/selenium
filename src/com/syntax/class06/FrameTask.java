package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTask {
	
	public static String url = "http://166.62.36.207/syntaxpractice/bootstrap-iframe.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.switchTo().frame("FrameOne");
		WebElement logo = driver.findElement(By.id("hide"));
		boolean isLogoDisplayed = logo.isDisplayed();
		System.out.println("Is logo displayed? " + isLogoDisplayed);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		WebElement enrollTodayButton = driver.findElement(By.cssSelector("a[class = 'enroll-btn']"));
		boolean isButtonEnabled = enrollTodayButton.isEnabled();
		System.out.println("Is enroll today button enabled? " + isButtonEnabled);
		
	}

}
