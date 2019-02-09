package com.ExcelTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_SingleData {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream(".\\src\\com\\Exceloperation\\Excel_ReadOperation_Singlw TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Row r=sheet.getRow(0);
		Cell cell=r.getCell(0);
		String data=cell.getStringCellValue();
		System.out.println(data);
	}

}
