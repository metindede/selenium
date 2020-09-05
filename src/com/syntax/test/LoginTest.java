package com.syntax.test;

import com.syntax.Utils.BaseClass;
import com.syntax.pages.LoginPage;

public class LoginTest {

	public static void main(String[] args) {
		BaseClass.setUp();
		LoginPage loginPage = new LoginPage();
		
		loginPage.username.sendKeys("Admin");
		loginPage.password.sendKeys("Hum@nhrm123");
		loginPage.loginButton.click();
		
		BaseClass.tearDown();
	}

}
