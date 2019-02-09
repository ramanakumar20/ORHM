package facebookLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\driver files\\geckodriver.exe");
		WebDriver driver = null;
		driver = new FirefoxDriver();
		String url = "http://facebook.com";
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("ramanakumar20@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Vanisri2824431!");
		driver.findElement(By.id("Log In")).click();
		//<input value="Log In" aria-label="Log In" 
			//	data-testid="royal_login_button" type="submit" id="u_0_2">

	}
}


