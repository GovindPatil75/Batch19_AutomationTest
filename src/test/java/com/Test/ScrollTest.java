package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTest {

	public static void main(String[] args) throws Exception {

     WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://demo.guru99.com/test/newtours/register.php");
     driver.manage().window().maximize();
     
     //Scroll Pixel
     
     JavascriptExecutor js=driver;
     // top -bottom 
     js.executeScript("window.scrollBy(0,600)", "");
     
     Thread.sleep(3000); // 3 sec
     // bottom -top
     js.executeScript("window.scrollBy(0,-600)", "");
     
     //WebElement -Scroll
     
     WebElement btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
     Thread.sleep(3000); // 3 sec
     
     js.executeScript("arguments[0].scrollIntoView()", btn_submit);
     
     // Library.ScrollToElement(driver,btn_submit);
     //Library.getScreenShot(driver);

	}

	
	
}
