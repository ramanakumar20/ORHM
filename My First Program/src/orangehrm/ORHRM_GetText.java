package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORHRM_GetText {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		String url="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		driver.get(url);

	}

}
