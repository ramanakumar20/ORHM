package com.firefoxAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAutomation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\driver files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.quit();

	}

}
