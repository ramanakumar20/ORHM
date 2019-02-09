package com.POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_HomePage_Testing

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
	@Test
	public void homepage() throws IOException
	{
		WelcomeMercuryTours wmt = PageFactory.initElements(driver,WelcomeMercuryTours.class);
		wmt.signon();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		wmt.register();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		FileInputStream file = new FileInputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\Exceloperation\\NewTours_LoginDetails_POM.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		for(int i=1;i<rowcount;i++)
		{
			Row r=sheet.getRow(i);
			wmt.logIn(r.getCell(0).getStringCellValue(),r.getCell(1).getStringCellValue());
			wmt.logIn("tutorial","tutorial");
			String expected_Title="Find";	
			System.out.println("The expected title is:"+expected_Title);
			String actual_Title=driver.getTitle();
			System.out.println("The actual title is"+actual_Title);
			if(expected_Title.contains(actual_Title))
			{
				System.out.println("Login Successful-PASS");
				r.createCell(2).setCellValue("Login successful-PASS");
				
			}
			else
			{
				System.out.println("Login Unsuccessful-Fail");
				r.createCell(2).setCellValue("Login unsuccessful-Fail");
				driver.navigate().back();
			}
			FileOutputStream file2 = new FileOutputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\ExcelOperation_Result\\POM.xlsx");
			workbook.write(file2);
		}
		driver.quit();
	}

		
	

}
