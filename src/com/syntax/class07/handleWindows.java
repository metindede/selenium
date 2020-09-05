package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWindows {

	public static String url = "http://accounts.google.com/signup";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		String mainPageHandle = driver.getWindowHandle();
		System.out.println(mainPageHandle);
		WebElement helpLink = driver.findElement(By.linkText("Help"));
		helpLink.click();

		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles.size());
		Iterator<String> it = allWindowHandles.iterator();
		mainPageHandle = it.next();
		String childHandle = it.next();
		System.out.println(childHandle);
		Thread.sleep(2000);
		driver.switchTo().window(mainPageHandle);

		driver.quit();

	}

}