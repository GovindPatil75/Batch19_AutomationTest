package com.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenshotTest {

	public static void main(String[] args) throws Exception {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Screenshot of full page 
		String RM=RandomString.make(5); //abc  abc34
		
		TakesScreenshot ts= driver; //(TakesScreenshot)driver <==WebDriver driver=new ChromeDriver();
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch19_AutomationTest\\"+RM+".png");
		FileUtils.copyFile(src, destn);
		
		// Element /Section Screenshot
		
		WebElement logoFB=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		File src1=logoFB.getScreenshotAs(OutputType.FILE);
		File destn1=new File("C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch19_AutomationTest\\Logo.png");
		FileUtils.copyFile(src1, destn1);

	}

}
