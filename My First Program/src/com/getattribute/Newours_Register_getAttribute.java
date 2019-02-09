package com.getattribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newours_Register_getAttribute {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		driver = new ChromeDriver();
		driver.get(url);
		String register_url = driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		System.out.println("The url address of register element is :"+register_url);
		driver.quit();
		

	}

}
