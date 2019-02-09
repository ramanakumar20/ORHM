package facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Faceboo_loginTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url = "http://facebook.com";
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.findElement(By.id("email")).sendKeys("ramanakumar20@gmail.com");
		Actions hello = new Actions(driver);
		hello.sendKeys(Keys.TAB).perform();
		hello.sendKeys("Vanisri2824431!").perform();
		hello.sendKeys(Keys.ENTER).perform();
		
		driver.quit();

	}

}

