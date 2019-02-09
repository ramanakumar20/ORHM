package com.OHRM_ReadData_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData_Excel_OHRM {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url="http://localhost/orangehrm/orangehrm-2.6/login.php";
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		FileInputStream file = new FileInputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\Exceloperation\\Login_Details_OHRM.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		Row r=sheet.getRow(1);
		
		
		driver.findElement(By.name("txtUserName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
		driver.findElement(By.name("Submit")).click();
	
		
		String expected_Title = "OrangeHRM";
		System.out.println("the expected title is :"+ expected_Title);
		String actual_Title = driver.getTitle();
		System.out.println("the actual title is :"+ actual_Title );
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("Login successful---PASS");
			Row q=sheet.createRow(1);
			Cell h=q.createCell(2);
			h.setCellValue("Pass");
		}
		else
		{
			System.out.println("Login failed--- FAIL");
			Row q=sheet.createRow(1);
			Cell h=q.createCell(2);
			h.setCellValue("Fail");
		}
		FileOutputStream file1 = new FileOutputStream(".\\src\\com\\Exceloperation\\Login_Details.xlsx");
		workBook.write(file1);		
		
driver.quit();
	}

}
