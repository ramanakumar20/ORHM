package com.OHRM_LogIn;

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

public class OHRM_LogInTest 
{
	WebDriver driver = null;
	String url="http://localhost/orangehrm/orangehrm-2.6/login.php";
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void LoginIn() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\Exceloperation\\OHRM_Login_Details.xlsx");
		XSSFWorkbook workbook =  new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			Row r=sheet.getRow(i);
			driver.findElement(By.name("txtUserName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.name("Submit")).click();
			String expected_Title="OrangeHRM";
			System.out.println("The expected Title is:"+ expected_Title);
			String actualTitle=driver.getTitle();
			System.out.println("The actual title is:"+actualTitle );
			if(actualTitle.equals(expected_Title))
			{
				System.out.println("Login successful-PASS");
				r.createCell(2).setCellValue("Login successful-PASS");
				
			}
			else
			{
				System.out.println("Login Failed--Fail");
				r.createCell(2).setCellValue("Login Failed--Fail");
			}
			FileOutputStream file1= new FileOutputStream(".\\src\\com\\ExcelOperation_Result\\OHRM_Login_Details.xlsx");
		
			workbook.write(file1);
			driver.navigate().back();
		}
	}@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
		
		
	}

