package com.isselected;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtours_Isselected {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com";
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.partialLinkText("REGI")).click();
		WebElement country = driver.findElement(By.name("country"));
		List<WebElement>countries = country.findElements(By.tagName("option"));
		int countriescount = countries.size();
		System.out.println("The totl number of countries are :"+countriescount);
		for(int i=0;i<countriescount;i++)
		{
			countries.get(i).click();
			if(countries.get(i).isSelected())
			{
				System.out.println("is active");
			}
			else
			{
				System.out.println("is inactive");
			}
			String countryName = countries.get(i).getText();
			System.out.println(i+" "+countryName);
		}
		driver.quit();
	}

}
