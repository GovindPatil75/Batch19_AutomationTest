package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Library {
	
	public static void ScrollToElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	
	public static void getScreenShot(WebDriver driver) throws Exception {
		String RM=RandomString.make(5); //abc  abc34
		TakesScreenshot ts= (TakesScreenshot) driver; //(TakesScreenshot)driver <==WebDriver driver=new ChromeDriver();
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch19_AutomationTest\\"+RM+".png");
		FileUtils.copyFile(src, destn);
	}
	
	public static String getExcelTestData(String SheetName,int row,int cell) throws Exception {
		
		String pathExcel="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch19_AutomationTest\\TestData\\Data.xlsx";
		// Create Object of Fileinputstream class
		FileInputStream fis=new FileInputStream(pathExcel);
		
		//XSSFWorkbook create Object
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	}
	
	public static void HandleDropDown(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public static int getAddition(int a,int b) {
		
		int c=a+b;
		return c;
	}
	
   public static int getAddition(int a,int b,int d) {
		
		int c=a+b+d;
		return c;
	}
}
