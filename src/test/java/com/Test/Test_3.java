package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 {

	public static void main(String[] args) {

     // Browser Open
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		// identify WebElement -- Id
		
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("Test@gmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("12345678");
		
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.click();
		
		// Name --->
		
		WebElement emial1=driver.findElement(By.name("email"));
		emial1.sendKeys("Test");
		

	}

}
