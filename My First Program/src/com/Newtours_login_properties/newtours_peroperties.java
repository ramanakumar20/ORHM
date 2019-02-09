package com.Newtours_login_properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newtours_peroperties
{

	WebDriver driver = null;
	String url="http://newtours.demoaut.com";
	
@BeforeTest
public void setup()
{	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@Test
public void login() throws IOException
{
	FileInputStream file = new FileInputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\Exceloperation\\NewTours_LoginDetails_properties.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	//FileInputStream file1 = new FileInputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\newtours.properties");
	//Properties pr=new Properties();
	//pr.load(file1);
	int rowcoount=sheet.getLastRowNum();
	for(int i=1;i<=rowcoount;i++)
	{
		Row r=sheet.getRow(i);
		driver.findElement(By.name(("userName"))).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name(("password"))).sendKeys(r.getCell(1).getStringCellValue());
		driver.findElement(By.name(("login"))).click();
		String expectedTitle="find";
		System.out.println("The expeted title is:"+expectedTitle);
		String actualTitle=driver.getTitle();
		System.out.println("The actual title is :"+actualTitle);
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("Login successful===pass");
			r.createCell(2).setCellValue("login successful--pass");
			
		}
		else
		{
			System.out.println("Login unsuccesful===fail");
			r.createCell(2).setCellValue("login unsuccessful====fail");
		}
		FileOutputStream file2 = new FileOutputStream(".\\src\\com\\ExcelOperation_Result\\Newtours_PropertiesResult.xlsx");
		workbook.write(file2);
	driver.navigate().back();

}
driver.quit();
}}
