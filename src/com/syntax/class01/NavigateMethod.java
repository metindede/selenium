package com.syntax.class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		Thread.sleep(3000);
		//driver.navigate().to("http://facebook.com");
//		driver.navigate().back();
//		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(3000);
		//driver.manage().window().maximize();
		driver.close();
		//driver.quit();
	}

}