package com.syntax.class10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightAndDoubleClickDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		Actions action = new Actions(driver);
		action.contextClick(rightClickButton).perform();
		WebElement edit = driver.findElement(By.xpath("//span[text() = 'Edit']"));
		action.click(edit).perform();
		//Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement dblClickButton = driver.findElement(By.xpath("//button[@ondblclick = 'myFunction()']"));
		action.doubleClick(dblClickButton).perform();
		System.out.println(alert.getText());
		alert.accept();
	}
}