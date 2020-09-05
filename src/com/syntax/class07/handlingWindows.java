package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWindows {
	public static String url = "http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		String mainPageHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		WebElement instaButton = driver.findElement(By.linkText("Follow On Instagram"));
		WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
		WebElement instAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));
		instaButton.click();
		fbButton.click();
		instAndFbButton.click();

		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles.size());
		Iterator<String> it = allWindowHandles.iterator();
		while(it.hasNext()) {
			String childHandle = it.next();
			if(!childHandle.equals(mainPageHandle)) { 
				driver.switchTo().window(childHandle);
				System.out.println(driver.getTitle());
				driver.close();
			}

		}
		driver.switchTo().window(mainPageHandle);
		instaButton.click();
	}

}