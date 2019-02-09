package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_Register_Country_DisplayingCountryNames {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url ="http://newtours.demoaut.com";
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.partialLinkText("REGI")).click();
		WebElement country= driver.findElement(By.name("country"));
		List<WebElement>countries=country.findElements(By.tagName("option"));		
		int countriesCount=countries.size();
		System.out.println("The total number of countries are :"+countriesCount);
		for(int i=0;i<countriesCount;i++)
		{
			String countryName = countries .get(i).getText();
			System.out.println(i+ " "+countryName);
		}
		
		driver.close();

	}

}
