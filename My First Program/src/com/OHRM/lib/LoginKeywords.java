package com.OHRM.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginKeywords 
{	
	WebDriver driver = null;
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	public void navigate()
	{
		driver.get("http://localhost/orangehrm/orangehrm-2.6/login.php");
	}
	public void enterUsername()
	{
		driver.findElement(By.id("txtUserName")).sendKeys("admin");
	}
	public void enterPassword()
	{
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin");
	}
	public void clicklogin()
	{
		driver.findElement(By.name("Submit")).click();
		String expectedText="Welcome Admin";
		System.out.println("The expected tect after login is:"+expectedText);
		String actualText = driver.findElement(By.id("Welcome")).getText();
		System.out.println(actualText);
	if(actualText.equals(expectedText))
	{
		System.out.println("login successful--pass");
		
		}
	else
	{
		System.out.println("login unseccesful---fail");
	}
	}
	}
	
