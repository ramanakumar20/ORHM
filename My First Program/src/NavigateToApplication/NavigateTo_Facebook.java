package NavigateToApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo_Facebook
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C://Users//rparv_000//workspace//My First Program//Driver files//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		

	}

}
