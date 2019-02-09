package pom.NewTours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursHomePageTest
{
	WebDriver driver = null;
	String url="http://newtours.demoaut.com";
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void homePageTest()
	{
		WelcomeMercuryTours wmt = PageFactory.initElements(driver,WelcomeMercuryTours.class);
		wmt.signon();
		driver.navigate().back();
		wmt.logIN("tutorial","tutorial");
		driver.quit();
		}
	

}