package jquery_DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url = "https://jqueryui.com/droppable/";
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions act = new Actions(driver);
		WebElement drag_element=driver.findElement(By.id("draggable"));
		WebElement drop_element=driver.findElement(By.id("droppable"));
		act.dragAndDrop(drag_element, drop_element).perform();
		driver.switchTo().defaultContent();
		 
		 
		

	}

}
