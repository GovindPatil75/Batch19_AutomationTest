package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionHandleTest {

	public static void main(String[] args) throws Exception {

     WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.google.co.in/");
     driver.manage().window().maximize();
     
     // Identify Search Field Element
     WebElement SearchField=driver.findElement(By.xpath("//textarea[@name='q']")); //1
     SearchField.sendKeys("maven");
     
     Thread.sleep(3000) ; // 3 sec
     List<WebElement> list=driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li")); // 10

     System.out.println(list.size()); //10
     
     for(int i=0;i<list.size();i++) {
    	 
    	 String text=list.get(i).getText();
    	 
    	 System.out.println(text);
    	 
    	 if(text.equals("maven dependency")) {
    		 list.get(i).click();
    		 break;
    	 }
    	 
     }
	}

}
