package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskImplicitWait {
	public static String url = "http://www.uitestpractice.com/Students/Contact";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement link = driver.findElement(By.linkText("This is a Ajax link"));
		link.click();
		WebElement paragraph = driver.findElement(By.className("ContactUs"));
		String text = paragraph.getText();
		System.out.println(text);

		driver.close();
	}

}