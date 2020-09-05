package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunhBrowser {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",  "drivers/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	Thread.sleep(100);
//	String url=driver.getCurrentUrl();
//	System.out.println(url);
//	String title=driver.getTitle();
//	System.out.println(title);
	driver.navigate().refresh();
	driver.close();
	

}
}
