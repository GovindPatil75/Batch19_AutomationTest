package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest_1 {

	public static void main(String[] args) throws Exception {

   
   // Browser Open
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
   driver.get("https://demo.guru99.com/test/newtours/register.php");
   driver.manage().window().maximize();
   
   //Element identify
   WebElement txt_FirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
   txt_FirstName.sendKeys(Library.getExcelTestData("Sheet1", 0, 0));
   
   Library.getScreenShot(driver);
   
   int data=Library.getAddition(10, 20);
   System.out.println(data);
   //Library.ScrollToElement(driver, txt_FirstName);
   
   //Library.HandleDropDown(txt_FirstName, "Text");
   
	}

}
