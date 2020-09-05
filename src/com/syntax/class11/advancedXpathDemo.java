package com.syntax.class11;
/**
 * Advanced xpath is based on parent and child, sibling relationships
 * 
 * example: identifying the element by its following sibling
 * //label[@id = 'nav-search-label']/following-sibling::input
 * //input[@id = 'calFromDate']/following-sibling::img
 * 
 * example: identifying the element by its preceding sibling 
 * //span[text() = '& Orders']/preceding-sibling::span
 * 
 * example: identifying the element by its parent 
 * //span[text() = '& Orders']/parent::a
 * 
 * example: identifying the element by its ancestor
 * //input[@id = 'calFromDate']/ancestor::form
 * 
 * example: identifying the element by its following sibling index
 * //div[@id = 'divPassword']/following-sibling::div[2]
 * 
 * 
 * <li> --> list
 * <ol> --> ordered list
 * <ul> --> unordered list
 * <div> --> division 
 * <img> --> image 
 * <p> --> paragraph
 * <h> --> header
 */
//break till 8:30pm

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class advancedXpathDemo {
	public static String url = "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login";


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		username.sendKeys("Admin");
		password.sendKeys("Hum@nhrm123");
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor=‘red'",password);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", loginButton);
		driver.quit();
	}
}