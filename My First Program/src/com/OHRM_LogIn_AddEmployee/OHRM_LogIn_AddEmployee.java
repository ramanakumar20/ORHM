package com.OHRM_LogIn_AddEmployee;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_LogIn_AddEmployee 
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
	@Test(priority =0)
	public void LoginIn() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\Exceloperation\\OHRM_Validation_Details_AddEmployee.xlsx");
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
		
			FileOutputStream file1= new FileOutputStream(".\\src\\com\\ExcelOperation_Result\\OHRM_Validation_Details_AddEmployee.xlsx");
		
			workbook.write(file1);
			driver.navigate().back();
		}
		driver.findElement(By.name("txtUserName")).clear();
		}
	
		@Test(priority=1)
		public void AddEmployee() throws IOException
		
		{
			FileInputStream file = new 
			FileInputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\Exceloperation\\OHRM_Login_Validation_Input_Details.xlsx");
			XSSFWorkbook workbook =  new XSSFWorkbook(file);
			XSSFSheet sheet1 = workbook.getSheet("Sheet1");
			Row r=sheet1.getRow(1);
			
			driver.findElement(By.name("txtUserName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.name("Submit")).click();
			
			FileInputStream file1 = new 
			FileInputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\Exceloperation\\OHRM_AddEmployee_Input_Details.xlsx");
			XSSFWorkbook workbook1 =  new XSSFWorkbook(file1);
			XSSFSheet sheet2 = workbook1.getSheet("Sheet1");
			WebElement frame=driver.findElement(By.xpath("//*[@id='rightMenu']"));
			driver.switchTo().frame(frame);
			
			int rowcount_emp = sheet2.getLastRowNum();
			for(int i=1;i<=rowcount_emp;i++)
			{
				driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
				Row r1=sheet2.getRow(i);
				driver.findElement(By.id("txtEmpLastName")).sendKeys(r1.getCell(0).getStringCellValue());
				driver.findElement(By.name("txtEmpFirstName")).sendKeys(r1.getCell(1).getStringCellValue());
				driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
				driver.findElement(By.className("backbutton")).click();
				
				/*WebElement element=driver.findElement(By.linkText("PIM"));
				Actions action=new Actions(driver);
				action.moveToElement(element).perform();
				driver.findElement(By.linkText("Add Employee")).click();
				driver.findElement(By.name("txtEmpLastName")).sendKeys(r1.getCell(0).getStringCellValue());;
				driver.findElement(By.name("txtEmpFirstName")).sendKeys(r1.getCell(1).getStringCellValue());
				driver.findElement(By.className("savebutton")).click();*/
				
		
				String emp_lstnam=driver.findElement(By.partialLinkText(r1.getCell(1).getStringCellValue())).getText();
				String input_lstnam=r1.getCell(1).getStringCellValue();
				if(emp_lstnam.contains(input_lstnam))
				{
					System.out.println(r1.getCell(1).getStringCellValue()+" :Added to the list");
					r1.createCell(2).setCellValue("Added to list successfully");
				}
				else
				{
					System.out.println(r1.getCell(1).getStringCellValue()+" :Not Added to the list");
					r1.createCell(2).setCellValue("Not Added to list ");
				}
					
				FileOutputStream file_output = new FileOutputStream(".\\src\\com\\ExcelOperation_Result\\OHRM_Employee ADDED_Output.xlsx");
				workbook1.write(file_output);
			}
			}
		@AfterTest
		public void tearDown()
		{
			driver.quit();
			}
		}
		

