package com.validatelink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_Register_Validate_link {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com";
		driver = new ChromeDriver();
		driver.get(url);
		String expected_url = driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		System.out.println("The url address of register element is :"+expected_url);
		driver.findElement(By.linkText("REGISTER")).click();
		String actual_url = driver.getCurrentUrl();
		System.out.println("The actual url is:" +actual_url);
		if(actual_url.equals(expected_url))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.quit();

	}

}
