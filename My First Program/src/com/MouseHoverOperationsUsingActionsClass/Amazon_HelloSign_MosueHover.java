package com.MouseHoverOperationsUsingActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSign_MosueHover {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url="https://www.amazon.in/";
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement hellosignin=driver.findElement(By.id("nav-link-yourAccount"));
		//WebElement hellosignin=driver.findElement(By.className("nav-a nav-a-2"));
		//WebElement hellosignin= driver.findElement(By.className("nav-line-1"));
		Actions act= new Actions(driver);
		act.moveToElement(hellosignin).perform();
		driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[2]")).click();
		
		//driver.close();
		
	}

}
