package link_count;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_Homepage_Linkscount {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\driver files\\chromedriver.exe");
		String url = "http://newtours.demoaut.com";
		driver = new ChromeDriver();
		driver.get(url);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linkscount=links.size();
		System.out.println("The number of links on newtours homepage are :"+linkscount);
		driver.quit();

	}

}
