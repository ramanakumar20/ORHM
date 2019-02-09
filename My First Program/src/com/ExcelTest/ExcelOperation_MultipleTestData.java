package com.ExcelTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation_MultipleTestData {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\rparv_000\\workspace\\My First Program\\src\\com\\Exceloperation\\Excel_ReadOperations_MultipleTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			Row r=sheet.getRow(i);
			int cellcount =r.getLastCellNum();
			for(int k=0;k<cellcount;k++)
			{
				String data=r.getCell(k).getStringCellValue();
				System.out.print(data+" ");
			}
		System.out.println();
		
		}
		


	}

}
