package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_5 {

	public static void main(String[] args) {
		
		//Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		// Identify Element --Relative XPath --> attribute 
		//tagname[@attributename='Value']
		
		//Email identify 
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Test@gmail.com");
		
		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_password.sendKeys("12345678");
		
		WebElement btn_login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		//btn_login.click();
		
		// Identify -- using text --> //tagname[text()='text value']
		
		WebElement forgotLink=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		forgotLink.click();
		
		WebElement SignUp=driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		
	}

}
