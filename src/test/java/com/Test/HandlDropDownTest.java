package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlDropDownTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// drop Down handle 

		WebElement Drp_Country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select select=new Select(Drp_Country);
		
		// Select - selectByIndex 
		select.selectByIndex(10);
		
		//selectvisibletext
		select.selectByVisibleText("BAHAMAS");
		
		//SelectByValue
		select.selectByValue("BELGIUM");
		
		
		// DeopDOwn ---> Options --> count
		
		List<WebElement> list=select.getOptions();
		
		System.out.println(list.size()); //264
		
		for(int i=0;i<list.size();i++) {
			
			String textOption=list.get(i).getText();
			System.out.println(textOption);
			
			if(textOption.equals("CUBA")) {
				list.get(i).click();
				break;
			}
		}
		
		
		
		
	}

}
