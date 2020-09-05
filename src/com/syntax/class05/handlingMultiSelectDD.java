package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingMultiSelectDD {

	public static String url = "http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement multiSelectDD = driver.findElement(By.id("multi-select"));
		Select select = new Select(multiSelectDD);
		boolean isMultiple = select.isMultiple();
		System.out.println(isMultiple);
		if(isMultiple) {
//			select.selectByIndex(1);
//			select.selectByVisibleText("New York");
			
			List<WebElement> options = select.getOptions();
			for (WebElement option : options) {
				String text = option.getText();
				select.selectByVisibleText(text);
				Thread.sleep(1000);
			}
			
			//select.deselectAll();
			select.deselectByIndex(5);
		}
	}

}