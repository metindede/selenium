package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleDynamicTable {
	public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
		username.sendKeys("Tester");
		WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
		password.sendKeys("test");
		WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
		loginButton.click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'ctl00_MainContent_orderGrid']/tbody/tr"));
		System.out.println("Number of rows " + rows.size());
		
		for(int i = 1; i < rows.size(); i++) {
			String rowText = rows.get(i).getText();
			System.out.println(rowText);
			
			if(rowText.contains("FamilyAlbum")) {
				driver.findElements(By.xpath("//table[@id = 'ctl00_MainContent_orderGrid']/tbody/tr/td[1]")).get(i-1).click();
				//break;
			}
		}
	
	}

}