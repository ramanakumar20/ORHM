package validateTitile;


import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_Facebook {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C://Users//rparv_000//workspace//My First Program//Driver files//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		String expected_Title ="facebook";
		System.out.println("The Expected title of facebook home page is:" + expected_Title);
		String actual_Title = driver.getTitle();
		System.out.println("The title of facebook homepage is :" + actual_Title);
		if(actual_Title.equals(expected_Title))
		{
			System.out.println("The title matched -Pass");
			
		}
		else
			System.out.println("The title mismatch : fail");
		driver.quit();
		
	}
}
