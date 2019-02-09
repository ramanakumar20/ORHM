package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Gmail_click {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\driver files\\chromedriver.exe");
	WebDriver driver = null;
	String url = "http://google.com";
	driver = new ChromeDriver();
	driver.get(url);
	
	
	driver.findElement(By.className("gb_P")).click();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.quit();

	}

}
