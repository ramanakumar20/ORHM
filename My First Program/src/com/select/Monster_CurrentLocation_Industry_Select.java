package com.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monster_CurrentLocation_Industry_Select {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
	WebDriver driver = null;
	String url ="https://my.monsterindia.com/sponsered-popup.html";
	driver = new ChromeDriver();
	driver.get(url);
	//WebElement currentLocation = driver.findElement(By.className("select2-input"));
	//=currentLocation.findElements(By.tagName(""))
	
	

	}

}
