package com.RadioButton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EchoEcho_RadioButtontest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url="http://www.echoecho.com/htmlforms10.htm";
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement radioButtonsBlock = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
		List<WebElement>radioButtons=radioButtons=radioButtonsBlock.findElements(By.name("group1"));
		System.out.println(radioButtons.size());
		for(int i=0;i<radioButtons.size();i++)
		{
			radioButtons.get(i).click();
			for(int k=0;k<i;k++)
			{
			System.out.println(radioButtons.get(k).getAttribute("checked")+" "+radioButtons.get(k).getAttribute("value"));
			
			}
			
			
		}
		
		driver.close();
		
		

	}

}
