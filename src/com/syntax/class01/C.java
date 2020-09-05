package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {

public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.navigate().to("http://facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(3000);
		
		
		driver.navigate().refresh();
		
		driver.close(); // close only current tab
		driver.quit(); // quit from browser
}
}
