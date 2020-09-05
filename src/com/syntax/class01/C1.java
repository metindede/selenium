package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1 {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println("page title is " +title);
		
		
		
		driver.get("http://www.amazon.com");
		
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		
		String title1= driver.getTitle();
		System.out.println(title1);
}
}
		
		
		
		
		
		
	