package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataTest_2 {

	public static void main(String[] args) throws Exception {
		
		String pathExcel="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch19_AutomationTest\\TestData\\Data.xlsx";
		// Create Object of Fileinputstream class
		FileInputStream fis=new FileInputStream(pathExcel);
		
		//XSSFWorkbook create Object
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		// read data -String
		String data_0_0=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue(); // 0, 0 -->
		System.out.println(data_0_0);
		
		//read data -Numeric 
		double data_0_1=wb.getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue(); // 0,1 --->
		
		String data=String.valueOf(data_0_1);
		System.out.println(data);
		
		String data1=data.replace(".", "").replace("E7", "");
		System.out.println(data1);

		//System.out.println(data_0_1);
	}

}
