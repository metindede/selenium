package com.syntax.class04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XXpa {

	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
				WebElement username = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
				username.sendKeys("Admin");
				WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
				password.sendKeys("Hum@nhrm123");
				WebElement loginButton = driver.findElement(By.xpath("//input[@value = 'LOGIN']"));
				loginButton.click();
				WebElement logo = driver.findElement(By.xpath("//img[@alt = 'OrangeHRM']"));
				if (logo.isDisplayed()) {
					System.out.println("Logo is displayed");
				} else {
					System.out.println("Logo is not displayed");
					}
			}}
				