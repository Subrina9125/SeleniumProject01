package com.bitm.SeleniumProject01.Utils01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	static {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\SELENIUM\\chromedriver_win32\\chromedriver.exe");

	}

	public static WebDriver driver = new ChromeDriver();

	DriverManager() {

	}
}
