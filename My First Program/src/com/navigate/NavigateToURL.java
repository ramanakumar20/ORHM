package com.navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToURL {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver","C://Users//rparv_000//workspace//My First Program//Driver files//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("http://facebook.com");
		 String expected_URl = "facebook.com";
		 System.out.println("The expected URl of the facebook home page is:" + expected_URl);
		 String actual_URl = driver .getCurrentUrl();
		 String actual_title = driver.getTitle();
		 System.out.println("The title of the facebook homepage is:" +actual_title);
		 System.out.println("The current url of the facebook homepage is :" + actual_title);
		 if(actual_URl.contains(expected_URl))
		 {
			 System.out.println("Successful navigated to facebook-pass");
			 
		 }
		 else
		 {
			 System.out.println("Failed to navigate to facebook: fail");
			 
		 }
		 
		 driver.quit();

	}

}

