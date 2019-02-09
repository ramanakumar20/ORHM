package com.capturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingTitle_Facebook {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C://Users//rparv_000//workspace//My First Program//Driver files//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		String actual_title = driver.getTitle();
		System.out.println("The title of facebook home page is:" + actual_title);
		driver.quit();

	}

}
