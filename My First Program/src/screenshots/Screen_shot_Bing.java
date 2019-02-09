package screenshots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screen_shot_Bing {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url = "http://bing.com";
		driver = new ChromeDriver();
		driver.get(url);
		//File((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
		//File.Utils.CopyFile(bing_Screenshot),new File("C:\\Users\\rparv_000\\workspace\\My First Program\\Screenshot);
		//File bing_Screenshot((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
		//FileUtils.copyFile(bing_Screenshot,new File("C:\\Users\\rparv_000\\workspace\\My First Program\\Screenshot.png");
		
		

	}

}
