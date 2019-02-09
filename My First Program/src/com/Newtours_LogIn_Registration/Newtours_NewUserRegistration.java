package com.Newtours_LogIn_Registration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtours_NewUserRegistration 
{	
	WebDriver driver = null;
	String url="http://newtours.demoaut.com";

@BeforeTest
public void setup()
{
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
@Test(priority=0)
public void register()
{
	driver.findElement(By.linkText("REGISTER")).click();
	}
@Test(priority=1)
public void NewuserRegistration() throws IOException
{
	FileInputStream file = new FileInputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\Exceloperation\\Newtours_NewUser_Registration_Input_Details.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	int rowcount=sheet.getLastRowNum();
	for(int k=1;k<=rowcount;k++)
	{
		Row r=sheet.getRow(k);
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		double d=r.getCell(2).getNumericCellValue();
		long x=(long)d;
		String phonenumber=Long.toString(x);
		driver.findElement(By.name("phone")).sendKeys(phonenumber);
		driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		double p=r.getCell(7).getNumericCellValue();
		long q=(long)p;
		String postalcode=Long.toString(q);
		driver.findElement(By.name("postalCode")).sendKeys(postalcode);
		driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		driver.findElement(By.id("email")).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		driver.findElement(By.name("register")).click();
		String expected_username=r.getCell(9).getStringCellValue();
		System.out.println("The expected username is:"+expected_username);
		String actual_registered_username=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println("The registered username is:"+actual_registered_username);
		
		if(actual_registered_username.contains(expected_username))
		{
		System.out.println("user registration successful--Pass");
		r.createCell(12).setCellValue("user registration successful");
		
		}
	else
	{
		System.out.println("User registration unsuccessful----fail");
		r.createCell(12).setCellValue("user registration unsuccessful----fail");
	
		}
		
		FileOutputStream file1= new FileOutputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\ExcelOperation_Result\\Newtours_UserRegistration_Result.xlsx");
		workBook.write(file1);
		driver.navigate().back();
	}
	}
		@AfterTest()
		public void tearDown()
		{
			driver.quit();
			}
		}


