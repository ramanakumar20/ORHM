package facebbokloginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbloginTest {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\driver files\\chromedriver.exe");
		String url ="http://facebook.com";
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("ramanakumar20@gmail.com");
		driver.findElement(By.xpath("//*[@class='inputtext' and @name = 'pass']")).sendKeys("Vansisri2824431@");
	}

}
