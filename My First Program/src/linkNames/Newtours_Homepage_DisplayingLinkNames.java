package linkNames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

public class Newtours_Homepage_DisplayingLinkNames {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com";
		driver = new ChromeDriver();
		driver.get(url);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linkscount=links.size();
		System.out.println("The total number of lilnks on newtours homepage:"+linkscount);
		for(int k=0;k<linkscount;k++)
		{
			String linkName=links.get(k).getText();
			System.out.println(k+" "+linkName);
		}
		driver.quit();
		
	}

}


