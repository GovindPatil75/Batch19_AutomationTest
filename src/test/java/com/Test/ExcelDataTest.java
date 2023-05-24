package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataTest {

	public static void main(String[] args) throws Exception {

     String path="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch19_AutomationTest\\TestData\\Data.xlsx";
     
     // create Object of Fileinputstream class
     FileInputStream fis=new FileInputStream(path);
     
     //create object fo XSSFWorkbook class
     XSSFWorkbook wb=new XSSFWorkbook(fis);
     
     String data_0_0=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
     
     System.out.println(data_0_0);
     
     String data_0_1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
     
     System.out.println(data_0_1);
     
     // Browser Open
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
     
     // Identify Element 
     WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
     txt_email.sendKeys(data_0_0);
     
     WebElement txt_password=driver.findElement(By.xpath("//input[@name='pass']"));
     txt_password.sendKeys(data_0_1);
     
	}

}
