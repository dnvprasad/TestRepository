package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FilelibClass {
	
	public String getpropertyfileKeyValue(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./TestData/commonData.properties");
		
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;	
		
	}
	
	public String getExcelData(String sheetName,int rowNum,int colNum) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./TestData/TestScriptData.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cel=row.getCell(colNum);
		String value=cel.getStringCellValue();
		return value;		
	}
	
	public void setExcelData(String sheetName,int rowNum,int colNum,String text) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./TestData/TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cel=row.createCell(colNum);
		cel.setCellValue(text);
		
		FileOutputStream fos=new FileOutputStream("./TestData/TestScriptData.xlsx");
		wb.write(fos);
		wb.close();	
		
	}

}
