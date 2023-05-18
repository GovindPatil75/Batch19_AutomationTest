package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_6 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Identify element 
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Test");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("12345678");
		
		WebElement btnlogin=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")); // contains --> attribute
		//btnlogin.click();
		
		WebElement forgottenpassword=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")); //contains--> text

		forgottenpassword.click();
		
		
	}

}
