package com.capturingURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingRL_Facebook {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver","C://Users//rparv_000//workspace//My First Program//Driver files//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("http://facebook.com");
		 String actual_URl = driver.getCurrentUrl();
		 String actual_title = driver.getTitle();
		 System.out.println("The title of the facebook home page is:" +actual_title);
		 System.out.println("The Url of the facebook home page is:" +actual_URl);
		 driver.quit();

	}

}
