package signinElement_googlehomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google_signin_click {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url="http://google.com";
		driver = new ChromeDriver();
		driver.get(url);
		//driver.findElement(By.className("gb_P")).click();
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.id("gb_70")).click();
		//driver.findElement(By.partialLinkText("Sign")).click();
		WebElement SignIn = driver.findElement(By.partialLinkText("Sign"));
		SignIn.click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		 

	}

}
