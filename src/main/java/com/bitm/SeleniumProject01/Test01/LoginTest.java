package com.bitm.SeleniumProject01.Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import com.bitm.SeleniumProject01.Utils01.DriverManager;
import com.bitm.SeleniumProject01.Utils01.URLTextUtils.URL;
import com.bitm.SeleniumProject01.Utils01.WebElementXpathUtils.loginmodule;

@Test
public class LoginTest {
	private WebDriver driver = null;

	public void logintest() {
		driver = DriverManager.driver;
		driver.get(URL.baseUrl);
		driver.findElement(By.xpath(loginmodule.username)).sendKeys("Admin");
		driver.findElement(By.xpath(loginmodule.password)).sendKeys("admin123");
		driver.findElement(By.id(loginmodule.LoginBtn)).click();
		System.out.println("Logged in Successfully");
	}
	

}
