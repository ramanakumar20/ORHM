package com.get_page_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursHomePage {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com";
		driver = new ChromeDriver();
		driver.get(url);
		String WebPageText = driver.getPageSource();
		String expected_Element="livetech";
		if(WebPageText.contains(expected_Element))
		{
			System.out.println("Element is existing");
		}
		else
		{
			System.out.println("Element not exist");
		}
		driver.quit();
		

	}

}
