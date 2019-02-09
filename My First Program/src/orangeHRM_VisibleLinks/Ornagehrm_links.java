package orangeHRM_VisibleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ornagehrm_links {

	public static void main(String[] args)
	{
		WebDriver driver =null;
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\driver files\\chromedriver.exe");	
	
	driver = new ChromeDriver();
	//String url="https://opensource-demo.orangehrmlive.com/";
	String url="https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
	driver.get(url);
	
	//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	//driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	//driver.findElement(By.id("btnLogin")).click();
	//String Login_text=driver.findElement(By.id("Welcome Admin")).getText();
	//System.out.println(Login_text);
	
	List<WebElement>links=driver.findElements(By.tagName("a"));
	int linkscount=links.size();
	System.out.println("The total number of links are:"+linkscount);
	for(int p =0;p<linkscount;p++)
	{
		if(links.get(p).isDisplayed())
		{
			String LinkName =links.get(p).getText();
			System.out.println(p+" "+LinkName);
	}
	driver.quit();
	}

	}
	}
