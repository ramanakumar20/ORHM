package com.OHRMUploadingImage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImageUpload
{
	WebDriver driver = null;
	String url="http://localhost/orangehrm/orangehrm-2.6/login.php";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Test
	public void uploadingFile()
	{
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		//WebElement PIM=driver.findElement(By.className("drop current"));
		//Actions act = new Actions(driver);
		//act.moveToElement(PIM).perform();
		//driver.findElement(By.xpath("*[@id='pim']/a/span")).click();
		
		//*[@id="pim"]/ul/li[2]/a/span
		//*[@id="pim"]/ul/li[2]/a/span
		//driver.findElement(By.xpath("//*[@id='pim']/ul/li[2]/a/span")).click();
		//driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		driver.findElement(By.className("plainbtn plainbtnhov")).click();
		driver.findElement(By.id("photofile")).click();
		
		
		//driver.close();
	
		
		
	}

}
