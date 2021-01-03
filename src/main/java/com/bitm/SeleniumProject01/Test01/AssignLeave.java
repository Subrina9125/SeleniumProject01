package com.bitm.SeleniumProject01.Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bitm.SeleniumProject01.Utils01.DriverManager;
import com.bitm.SeleniumProject01.Utils01.WebElementXpathUtils.assignmodule;

public class AssignLeave {
	
private WebDriver driver = null;
	
	@Test
	public void assignLeaveTest()
	{
		driver = DriverManager.driver;
		driver.findElement(By.xpath(assignmodule.assignBtn)).click();
	}

}
