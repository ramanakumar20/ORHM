package com.newtourstest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Country_Test {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\driver files\\chromedriver.exe");
		WebDriver driver = null;
		String url ="http://newtours.demoaut.com";
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.partialLinkText("REGI")).click();
		WebElement country= driver.findElement(By.name("country"));
		List<WebElement>countries=country.findElements(By.tagName("option"));		
		int countriesCount=countries.size();
		System.out.println("The total number of countries are :"+countriesCount);
		FileInputStream file = new FileInputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\Exceloperation\\Export Data from NewTours.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("sheet1");
		for(int i=0;i<countriesCount;i++)
		{
			String countryName = countries .get(i).getText();
			System.out.println(i+ " "+countryName);
			Row r=sheet.createRow(i);
			Cell c=r.createCell(0);
			c.setCellValue(countryName);
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\Exceloperation\\Export Data from NewTours.xlsx");
			workBook.write(file1);
		}
		
		driver.close();

	}

}
