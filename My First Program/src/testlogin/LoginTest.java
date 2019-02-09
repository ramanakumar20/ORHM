package testlogin;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		String url = "http://newtours.demoaut.com";
		driver.get(url);
		driver.findElement(By.name("Username")).sendKeys("tutorial");
		driver.findElement(By.name("Password")).sendKeys("tutorial");
		driver.findElement(By.name("Sign-In")).click();
		String expected_Title = "find";
		System.out.println("the expected title is :"+ expected_Title);
		String actual_Title = driver.getTitle();
		System.out.println("the actual title is :"+ actual_Title );
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("Login successful---PASS");
			
		}
		else
		{
			System.out.println("Login failed--- FAIL");
			
		}
		driver.quit();

	}

}
